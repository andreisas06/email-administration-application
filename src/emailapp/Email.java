package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;


    public Email(){
        this.firstName = askFirstName();
        this.lastName = askLastName();
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department - return department
        this.department = askForDepartment();
        System.out.println("Department: " + this.department);

        //Call method that creates random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        //Combine elements to form email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".company.com";
        System.out.println("Your email is: " + email);
    }


    private String askFirstName(){
        System.out.println("Please enter your first name: ");
        Scanner scanner = new Scanner(System.in);
        String fName= scanner.nextLine();
        return fName;
    }

    private String askLastName(){
        System.out.println("Please enter your last name: ");
        Scanner scanner = new Scanner(System.in);
        String lName = scanner.nextLine();
        return lName;
    }

    //Ask for department
    private String askForDepartment(){
        System.out.print("DEPARTMENT CODE\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
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
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i <length ; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //Set the mailboxCapacity

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    //Set alternateEmail

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //Change the password
    public  void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " +
                mailboxCapacity + "mb";
    }
}
