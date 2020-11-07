package emailapp;

public class EmailApp {
    public static void main(String[] args) {

        Email em1 = new Email();
        em1.setAlternateEmail("andrei.sas@icloud.com");
        System.out.println(em1.showInfo());
    }
}
