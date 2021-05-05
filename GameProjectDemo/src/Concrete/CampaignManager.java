package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
	

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+"has been added");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+"has been deleted");

		
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+"has been updated");
		
	}
	
	
	
	

}
