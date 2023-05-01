package task4;

public class Main {
    public static void main(String[] args) {
        BadUser  badUser   = new BadUser("Петро", "Петренко", "0971112233");
        System.out.println(badUser.toString());
        GoodUser goodUser1 = new GoodUser("Іван", "Терещенко", new Phone("0981112233"));
        System.out.println(goodUser1.toString());
        GoodUser goodUser2 = new GoodUser("Андрій", "Kузьменко", new Email("andrii.kuzmenko@gmail.com"));
        System.out.println(goodUser2.toString());
    }
}
