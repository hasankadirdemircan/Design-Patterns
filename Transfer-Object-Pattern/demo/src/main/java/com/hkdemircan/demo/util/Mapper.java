package com.hkdemircan.demo.util;

import java.util.ArrayList;
import java.util.List;

import com.hkdemircan.demo.dto.UserDto;
import com.hkdemircan.demo.model.User;

public class Mapper {

    public static User dto2Model(UserDto dto){
        return dto2Model(dto, null);
    }

    public static User dto2Model(UserDto dto, User model){
        if(model == null){
            model = new User();
        }

        model.setId(dto.getId());
        model.setAge(dto.getAge());
        model.setFirstName(dto.getFirstName());
        model.setLastName(dto.getLastName());
        model.setCreateBy(dto.getCreateBy());
        model.setCreateDate(dto.getCreateDate());

        return model;
    }
    
    public static UserDto model2Dto(User model) {
    	return model2Dto(model, null);
    }
    public static UserDto model2Dto(User model, UserDto dto) {
    	if(dto == null) {
    		dto = new UserDto();
    	}
    	dto.setId(model.getId());
    	dto.setFirstName(model.getFirstName());
    	dto.setLastName(model.getLastName());
    	dto.setAge(model.getAge());
    	dto.setCreateBy(model.getCreateBy());
    	dto.setCreateDate(model.getCreateDate());
    	
		return dto;
    	
    }
    
    /*
	 * List of Users
	 */
	public static List<UserDto> model2DtoUsers(List<User> modelList) {
		List<UserDto> dtoList = new ArrayList<UserDto>();

		if (!ListUtil.isNullOrEmpty(modelList)) {
			for (User model : modelList) {
				dtoList.add(model2Dto(model));
			}
		}

		return dtoList;
	}

	public static List<User> dto2ModelUsers(List<UserDto> dtoList) {
		List<User> modelList = new ArrayList<User>();

		if (!ListUtil.isNullOrEmpty(dtoList)) {
			for (UserDto dto : dtoList) {
				modelList.add(dto2Model(dto));
			}
		}

		return modelList;
	}
}
