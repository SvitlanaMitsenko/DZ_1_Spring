package task4;

public class Email implements IContact {
    String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public String getContact() {
        return email;
    }
}
