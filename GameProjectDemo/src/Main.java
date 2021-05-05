import java.sql.Date;

import Adapters.MernisCheckAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args)throws Exception {
		User user = new User(1, "Berkan", "Çelik", 2000,10047176118L);
		
		Game game = new Game(1, "Gta V ", 2000,"great sunday sale");
		
		Game game1 = new Game(2, "Gta V ", 3500,"great sunday sale");

		
		Game game2 = new Game(3, "Gta V ", 3488,"great sunday sale");

		Game game3 = new Game(4, "Gta V ", 3490,"great sunday sale");

		
		
		Campaign campaign = new Campaign(1, "10% discount on the cart ",100);
		
		Campaign campaign2 = new Campaign(2, "20% discount on the cart ",120);

		Campaign campaign3 = new Campaign(3, "15% discount on the cart ",140);

		
		
		
		UserManager userManager = new UserManager(new MernisCheckAdapter());
		userManager.add(user);
		
	
		
		System.out.println("------------------------------------------");
		
		GameManager gameManager =new GameManager();
		gameManager.add(game);
		gameManager.delete(game2);
		gameManager.update(game3);

		
		
		
		
		System.out.println("-------------------------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign2);
		campaignManager.update(campaign3);


		
		
		
		
		
		
		
	}

}
