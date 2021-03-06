package com.hkdemircan.demo.response.base;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3750049533402192650L;

	public BaseResponse(int statusCode, Error error) {
        this.statusCode = statusCode;
        this.error = error;
    }

    private int statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Error error;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
