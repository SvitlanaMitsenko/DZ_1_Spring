package task4;

public class GoodUser {
    String name;
    String surname;
    IContact phoneOrEmail;

    public GoodUser(String name, String surname,  IContact phoneOrEmail){
        this.name = name;
        this.surname = surname;
        this.phoneOrEmail = phoneOrEmail;
    }

    @Override
    public String toString() {
        return "Ім'я " + name + ", прізвище " + surname + ", контакт " + phoneOrEmail.getContact();
}
}
