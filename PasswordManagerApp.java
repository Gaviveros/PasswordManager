import business.PasswordService;
import data.Password;

import java.util.Scanner;

public class PasswordManagerApp {
    public static void main(String[] args) {
        PasswordService passwordService = new PasswordService();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nGestor de Contraseñas:");
            System.out.println("1. Agregar Contraseña");
            System.out.println("2. Mostrar todas las Contraseñas");
            System.out.println("3. Actualizar Contraseña");
            System.out.println("4. Eliminar Contraseña");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Nombre del Servicio: ");
                    String serviceName = scanner.nextLine();
                    System.out.print("Contraseña: ");
                    String password = scanner.nextLine();
                    passwordService.addPassword(serviceName, password);
                    System.out.println("Contraseña agregada.");
                    break;

                case 2:
                    System.out.println("Lista de Contraseñas:");
                    for (Password pass : passwordService.getAllPasswords()) {
                        System.out.println(pass);
                    }
                    break;

                case 3:
                    System.out.print("ID de la contraseña a actualizar: ");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nueva Contraseña: ");
                    String newPassword = scanner.nextLine();
                    if (passwordService.updatePassword(idToUpdate, newPassword)) {
                        System.out.println("Contraseña actualizada.");
                    } else {
                        System.out.println("ID no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("ID de la contraseña a eliminar: ");
                    int idToDelete = scanner.nextInt();
                    scanner.nextLine();
                    if (passwordService.deletePassword(idToDelete)) {
                        System.out.println("Contraseña eliminada.");
                    } else {
                        System.out.println("ID no encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);

        scanner.close();
    }
}
