package com.login.registration.page.service;

import com.login.registration.page.model.User;
import com.login.registration.page.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
