package com.hkdemircan.demo.request;

import com.hkdemircan.demo.dto.UserDto;
import com.hkdemircan.demo.request.base.BaseRequest;

public class UserRequest extends BaseRequest {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7330499679159721420L;
	private UserDto user;

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
