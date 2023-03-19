public class Member {
    String name, phonenum, Address;
    int age, salary;

    public void name(String name) {
        System.out.println("Name: " + name);
    }

    public void age(int age) {
        System.out.println("Age: " + age);
    }

    public void phonenum(String phonenum) {
        System.out.println("Phone Number: " + phonenum);
    }

    public void add(String address) {
        System.out.println("Address: " + address);
    }

    public void printSalary(int salary) {

        System.out.println("Salary: " + salary);
    }
}
