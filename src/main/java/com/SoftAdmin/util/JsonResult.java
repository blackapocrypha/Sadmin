package com.SoftAdmin.util;

import java.io.Serializable;

public class JsonResult implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public static String STATUS_SUCCESS="1";
	
	public static String STATUS_ERROR="0";
	
	private String status; //状态
	
	private String message;//消息
	
	private Object data;   //返回数据

	public  JsonResult() {
		
	}
	
	public JsonResult(String status,String message,Object data) {
		this.status=status;
		this.message=message;
		this.data=data;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "JsonResult [status=" + status + ", message=" + message + ", data=" + data + "]";
	}
	
	
}
