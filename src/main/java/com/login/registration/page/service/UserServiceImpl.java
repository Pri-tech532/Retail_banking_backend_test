package com.login.registration.page.service;

import java.util.Arrays;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.registration.page.model.Role;
import com.login.registration.page.model.User;
import com.login.registration.page.repository.UserRepository;
import com.login.registration.page.web.dto.UserRegistrationDto;



@Service
public class UserServiceImpl implements UserService{
	

	private UserRepository userRepository;	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}


	@Override	
	public User save(UserRegistrationDto registrationDto) {
		User user=new User(registrationDto.getFirstName(), registrationDto.getLastName(), 
				registrationDto.getEmail(), registrationDto.getPassword(),Arrays.asList(new Role("Role_User")));
		
		
		return userRepository.save(user);
	}

}
