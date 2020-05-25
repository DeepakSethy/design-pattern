package com.test.rest.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
	UserDTOBuilder withFirstName(String fname);
	
	UserDTOBuilder withLastName(String lname);
	
	UserDTOBuilder withBirthDay(LocalDate bday);
	
	UserDTOBuilder withAddress(Address address);
	
	UserDTO build();
	
	UserDTO getUserDTO();	
}
