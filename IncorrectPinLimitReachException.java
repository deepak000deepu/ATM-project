package com.codegnan.customExceptions;


public class IncorrectPinLimitReachException extends Exception {
	public IncorrectPinLimitReachException(String errorMsg) {
		super(errorMsg);
	}

}

