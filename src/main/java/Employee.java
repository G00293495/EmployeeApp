import java.util.Scanner;  // Import the Scanner class

class Employee {
    String name;
    int id;

    Employee(int iD, String name) {
        this.name = name;
        this.id = id;
    }
}

class ShiftWorker extends Employee {
    int emp_payrollNum;
    int emp_salary;

    ShiftWorker(int id, String name, int salary, int payrollNum) {
        super(id, name);
        emp_payrollNum = payrollNum;
        emp_salary = salary;
    }


    void getReportDetails() {
        System.out.println("Employee ID     :  " + id);
        System.out.println("Employee Name   :  " + name);
        System.out.println("Employee PayRollNumber    :  " + emp_payrollNum);
        System.out.println("Employee Salary :  " + emp_salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Paddy Downey", 15.20, 22340);
        emp.getReportDeatils();
    }
}

