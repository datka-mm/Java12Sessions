package task2;

public class Phone implements PhoneInterface {

    private String brand;
    private String name;
    private String password;
    private Contact[] contacts;

    public Phone(String brand, String name, String password, Contact[] contacts) {
        this.brand = brand;
        this.name = name;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public void turnOn(String password) {
        if (password.equals(this.password)) {
            System.out.println("Телефон жанды!");
        } else {
            System.out.println("Пароль туура эмес!");
        }
    }

    @Override
    public String call(String fullName) {
        for (int i = 0; i < this.contacts.length; i++) {
            if (fullName.equals(this.contacts[i].getFullName())) {
                return this.contacts[i].getFullName() + " " + this.contacts[i].getPhoneNumber() + " чалып жатасыз!";
            }
        }

        return "Мындай ат менен контакт жок!";
    }

    @Override
    public String call(long phoneNumber) {
        for (Contact contact : this.contacts) {
            if (contact.getPhoneNumber() == phoneNumber) {
                return contact.getPhoneNumber() + " " + contact.getFullName() + " чалып жатасыз!";
            }
        }

        return "Мындай номер жок";
    }

    @Override
    public Contact searchContact(String fullName) {
        for (Contact contact : this.contacts) {
            if (contact.getFullName().equals(fullName)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public String contactUpdateName(String oldName, String newName) {
        return null;
    }

    @Override
    public Contact[] getAllContact() {
        return new Contact[0];
    }
}
