package baitap14;

public class TestMain {
    public static void main(String[] args) {

        Employee e1 = new Employee(27, "vinh", "phat", 3000);


        System.out.println(e1);

        System.out.println("Name: " + e1.getName());


        System.out.println("Monthly Salary: " + e1.getSalary());
        System.out.println("Annual Salary: " + e1.getAnnualSalary());


        int newSalary = e1.raiseSalary(10);
        System.out.println("After 10% raise, new salary: " + newSalary);

        System.out.println(e1);
    }
}
