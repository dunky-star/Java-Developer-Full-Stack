package com.dunky.yohunters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Customer {
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;

}
