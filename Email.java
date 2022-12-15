package project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;

import project.Student;

public class Email extends MailInfo implements Wmail {
	ArrayList<MailInfo> userList = new ArrayList<MailInfo>();
	int index=0;
	  static InputStreamReader i = new InputStreamReader(System.in);
	  static BufferedReader input = new BufferedReader(i);
 
	 Email() {
		userList.add(new MailInfo("Edubridge123@gmail.com", 89798));
		userList.add(new MailInfo("programmer.jyoti123", 12345));
	}



	public void signupbyuser() throws IOException {
		
		 System.out.print("Enter your Username UserName@gmail.com:");
		 String User = input.readLine();
		 System.out.print("Password:");
		 int password =Integer.parseInt(input.readLine());
		
		 FileWriter fout=new FileWriter(User+"@gmail.com");
		    BufferedWriter bout=new BufferedWriter(fout);
		    PrintWriter pout=new PrintWriter(bout);
		    pout.println(password);
		    
		    FileWriter fot=new FileWriter(User);
		    BufferedWriter bot=new BufferedWriter(fot);
		    PrintWriter pot=new PrintWriter(bot);
		    
		    pout.close();
		    bout.close();
		    pot.close();
		    MailInfo s=new MailInfo(User, password);
			
			userList.add(s);

		    System.out.println("New ID created successfully!!");
		    System.out.println("==================================================================================================");
		    }
	
	 public void viewData() {
		 System.out.println("==================================================================================================");
		if(userList.size()==0) {
			System.out.println("No Records found");
		}else {
			for(MailInfo m :userList) {
				System.out.println("UserName:"+ m.getUser() +"Password:" + m.getPassword());
			}
		}
		 
		 
		 System.out.println("==================================================================================================");
		 
	 }
	 
	 
/*	 public void changePassword() throws IOException {
		  System.out.println("==================================================================================================");
		  System.out.println("Enter Username:");
		  String User1 = input.readLine();
		  int flag=0, index=0;
		  MailInfo m =null;
		  
		  for(MailInfo m1 : userList) {
			  if(m1.getUser() == User1) {
				  flag=1;
				  index = userList.indexOf(m1);
				   m = m1;
		    	   break;
		    	
			  }
		  }
		  
		  if(flag ==1 ) {
			  System.out.println("Enter New Password:");
			  int Password = Integer.parseInt(input.readLine());
			  m.setPassword(Password);
			  
			  
			  userList.add(index, m);
			  System.out.println("Password Successfully Updated!!");
		  }
		  else {
			  System.out.println("Records Can't Update Because User Not Exist");
		  }
		  
		  
		  System.out.println("==================================================================================================");
		}
	 */
	 
	 public void composemail() throws IOException {
	     System.out.println("==================================================================================================");
		    Calendar c=Calendar.getInstance();
		    
		    System.out.print("Username: ");
		    String User=input.readLine();
		    System.out.print("Password: ");
		    String password=input.readLine();
		    
		    FileReader fout=new FileReader(User+"@gmail.com");
		    BufferedReader bout=new BufferedReader(fout);
		    
		    String data=bout.readLine();
		    if(password.equals(data))
		    {
		    System.out.println("Logged On!");
		    
		    System.out.print("From:   ");
		    String From=input.readLine();
		    
		    System.out.print("To:   ");
		    String User1=input.readLine();
		    
		    System.out.println("");
		    System.out.print("\t Sub:");
		    String Sub = input.readLine();
		    System.out.println("");
		    System.out.println("Letter Content:");
		    String Body=input.readLine();
		    
		    FileWriter fin=new FileWriter(User1);
		    BufferedWriter bin=new BufferedWriter(fin);
		    PrintWriter pin=new PrintWriter(bin);
		    
		    System.out.println("");
		    
		
		    pin.println("From "+From+",");
		   
		    pin.println(" /t" +Sub);
		    pin.println(Body);
		    System.out.print("");
		    System.out.println("***Mail Has sent!****");
		    bout.close();
		    pin.close();
		    bin.close();
		    pin.close();
		    }
		    else
		    {
		    System.out.println("Wrong password!");
		    }
		  System.out.println("==================================================================================================");
		 	    	    
	 } 
	 
		 public void deletmail() {
	     System.out.println("==================================================================================================");

		if(userList.size()>0)
		{
			userList.clear();
			System.out.println("All records deleted successfully!!");
		}
		else
		{
			System.out.println("No record available!!");
		}
		System.out.println("==================================================================================================");
		    }
		    
	public static void main(String[] args) throws IOException {
	Email obj = new Email();
	
	System.out.println("==========================================Welcome User=========================================");
	String ch =null;
	do {
		System.out.println("---------------------------If you want to proced then choose of them------------------------- \r \n" + "\t "
				+ "1) SignUp \n" + "\t "
			    + "2) View Data \n" + 
				" \t 3) Compose \n" +
				" \t 4) DeletAllUser \n "+
				" \t 5) Exit \n ");
		System.out.println("================================================================================================");
		System.out.println("Enter your choice:");
	int choice = Integer.parseInt(input.readLine());
	switch(choice) {
	case 1: obj.signupbyuser();
	
		break;
		
	case 2: obj.viewData();
		break;
		
	case 3: obj.composemail();
		break;
	case 4:	obj.deletmail();
	    break;
	 default:System.out.println("Wrong choice!!"); 		   
    
	}
	
	System.out.println("Do you want to continue? (Y-Yes / N-No)");
	ch = input.readLine();
	
	}
	while(ch.equals("Yes")||ch.equals("Y"));
	System.out.println("================================================================================================");

	System.out.println("                Thankyou So much Happy to give you Services....       ");

	System.out.println("================================================================================================");
	
	}
	
}
