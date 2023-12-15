package in.hospital.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import in.hospital.entities.Doctor;
import in.hospital.entities.Patient;
import in.hospital.entities.UserLogin;
import in.hospital.repositories.DoctorRepository;
import in.hospital.repositories.PatientRepository;

@Service
public interface UserLoginService {
//	User createUser(User user);
//	List<User> getUser();
//	User findById(Long id);
//	User updateUser(Long id, User user);
	String deleteUser(Long id);
	String signup(UserLogin userLogin);
	String login(String email_id, String password);
}


