package in.hospital.repositories;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import in.hospital.entities.UserLogin;


public interface UserLoginRepository extends JpaRepository<UserLogin,String>{
	 
}
