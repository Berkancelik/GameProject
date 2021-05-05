package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) throws RemoteException {
		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		
		return kpsPublicSoap.TCKimlikNoDogrula(user.getNationalityId(), user.getUserName().toUpperCase(), user.getUserLastName().toUpperCase(), user.getUserBirthday());

		
		
	}

}
