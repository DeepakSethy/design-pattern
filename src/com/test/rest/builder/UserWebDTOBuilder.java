package com.test.rest.builder;

import java.time.LocalDate;
import java.time.Period;

//Concrete builder
public class UserWebDTOBuilder implements UserDTOBuilder{

	
	public String firstName;
	public String lastName;
	public String age;
	private String address;
	private UserWebDTO dto;
			
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthDay(LocalDate bday) {
		Period ageinYears = Period.between(bday, LocalDate.now());
		age = Integer.toString(ageinYears.getYears());
		return this;

	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNum() +", "+ address.getStreet() +", " + address.getCity() + ", " + address.getState() + address.getZip();
		return this;
	}

	@Override
	public UserDTO build() {
		dto = new UserWebDTO(firstName+" "+lastName, address, age);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		return dto;
	}
}
