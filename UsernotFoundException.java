package com.honey.in.exceptions;

public class UsernotFoundException extends Exception {

	/**
	 * @author sravanthi
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public UsernotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
