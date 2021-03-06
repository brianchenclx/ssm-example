package com.example.ssm.model;

import com.example.ssm.enums.GenderEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * UserModel
 *
 * @author clx
 */
public class UserModel implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * id
	 */
	private int id;
	/**
	 * name
	 */
	private String name;
	/**
	 * gender
	 */
	@JsonIgnore
	private GenderEnum gender;
	/**
	 * age
	 */
	private int age;
	/**
	 * birthday
	 */
	private long birthday;
	/**
	 * address
	 */
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("gender")
	public int getGenderBy() {
		return gender.getGender();
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	@JsonProperty("gender")
	public void setGenderBy(int gender) {
		this.gender = GenderEnum.valueOf(gender);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getBirthday() {
		return birthday;
	}

	public void setBirthday(long birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", birthday="
				+ birthday + ", address=" + address + "]";
	}
}
