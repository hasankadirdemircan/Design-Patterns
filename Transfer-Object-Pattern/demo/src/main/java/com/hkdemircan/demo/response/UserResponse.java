package com.hkdemircan.demo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hkdemircan.demo.dto.UserDto;
import com.hkdemircan.demo.response.base.BaseResponse;

public class UserResponse extends BaseResponse {

    /**
	 * 
	 */
	private static final long serialVersionUID = 934926264370000674L;

	public UserResponse(int statusCode, Error error, UserDto user) {
        super(statusCode, error);
        this.user = user;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UserDto user;

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
