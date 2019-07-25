package com.hkdemircan.demo.dto;

import com.hkdemircan.demo.dto.base.BaseDtoAudit;

public class UserDto extends BaseDtoAudit {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1203522879478285804L;
	private Integer id;
    private String lastName;
    private String firstName;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
