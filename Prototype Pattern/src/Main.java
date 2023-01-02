public class Main {
    public static void main(String[] args) {
        int empID = 100;
        String empName = "Ali";
        String empAdd = "Cairo";
        double empSalary = 1000;

        EmployeeRecord Emp1 = new EmployeeRecord();
        Emp1.id = empID;
        Emp1.name = empName;
        Emp1.address = empAdd;
        Emp1.salary = empSalary;

        Emp1.showRecord();
        System.out.println("\n");

        EmployeeRecord Emp2 = (EmployeeRecord) Emp1.getClone();
        Emp2.showRecord();
    }
}
