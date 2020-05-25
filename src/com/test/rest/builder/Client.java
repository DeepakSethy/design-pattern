package com.test.rest.builder;

import java.time.LocalDate;

public class Client {
	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		
		UserDTO dto = directBuild(builder, user);
		System.out.println(dto);
	}

	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withBirthDay(user.getBirthday())
				.withAddress(user.getAddress())
				.build();
	}

	public static User createUser() {
		User user = new User();
		user.setFirstName("Aditya");
		user.setLastName("Sethy");
		user.setBirthday(LocalDate.of(2013, 7, 10));
		Address address = new Address();
		address.setHouseNum("614");
		address.setStreet("6601 West Plano pKwy");
		address.setCity("Plano");
		address.setState("TX");
		address.setZip("75093");
		user.setAddress(address);
		return user;
	}
}
