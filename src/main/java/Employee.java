import java.util.Scanner;  // Import the Scanner class

class getReportDetails {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter name and ID");

        String name = myObj.nextLine();  // Read user input

        int iD = myObj.nextInt();

        System.out.println("Name: " + name);
        System.out.println("ID: " + iD);
    }
}


