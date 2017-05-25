//A simple program in which the user enter his choice(either Employee or Trainee).Then he enters number of year of experience.then the program shows the base salary of employee and travel allowance.I mainly focusd on this two attributes only because the main aim of this program is to give light on inheritance. 
import java.util.*;
class Employee{
      private String name=new String();
      private int age;
      private int bSalary;
      private int tAllowance;
         private void basicSalaryCalc(){

         }
           
             private void  travelAllowance(){
                       
             }
        
}

class Manager extends Employee{
      private String name=new String();
      private int age;
      private int x;//year of experience
      private int bSalary;//basic salary of manager
      private double tAllowance; 
         public void basicSalaryCalc(int x){//overrides basicSalaryCalc() function of employee
                 bSalary=x*10000;
                  System.out.println("the basic salary for a manager having "+ x+" year experience is"+bSalary);
                 travelAllowance(x);         
         }
           
             public void  travelAllowance(int x){//overrides travelAllowance() function of employee
                 tAllowance=(0.15*bSalary);
                 System.out.println("Travel allowance for a manager having "+ x+" year experience is"+tAllowance);
             }

}

class Trainee extends Employee{
      private String name=new String();
      private int age;
      private int x;//year of experience
      private int bSalary;//basic salary of trainee
      private double tAllowance; 
         public void basicSalaryCalc(int x){//overrides basicSalaryCalc() function of employee
                  bSalary=x*8000;
                  System.out.println("the basic salary for a manager having "+ x+" year experience is"+bSalary);
                  travelAllowance(x);
         }
           
             public void  travelAllowance(int x){//overrides travelAllowance() function of employee
                 tAllowance=(0.1)*bSalary;
                 System.out.println("Travel allowance for a manager having "+ x+" year experience is"+tAllowance);  
                   
             }
}

public class Assignment4d{

     public static void main(String []args){
         int x,cho;
         System.out.println("enter 1 for manager and 2 for trainee");
         Scanner sc=new Scanner(System.in);
         cho=sc.nextInt();//user enters his category
         System.out.println("enter years of experience");
         x=sc.nextInt();//user enters his year of experience
        
             if(cho==1){
                  Manager m=new Manager();
                  m.basicSalaryCalc(x);
              }
         
                else{
                   Trainee t=new Trainee();
                   t.basicSalaryCalc(x);
                  }
        
     }
}

