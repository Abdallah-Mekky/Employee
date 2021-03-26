package employee.s.project;

public abstract class Employee {

    protected String name;
    protected String address;

    public Employee(String N, String A) {
        this.name = N;
        this.address = A;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String Add) {
        this.address = Add;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" + "Name Is " + name + ", Address Is " + address + '}';
    }

    public abstract double yearlySala(double yearly_salary);

    public abstract void Raise(double Ra);
}
