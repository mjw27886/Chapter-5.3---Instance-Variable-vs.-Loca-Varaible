
import java.util.Scanner;


public class username {
	public static void main(String [] arges) {
		String username,username1,password,password1;
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Create your Username ");
		username = keyboard.next();
		
		System.out.println("Create your Password ");
		password = keyboard.next();
		
		System.out.println("You have successfully created account");
		
		System.out.println("To Login please enter your Username");
		username1 = keyboard.next();
		
		System.out.println("Password");
		password1 = keyboard.next();
		
		if (username.equals(username1) && password.equals(password1))
		{ System.out.println("Welcome " + username);
		
		}else 
			System.out.println("Sorry wrong username or password");
		
	}
}
