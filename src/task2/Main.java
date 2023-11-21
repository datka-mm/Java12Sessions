package task2;

public class Main {

    public static void main(String[] args) {

        Contact contact1 = new Contact(123456789, "Aiturgan");
        Contact contact2 = new Contact(987654321, "Mederbek");
        Contact contact3 = new Contact(1234, "Myrzayim");

        Contact[] contacts = {contact1, contact2, contact3};

        Phone phone = new Phone("iPhone 15", "iPhone", "java12", contacts);

        phone.turnOn("java12");
        System.out.println("---------------------");
        System.out.println(phone.call("Aiturgan"));
        System.out.println("---------------------");
        System.out.println(phone.call(1234));
        System.out.println("---------------------");
        System.out.println(phone.searchContact("Mederbek"));


    }
}
