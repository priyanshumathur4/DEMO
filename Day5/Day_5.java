import java.util.*;
class Address {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
class Employee {
    private String name;
    private int age;
    private Address address;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Address getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}

public class Day_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Address address = new Address();

        System.out.println("Enter street:");
        address.setStreet(sc.nextLine());

        System.out.println("Enter city:");
        address.setCity(sc.nextLine());

        System.out.println("Enter state:");
        address.setState(sc.nextLine());

        System.out.println("Enter postal code:");
        address.setPostalCode(sc.nextLine());

        Employee employee = new Employee();

        System.out.println("Enter employee name:");
        employee.setName(sc.nextLine());

        System.out.println("Enter employee age:");
        employee.setAge(sc.nextInt());
        sc.nextLine();

        employee.setAddress(address);

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee Address: " + employee.getAddress().getStreet() + ", " +
                employee.getAddress().getCity() + ", " +
                employee.getAddress().getState() + " " +
                employee.getAddress().getPostalCode());
    }
}