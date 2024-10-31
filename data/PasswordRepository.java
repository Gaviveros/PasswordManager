package data;

import java.util.ArrayList;
import java.util.List;

public class PasswordRepository {
    private List<Password> passwords;
    private int currentId;

    public PasswordRepository() {
        this.passwords = new ArrayList<>();
        this.currentId = 1;
    }

    public void addPassword(String serviceName, String password) {
        passwords.add(new Password(currentId++, serviceName, password));
    }

    public Password getPasswordById(int id) {
        return passwords.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Password> getAllPasswords() {
        return new ArrayList<>(passwords);
    }

    public boolean updatePassword(int id, String newPassword) {
        Password password = getPasswordById(id);
        if (password != null) {
            password.setPassword(newPassword);
            return true;
        }
        return false;
    }

    public boolean deletePassword(int id) {
        return passwords.removeIf(p -> p.getId() == id);
    }
}
