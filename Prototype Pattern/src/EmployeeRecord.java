public class EmployeeRecord implements Prototype {


    int id;
    String name;
    double salary;
    String address;

    EmployeeRecord() {
        System.out.println("Welcome to Oracle Corporation");
    }

    EmployeeRecord(EmployeeRecord target) {
        if (target != null) {
            this.id = target.id;
            this.name = target.name;
            this.salary = target.salary;
            this.address = target.address;
        }
    }

    void showRecord() {
        System.out.println(this.id + "\t" + this.name + "\t" + this.salary + "\t" + this.address);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(this);
    }
}
