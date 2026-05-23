package medium;
public class Contact {
    String name;
    String phoneNumber;
    String emailAddress;

    public Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public static void main(String[] args) {
        Contact contact1 = new Contact("abin", "123-456-7890", "Blabla@example.com");
        Contact contact2 = new Contact("ram", "098-767-8787", "Idk@gmail.com");

        if (!contact1.emailAddress.isEmpty()) {
            System.out.println("Name: " + contact1.name + ", Phone: " + contact1.phoneNumber + ", Email: " + contact1.emailAddress);
        }
        if (!contact2.emailAddress.isEmpty()) {
            System.out.println("Name: " + contact2.name + ", Phone: " + contact2.phoneNumber + ", Email: " + contact2.emailAddress);
        }

    }
}