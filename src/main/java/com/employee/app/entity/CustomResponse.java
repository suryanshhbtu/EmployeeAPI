package com.employee.app.entity;


public class CustomResponse {

	private int status;
	private String message;
	private long time;
	private String json;

	public CustomResponse(int status, String message, long time) {
		super();
		this.status = status;
		this.message = message;
		this.time = time;
	}
	public CustomResponse(int status, String message, long time, String json) {
		super();
		this.status = status;
		this.message = message;
		this.time = time;
		this.json = json;
	}
	
	public String getJson() {
		return json;
	}
	public void setJson(String json) {
		this.json = json;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	
}
