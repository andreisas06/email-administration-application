package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String pasword;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;


    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department - return department
    }


    //Ask for department
    private String askForDepartment(){
        System.out.print("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1){
            return "sales";
        } else if (depChoice == 2){
            return "dev";
        } else if (depChoice == 3){
            return "acct";
        } else {
            return "";
        }
    }
    //Generate random password

    //Set the mailboxCapacity

    //Set alternateEmail

    //Change the password



}
