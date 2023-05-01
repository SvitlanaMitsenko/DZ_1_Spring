package task4;

public class Phone implements IContact{
    String phone;

    public Phone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getContact() {
        return phone;
    }
}
