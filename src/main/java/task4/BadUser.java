package task4;

public class BadUser {
    String name;
    String surname;
    Phone phone;

    public BadUser(String name, String surname, String phone){
        this.name = name;
        this.surname = surname;
        this.phone = new Phone(phone);
    }
    @Override
    public String toString() {
        return "Ім'я " + name + ", прізвище " + surname + ", контакт " + phone.getContact();
    }
}
