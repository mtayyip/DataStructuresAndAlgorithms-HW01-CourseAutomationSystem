/**
 * Person_interface arayüzü,kendisini implements eden siniflarin burada bulunan
 metotlari KESİNLİKLE override etmesini saglamaktadir.Ben bu arayuzu tüm
 siniflarda implements ettim ve bu siniflarin bu 2 metodu override etmesini 
 sagladim.Ama sadece teacher ve admin siniflarinda mantikli calisiyor.diger siniflar
 icin bir is yapmiyor.Bunu yapmaktaki amacim her iki sinifinda kullanici ekleme ve cikarma ozellikleri 
 bulunmakta ve bunlari arayüz icerisine koyarak siniflarimin kendisine gore implements 
 etmesini istemekti.
 * @author tayyip
 */
public interface Person_interface 
{
    /**
     * 
     * @param p eklenecek olan person
     * @param m hangi sisteme person eklenecek
     * @return basarili bir sekilde eklendimi true-false return eder.
     */
    public boolean addUser(Users p,Sistem m);
    
    
    /**
     * 
     * @param p kaldirilacak olan person
     * @param m hangi sistemden person kaldirilacak 
     * @return basarili bir sekilde kaldirildimi true-false return eder.
     */
    public boolean removeUser(Users p,Sistem m);
}
