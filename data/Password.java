package data;

public class Password {
    private int id;
    private String serviceName;
    private String password;

    public Password(int id, String serviceName, String password) {
        this.id = id;
        this.serviceName = serviceName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Service: " + serviceName + ", Password: " + password;
    }
}
