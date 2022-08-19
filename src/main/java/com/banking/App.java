package com.banking;
import java.util.Scanner;
import static java.lang.System.*;
import com.banking.controller.bankController;
import com.banking.model.bankModel;

public class App 
{
    public static void main( String[] args )
    {
       
        bankController bc=new bankController(); //object for bank controller
        bankModel bm=new bankModel(); //object for bankModel
        
        Scanner Sc=new Scanner(System.in); //object for scanner class
        out.println("\t\t\t--------------Welcome to INDHU's Bank-------------");
        out.println("Enter Account Holder Name :");
        String accHolderName= Sc.next();
        bm.setAccHolderName(accHolderName);
        try {
			if(bc.checkUsername(bm)) { //It checks the Account holderName
				 
				    out.println("Enter password :");
			        String accPassword=Sc.next();
			        bm.setAccPassword(accPassword);
			        try {
			        	if(bc.checkPassword(bm))  //It checks the password
			        	{
			        		out.println("Enter Account Number :");
			        		int accNum=Sc.nextInt();
					        bm.setAccNum(accNum);
					        out.println("Enter Balance :");
					        int accBal=Sc.nextInt();
					        bm.setAccBal(accBal);
					        out.println("Check Your Details.......");
					        out.println(bm.toString());
					        out.println("Is This Your Details Then Go to Further Process OtherWise Contach The Branch Manager");
					       
					        int op=0;  //initial operation is 0
					        while(op<3) { //while loop for the operations
					        out.println("select Operation what do You want \n press 1 for Deposite \n Press 2 for WithDraw \n Press 3 for Exit");
					        op=Sc.nextInt();
					        switch(op) { //switch statement for operations
					        case 1-> {
					        	out.println("Enter password");
					        	String pwd=Sc.next();
					        	try {
					        	if(bc.todeposite(bm, pwd)) {
					        		out.println("Enter deposit amount");
					        		int newAmt=Sc.nextInt();
					        		bm.depositAmount(newAmt);
					        		out.println("Your Account Balance is :" +" " +bm.getAccBal());
					        	}
					        }
					        	catch(Exception e) 
					        	{
					        		out.println(e.getMessage());
					        	}
					        }
					        case 2->{
					        	out.println("Generate pin num");
					        	int pinnumber = Sc.nextInt();
								bm.setPinNumber(pinnumber);
					        	out.println("Enter PIN number");
					        	int newpin=Sc.nextInt();
					        	try {
					        		if(bc.towithDraw(bm, newpin)) {
					        			out.println("Enter withdraw amount");
					        			int newAmt=Sc.nextInt();
					        			bm.withDrawAmount(newAmt);
					        			out.println("Your Account Balance is:" +" "+bm.getAccBal());
					        		}
					        	}
					        	catch(Exception e) {
					        		out.println(e.getMessage());
					        	}
					        }
					        default -> System.exit(0);
					        }
					       
			        	}
			        }
			        }
			        
			        catch(Exception e) {
			        	out.println(e.getMessage());
			        }
			        	
			        }	        
			    
		} 
        catch (Exception e) 
        {
			
			out.println(e.getMessage());
			System.exit(0);
		}
        Sc.close();
   
    }
}

