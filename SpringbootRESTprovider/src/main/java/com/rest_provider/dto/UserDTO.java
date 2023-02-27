package com.rest_provider.dto;

import java.time.LocalDate;

import com.rest_provider.entity.Address;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UserDTO {
	
	private Integer userId;
	@NotNull(message = "{user.emailid.absent}")
	@Email(message = "{user.emailid.invalid}")
	private String emailId;
	@NotNull(message = "{user.username.absent}")
	@Pattern(regexp = "[A-Za-z0-9_]{8, 18}", message = "{user.username.invalid}")
	private String username;
	private LocalDate signUpDate;
	@NotNull
	@Valid
	private AddressDTO addressDTO;
}
