package GlobalTours.Auth;
import java.sql.SQLException;
import java.util.Scanner;
import GlobalTours.Models.User;
import GlobalTours.Auth.Register;
import GlobalTours.Auth.Login;
import GlobalTours.Util.DBConn;


public class Main {

    public static void main(String[]args) throws SQLException {
        Scanner scanner= new Scanner(System.in);
        while(true){
            System.out.println("Choose an option:");
            System.out.println("1.SignUp");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    User newUser= new User();
                    System.out.println("Enter your name:");
                    newUser.set_name(scanner.nextLine());
                    System.out.println("Enter your emailId:");
                    newUser.set_emailId(scanner.nextLine());
                    System.out.println("Enter the password");
                    newUser.set_password(scanner.nextLine());

                    Register reg = new Register();
                    if(reg.add(newUser) > 0) {
                        System.out.println("User registered successfully!");
                    } else {
                        System.out.println("Registration failed!");
                    }
                    break;

                case 2:
                    Login login=new Login();
                    System.out.println("Enter your emailId:");
                    String emailId=scanner.nextLine();
                    System.out.println("Enter the password:");
                    String password=scanner.nextLine();

                    if(login.authenticate(emailId,password)){
                        System.out.println("Login Successful!");
                        User loggedInUser = login.getUserDetails(emailId);
                        if (loggedInUser != null) {
                            System.out.println("Welcome " + loggedInUser.get_name() + "!");
                            System.out.println("Email ID: " + loggedInUser.get_emailId());
                        }
                    }else{
                        System.out.println("Login Failed!");
                    }
                    break;

                case 3:
                    System.out.println("Exited!");
                    scanner.close();
                    return;


                default:
                    System.out.println("Invalid choice! Please try again!");

            }
        }
    }
}
