package com.hkdemircan.demo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hkdemircan.demo.dto.UserDto;
import com.hkdemircan.demo.response.base.BaseResponse;

import java.util.List;

public class UserListResponse extends BaseResponse {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6570340747111067983L;

	public UserListResponse(int statusCode, Error error, List<UserDto> users) {
        super(statusCode, error);
        this.users = users;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<UserDto> users;

    public List<UserDto> getUsers() {
        return users;
    }

    public void setUsers(List<UserDto> users) {
        this.users = users;
    }
}
