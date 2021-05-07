

import java.util.Scanner;

import Adapters.GoogleAuthManagerAdapter;
import Business.Abstracts.AuthService;
import Business.Concretes.AuthManager;
import Business.Concretes.UserManager;
import Core.Concretes.SendMail.SendMailManager;
import Core.Concretes.Validators.EmailValidator;
import Core.Concretes.Validators.NameValidator;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.Dto.Concretes.UserForRegisterDto;

public class Main {

	
	public static void main(String[] args) {
		
		
		


		
		//Input Oluþumu Ve Metot Tasarýmý
		boolean exit = true;
		while(exit) {
			
			Scanner scanner  = new Scanner(System.in);
			
			System.out.print("			<<<<<<<<<<<<<<<<<<  KODLAMA.ÝO  Java Kamp || Ders - 5 || Ödev - 1 || E - Ticaret  >>>>>>>>>>>>>>>>>>>>>>\n"+
					"					Kayýt yöntemini seçin\n"+
					"			1.Kayýt ol \n"+
					"			2.Google ile Kayýt ol\n"+
					"			3.Giriþ yap \n" +
					"			4.Google ile giriþ yap \n" +
					"			5.Çýkýþ\n"+
					"					Seçiminiz : ");
			
			int number = scanner.nextInt();
			
			
			if(number == 1) {
				
				AuthService authService = new AuthManager(new EmailValidator(new UserManager(new HibernateUserDao())), 
						new NameValidator(), new UserManager(new HibernateUserDao()), new SendMailManager());
				
				
				System.out.println("    						Kullanýcý bilgilerini giriniz ");
				
				System.out.print("   			Kullanýcý Id : ");
				int id = scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.print("   			Ad : ");
				String firstName = scanner.nextLine();
				
				System.out.print("  		    	Soyad : ");
				String lastName = scanner.nextLine();
				
				System.out.print("  			E-posta :");
				String email = scanner.nextLine();
				
				System.out.print("   			Þifre : ");
				String password = scanner.nextLine();
				
				UserForRegisterDto forRegisterDto = new UserForRegisterDto();
				forRegisterDto.setFirstName(firstName);
				forRegisterDto.setLastName(lastName);
				forRegisterDto.setEmail(email);
				forRegisterDto.setPassword(password);
				
				authService.register(forRegisterDto, id);
				
				
				
				System.out.println("				Devam etmek için herhangi bir tuþa basýn");
				scanner.nextLine();
				
			}
			
			if (number == 2) {
				
				AuthService authService = new GoogleAuthManagerAdapter();
				
				System.out.println("    					Google	Kullanýcý bilgilerini giriniz ");
				
				scanner.nextLine();
				
				System.out.print("  			E-posta :");
				String email = scanner.nextLine();
				
				System.out.print("   			Þifre : ");
				String password = scanner.nextLine();
				
				
				authService.register(email, password);
				
				System.out.println("				Devam etmek için herhangi bir tuþa basýn");
				scanner.nextLine();
				
			}
			
			switch(number) 
			{
				case 5:
					exit = false;
					break;
			}
			
			
		}
		
		
		
		
		
		
		

	}

}
