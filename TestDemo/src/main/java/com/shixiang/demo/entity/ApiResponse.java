package com.shixiang.demo.entity;

import com.shixiang.demo.enums.CodeEnum;

/**
 * @author luoyushan
 */
public class ApiResponse<T> {

	private int status;
	
	private String message;
	
	private T data;

	public ApiResponse(int status, String message, T data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public ApiResponse() {
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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static <T> ApiResponse<T> success(T data) {
		ApiResponse<T> result = new ApiResponse<T>();
		result.setData(data);
		result.setStatus(CodeEnum.SUCCESS.getCode());
		result.setMessage(CodeEnum.SUCCESS.getMsg());
		return result;
	}

	public static  ApiResponse success() {
		ApiResponse result = new ApiResponse();
		result.setData(null);
		result.setStatus(CodeEnum.SUCCESS.getCode());
		result.setMessage(CodeEnum.SUCCESS.getMsg());
		return result;
	}

	public static ApiResponse failure(String message){
		ApiResponse result = new ApiResponse();
		result.setData(null);
		result.setStatus(CodeEnum.FAILED.getCode());
		result.setMessage(message);
		return result;
	}

	public static ApiResponse failure(CodeEnum codeEnum){
		ApiResponse result = new ApiResponse();
		result.setData(null);
		result.setStatus(codeEnum.getCode());
		result.setMessage(codeEnum.getMsg());
		return result;
	}
}
