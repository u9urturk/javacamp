package GoogleAuth;

public class GoogleAuthManager {
	public void register(String email , String password) {
	
		System.out.println("Kullanýcý bilgileri google ile alýndý ve kayýt iþlemi gerçekleþtirildi\n"+
	"ilgili kullanýcý mail adresi : " + email);
	}
	
	public void login(String email , String password) {
		System.out.println("Giriþ google aracýlýðýyla yapýldý\n" + 
	"ilgili kullanýcý mail adresi : " + email);
	}
}
