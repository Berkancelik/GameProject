package Concrete;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	UserCheckService userCheckService;
	
	public  UserManager(UserCheckService userCheckService){
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) throws RemoteException {
		if (userCheckService.checkIfRealPerson(user)) {
			System.out.println(user.getUserName() + " " +user.getUserLastName() + " person registered");
		}else {
			System.out.println("the contact could not be saved");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("user information has been updated");
		
	}

	@Override
	public void update(User user) {
		System.out.println("user information has been deleted");
		
	}


}
