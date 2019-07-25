package com.hkdemircan.demo.model;

import com.hkdemircan.demo.model.base.BaseModel;
import com.hkdemircan.demo.model.base.BaseModelAudit;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends BaseModelAudit {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7179045647803794135L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
