public class Person {
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method that accepts a Person object as the parameter
    public void printCurrentInstance(Person person) {
        person.displayDetails();
    }

    public static void main(String[] args) {
        // Create an object of the Person class with your details
        Person personInstance = new Person("Caleb Kibet Maru", 20, "7128");

        // Use the object to call the printCurrentInstance method
        personInstance.printCurrentInstance(personInstance);
    }
}