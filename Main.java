package employee.s.project;

import java.util.Scanner;

public class EmployeeSProject {

    public static void main(String[] args) {
      String Name,Address;
      double Monthly_Salary,Daily_Salary;
      int choice;
      
        Scanner S= new Scanner(System.in);
        
        System.out.println("Please, Enter Your Name ");
        Name=S.next();
        System.out.println("Please, Enter Your Address ");
        Address=S.next();
        
        System.out.println("");
        System.out.println("Please Select A Category");
        System.out.println("");
        System.out.println("Please Enter Your Choise:"
                            + " \n 1 To Monthly Salary"
                            + " \n 2 To Daily Salary  ");
        choice=S.nextInt();
        switch(choice){
        
            case 1:
                System.out.println("Please, Enter Your Monthly Salary");
                Monthly_Salary=S.nextDouble();
                EmployeeMonthly M1=new EmployeeMonthly(Name, Address, Monthly_Salary);
                M1.yearlySala(Monthly_Salary);
                M1.Raise(Monthly_Salary);
                System.out.println(M1.toString());
                M1.Raise(Monthly_Salary);
                break;
            case 2:
                System.out.println("Please, Enter Your Daily Salary");
                
                Daily_Salary=S.nextDouble();
                EmployeeDaily   D1=new EmployeeDaily(Name, Address, Daily_Salary);
                D1.yearlySala(Daily_Salary);
                D1.Raise(Daily_Salary);
                System.out.println(D1.toString());
                D1.Raise(Daily_Salary);
                
                break;
            default:
                System.out.println("This category does not exist");
        }}}
