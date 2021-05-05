package Abstract;

import java.rmi.RemoteException;

import Entities.User;

public interface UserService {
	
	void add(User user) throws RemoteException;
	
	void delete(User user);
	
	void update(User user);
	
	
	

}
