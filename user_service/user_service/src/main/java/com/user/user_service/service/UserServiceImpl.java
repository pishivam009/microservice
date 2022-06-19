package com.user.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;

@Service
public class UserServiceImpl implements UserService{

	//Fake User List
	
	List<User>	list = List.of(
			new User(123456789L, "Piyush Shivam", "9334419919"),
			new User(123456788L, "Piyush Shivam1", "9334419918"),
			new User(123456787L, "Piyush Shivam2", "9334419917"),
			new User(123456786L, "Piyush Shivam3", "9334419916"),
			new User(123456785L, "Piyush Shivam4", "9334419915"));
	
	
	@Override
	public User getUser(Long id) {
		User matchedUser = null;
		for(User user : list) {
			if (user.getUserId().equals(id)) matchedUser=user;
		}
		return matchedUser;
	}
	
	
	@Override
	public User getUserUsingLambda(Long id) {
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
