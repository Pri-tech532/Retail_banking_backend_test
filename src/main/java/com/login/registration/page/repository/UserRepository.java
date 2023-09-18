package com.login.registration.page.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.registration.page.model.User;




@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
