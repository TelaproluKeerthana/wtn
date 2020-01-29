package com.wipro.ccbill.exception;
public class InputValidationException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public InputValidationException()
	{
		super();
	}
	public InputValidationException(String err)
	{
		super(err);
	}
	@Override
	public String toString()
	{
		return "Invalid Input Data";
	}

}
