package com.codegnan.interfaces;

import com.codegnan.customExceptions.InsufficientBalanceException;
import com.codegnan.customExceptions.InsufficientMachineBalanceException;
import com.codegnan.customExceptions.InvalidAmountException;
import com.codegnan.customExceptions.NotOperatorException;

public interface ATMService {
	//to get the user type,whether the user is operator or normal user
	public abstract String getUserType() throws NotOperatorException;
	//withdrawAmount
	//1.will throw invalidAmount exception if amount is not valid
	//2. will throw insufficientBalanceException if customer has insuffiecient amount in acc.
	//3. will throw insufficient machine balance exception if machine has insufficient cash.
	public abstract double withdrawAmount(double wthAmount)
		throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException;
	//to deposit amount
	public abstract void depositAmount(double deptAmount) throws InvalidAmountException;
	//to check balance
	public abstract double checkAccountBalance();
	//to change PIN Number
	public abstract void changePinNumber(int pinNumber);
	//get Pin Number
	public abstract int getPinNumber();
	//get username
	public abstract String getUserName();
	//to decrease no.of chances while entering wrong pin number
	public abstract void decreaseChances();
	//to get chances of pin Number
	public abstract int getChances();
	//to reset pin number chances by bank operator
	public abstract void resetPinChances();
	//to generate mini statement
	public abstract void generateMiniStatement();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
