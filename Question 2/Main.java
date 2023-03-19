public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.name("Morgan");
        emp1.age(26);
        emp1.phonenum("6758490675");
        emp1.add("76th WallsStreet");
        emp1.printSalary(756000);
        emp1.spec("Analyst");

        Manager mg1=new Manager();
        mg1.name("Chloe");
        mg1.age(34);
        mg1.phonenum("6453789067");
        mg1.add("64th Ravenclaw");
        mg1.printSalary(956700);
        mg1.Deps("Research and Development");
    }
}