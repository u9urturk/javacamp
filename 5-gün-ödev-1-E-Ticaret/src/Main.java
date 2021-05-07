
import java.util.Scanner;

import Adapters.GoogleAuthManagerAdapter;
import Business.Abstracts.AuthService;
import Business.Abstracts.UserService;
import Business.Concretes.AuthManager;
import Business.Concretes.UserManager;
import Core.Concretes.SendMail.SendMailManager;
import Core.Concretes.Validators.EmailValidator;
import Core.Concretes.Validators.NameValidator;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.Dto.Concretes.UserForLoginDto;
import Entities.Concretes.Dto.Concretes.UserForRegisterDto;

public class Main {

	public static void main(String[] args) {
		
		/*Not : bu projede istenilen operasyonlari console ile  etkilesimli bir sekilde yurutmeye calýstým fakat þuan  icin gonderdigim veriyi 
		 * her islemde hafizada tutamamam nedeniyle simdilik e-posta eslesmesi ve e-posta dogrulama operasyonlarini console uzerinden 
		 * gosteremiyorum fakat operasyonlar calismakta. kodlarý inceleyerek kendi projenize uyarlayabilirsiniz.  
		
		*/
		// Input oluþumu
		boolean exit = true;
		while (exit) {

			Scanner scanner = new Scanner(System.in);

			System.out.print("  \n"
					+"  \n"
					+"			<<<<<<<<<<<<<<<<<<  KODLAMA.ÝO  Java Kamp || Ders - 5 || Ödev - 1 || E - Ticaret  >>>>>>>>>>>>>>>>>>>>>>\n"
							+ "					Yapýlacak iþlemi seçin\n" + "			1.Kayýt ol \n"
							+ "			2.Google ile Kayýt ol\n" + "			3.Giriþ yap \n"
							+ "			4.Google ile giriþ yap \n" + "			5.E-posta doðrula\n"
							+ "			6.Çýkýþ"
							+ "					Seçiminiz : ");

			int number = scanner.nextInt();

			if (number == 1) {
				
				
			
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
				
				System.out.println(" 			Devam etmek için her hangi bir tuþa basýnýz");
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

			if (number == 3) {

				AuthService authService = new AuthManager(new EmailValidator(new UserManager(new HibernateUserDao())),
						new NameValidator(), new UserManager(new HibernateUserDao()), new SendMailManager());

				System.out.println("    					Kullanýcý bilgilerini giriniz ");

				scanner.nextLine();

				System.out.print("  			E-posta :");
				String email = scanner.nextLine();

				System.out.print("   			Þifre : ");
				String password = scanner.nextLine();
				
				UserForLoginDto dto = new UserForLoginDto(email,password);
				
				authService.login(dto);
				
				System.out.println("				Devam etmek için herhangi bir tuþa basabilirsin");
				scanner.nextLine();
			}
			
			if(number == 4 ) {
				
				AuthService authService = new GoogleAuthManagerAdapter();
				
				System.out.println("    			Google		Kullanýcý bilgilerini giriniz ");

				scanner.nextLine();

				System.out.print("  			E-posta :");
				String email = scanner.nextLine();

				System.out.print("   			Þifre : ");
				String password = scanner.nextLine();
				
				UserForLoginDto dto = new  UserForLoginDto(email, password);
				
				
				authService.login(dto);
				
				System.out.println("				Devam etmek için herhangi bir tuþa basabilirsin");
				scanner.nextLine();
			}
			
			if(number == 5) {
				
				UserService userService = new UserManager(new HibernateUserDao());
				System.out.print("				Kullanýcý Id girin : ");
				int Id = scanner.nextInt();
				
				scanner.nextLine();
				
				System.out.print("				E-posta  : ");
				String email = scanner.nextLine();
				
				System.out.print("				Password : ");
				String password = scanner.nextLine();
				
				userService.verifyUser(Id);
				
				System.out.println("				Devam etmek için herhangi bir tuþa basabilirsin");
				scanner.nextLine();
				
			}
			

			switch (number) {
			case 6:
				exit = false;
				System.out.println("Çýkýþ yapýlýyor ...........................");
				break;
			}
			

		}

	}

}
