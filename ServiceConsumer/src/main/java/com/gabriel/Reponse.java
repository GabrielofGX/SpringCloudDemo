package com.gabriel;

/**
 * @author gabriel
 * @Type Reponse
 * @Desc
 * @date 2018/12/6 17:45
 */
public class Reponse {
	private int code;
	private String message;


	public Reponse(int code, String message){
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}