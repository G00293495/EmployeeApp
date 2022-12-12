import java.net.IDN;
import java.util.Scanner;

     class Employee {

    String name;
    double ID;


    public Employee(String name, double ID){
        this.name = name;
        this.ID = ID;
    }


         public String empStat(){
        return "Name: " + name + "ID" + ID;
    }

    public static class MainEmployee{
        public static void main(String[] args) {
            Employee nub1 = new Employee("Paddy", 123456);
            System.out.println(nub1);
        }
    }

}
