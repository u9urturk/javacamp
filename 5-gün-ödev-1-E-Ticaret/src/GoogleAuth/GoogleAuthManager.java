package GoogleAuth;

public class GoogleAuthManager {
	public void register(String email , String password) {
	
		System.out.println("Kullan�c� bilgileri google ile al�nd� ve kay�t i�lemi ger�ekle�tirildi\n"+
	"ilgili kullan�c� mail adresi : " + email);
	}
	
	public void login(String email , String password) {
		System.out.println("Giri� google arac�l���yla yap�ld�\n" + 
	"ilgili kullan�c� mail adresi : " + email);
	}
}
