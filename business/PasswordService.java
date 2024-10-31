package business;

import data.Password;
import data.PasswordRepository;

import java.util.List;

public class PasswordService {
    private PasswordRepository repository;

    public PasswordService() {
        this.repository = new PasswordRepository();
    }

    public void addPassword(String serviceName, String password) {
        repository.addPassword(serviceName, password);
    }

    public Password getPasswordById(int id) {
        return repository.getPasswordById(id);
    }

    public List<Password> getAllPasswords() {
        return repository.getAllPasswords();
    }

    public boolean updatePassword(int id, String newPassword) {
        return repository.updatePassword(id, newPassword);
    }

    public boolean deletePassword(int id) {
        return repository.deletePassword(id);
    }
}
