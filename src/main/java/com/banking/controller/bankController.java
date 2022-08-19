package com.banking.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import com.banking.model.bankModel;

public class bankController { 
	public boolean checkUsername(bankModel bm) throws IOException { //check for username
		String username=bm.getAccHolderName();
		if(Pattern.matches("[A-Za-z0-9]{5,13}", username)) { //check username with regex expression
			return true;
		}
		else {
			throw new IOException("UserName must be alphabets and digits"); //it will show exception
		}
	}
	
	public boolean checkPassword(bankModel bm) throws IOException {
		String password = bm.getAccPassword();
		if(Pattern.matches("^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$&*])" +"(?=\\S+$).{8}$", password)) { //This is for password pattern 
			return true;
		}
		else {
			throw new IOException("Password must be 8 charecters and atleast one special charecter and one lowecase letter and one digit");
		}
		
	}
	
	public boolean todeposite(bankModel bm, String pwd) throws IOException { //this is for deposit
		String password=bm.getAccPassword();
		if(pwd.equals(password)) {
			return true;
		}
		else {
			throw new IOException("password Invalid");
		}
		
	}
	public boolean towithDraw(bankModel bm, int pin ) throws IOException {   //this is for withdraw
		int newpin= bm.getPinNumber();
		if(pin == newpin) {
			return true;
		}
		else {
			throw new IOException("Invalid pin number");
		}
	}
	}


	
	


