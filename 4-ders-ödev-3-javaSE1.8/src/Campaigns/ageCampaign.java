package Campaigns;

import Entities.Concrete.Customer;
import Entities.Concrete.Sales;
import Services.CampaignService;

public class ageCampaign implements CampaignService {

	@Override
	public double campaign(Sales sales) {
		
		if(sales.getCustomerDateOfBirth() <= 1990) {
			
			return sales.getPrice() * 80/100;
			
		}else if(1991 <= sales.getCustomerDateOfBirth() && sales.getCustomerDateOfBirth() <= 2000) {
			
			return sales.getPrice() * 60/100;
		}else {
			
			return sales.getPrice();
		}
		
	}

}
