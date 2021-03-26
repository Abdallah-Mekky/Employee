package employee.s.project;

public class EmployeeMonthly extends Employee {

    private double Monthly_Salary;

    public EmployeeMonthly(String N, String A, double M) {
        super(N, A);
        this.Monthly_Salary = M;
    }

    public void setMonthly_Salary(double Monthly) {
        if (Monthly > 0) {
            this.Monthly_Salary = Monthly;
        }

    }

    public void setName(String Na) {
        this.name = Na;
    }

    public void setAddress(String Add) {
        this.address = Add;
    }

    public double getMonthly_Salary() {
        return Monthly_Salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double yearlySala(double Salary) {
        return Salary * 12;
    }

    public void Raise(double Salary) {
        double raise = (Salary * 0.1) + yearlySala(Salary);
        System.out.println("Your Yearly-Salary After Raise = " + raise);
    }

    @Override
    public String toString() {

        return super.toString() + "Monthly_Salary Is " + Monthly_Salary + '}';
    }

}
