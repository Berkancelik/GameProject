package Concrete;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) throws RemoteException {
		// TODO Auto-generated method stub
		return true;
	}



	

}
