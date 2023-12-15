package in.hospital.ServiceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hospital.repositories.UserLoginRepository;
import in.hospital.services.UserLogin;
import in.hospital.services.UserLoginService;



@Service
public class UserLoginServiceImpl implements UserLoginService{
	
	@Autowired
	UserLoginRepository userLoginRepository;

	public String signup(UserLogin userLogin) {
		userLoginRepository.save(userLogin);
		return "Your accont have been created";
	}

	public String login(String email_id, String password) {
		
		try {
			UserLogin ul = userLoginRepository.findById(email_id).get();
			if(password.equals(ul.getPassword())) {
				return "You have logged in successfully.";
			}
			else {
				return "Incorrect Password";
			}	
		}
			catch(NoSuchElementException e){
				e.getMessage();
			}
			
		return "Incorrect user_id, Please register Yourself";
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public in.hospital.services.User createUser(in.hospital.services.User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public in.hospital.services.User updateUser(Long id, in.hospital.services.User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String signup(UserLogin userLogin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public in.hospital.services.User createUser(in.hospital.services.User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public in.hospital.services.User updateUser(Long id, in.hospital.services.User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String signup(UserLogin userLogin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public in.hospital.services.User createUser(in.hospital.services.User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public in.hospital.services.User updateUser(Long id, in.hospital.services.User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String signup(UserLogin userLogin) {
		// TODO Auto-generated method stub
		return null;
	}



}
