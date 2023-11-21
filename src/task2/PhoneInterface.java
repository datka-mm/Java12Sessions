package task2;

public interface PhoneInterface {

    void turnOn(String password);

    String call(String fullName);

    String call(long phoneNumber);

    Contact searchContact(String fullName);

    String contactUpdateName(String oldName, String newName);

    Contact[] getAllContact();
}
