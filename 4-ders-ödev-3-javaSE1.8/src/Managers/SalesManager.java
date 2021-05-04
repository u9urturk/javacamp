package Managers;

import Entities.Concrete.Sales;
import Services.CampaignService;
import Services.LoggerService;
import Services.SalesService;

public class SalesManager implements SalesService {

	CampaignService campaignService;
	
	LoggerService  loggerService;
	
	public SalesManager(CampaignService campaignService , LoggerService loggerService) {
		
		this.campaignService = campaignService;
		this.loggerService = loggerService;
	}

	@Override
	public void sell(Sales sales) {
		
		System.out.println("***********************************************\n"+"Satış başarıyla gerçekleşti... \n"+
		"Müşteri adı : " + sales.getCustomerName() + "\n" + 
		"Oyun adı : "+ sales.getGameName() +"\n"+ 
		"Satış fiyatı : " + sales.getPrice() + " TL\n"+
		"Kampanyalı satış fiyatı : " + this.campaignService.campaign(sales) + " TL\n"+
		"İşlem zamanı : " + sales.getSellBy());
		
		this.loggerService.log();
	}

}
