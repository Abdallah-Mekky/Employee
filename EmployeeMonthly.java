package employee.s.project;

public class EmployeeMonthly extends Employee  {
   
  protected double Monthly_Salary; 
  
  public EmployeeMonthly(String N, String A, double M){
  super(N, A);
  this.Monthly_Salary=M; 
  }

    public void setMonthly_Salary(double Monthly) {
        if(Monthly>0){
        this.Monthly_Salary = Monthly;}
        
        
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
  
    public double yearlySala(double Monthly_salary){
    return Monthly_salary*12;
    }
    
   
    public double Raise(double Monthly_salary){
Monthly_salary = Monthly_salary +(Monthly_salary*0.1);
    return yearlySala(Monthly_salary);
    }
    

    @Override
    public String toString() {
        
        return super.toString()+   "Monthly_Salary Is " + Monthly_Salary + '}';
    }
  
    
}
