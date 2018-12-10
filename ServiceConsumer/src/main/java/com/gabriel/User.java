package com.gabriel;

/**
 * @author gabriel
 * @Type User
 * @Desc
 * @date 2018/12/6 17:44
 */
public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}