package employee.s.project;

public class EmployeeDaily extends Employee {

    private double Daily_Salary;

    public EmployeeDaily(String Na, String Add, double Da) {
        super(Na, Add);
        this.Daily_Salary = Da;
    }

    public void setName(String Na) {
        this.name = Na;
    }

    public void setDaily_Salary(double Daily) {
        if (Daily > 0) {
            this.Daily_Salary = Daily;
        }

    }

    public void setAddress(String Add) {
        this.address = Add;
    }

    public double getDaily_Salary() {
        return Daily_Salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double yearlySala(double Salary) {
        return Salary * 365;
    }

    public void Raise(double Salary) {
        double raise = (Salary * 0.05) + yearlySala(Salary);
        System.out.println("Your Yearly-Salary After Raise = " + raise);
    }

    @Override
    public String toString() {
        return super.toString() + "Daily_Salary Is " + Daily_Salary + '}';
    }

}
