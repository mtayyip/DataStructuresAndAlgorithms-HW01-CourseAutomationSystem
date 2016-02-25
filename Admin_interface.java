/**
 * Admin_interface arayüzü,kendisini implements eden siniflarin burada bulunan
 metotlari KESİNLİKLE override etmesini saglamaktadir.Ben bu arayuzu ADmin
 sinifinda implements ettim ve bu siniflarin bu 2 metodu override etmesini 
 sagladim.Bunu yapmaktaki amacim kullanici ekleme ve cikarma ozellikleri 
 arayüz icerisine koyarak admin sinifinin kendisine gore implements 
 etmesini istemek.
 * @author tayyip
 */
public interface Admin_interface 
{
   /**
    * 
    * @param course eklenecek olan kurs
    * @param moodle hangi sisteme kurs eklenecek
    * @return basarili bir sekilde eklendimi true-false return eder.
    */
    public boolean addCourse(Course course,Sistem moodle);
    
   /**
    * 
    * @param course kaldirilacak olan kurs
    * @param moodle hangi sistemden kurs kaldirilacak
    * @return basarili bir sekilde kaldirildimi true-false return eder.
    */
    public boolean removeCourse(Course course,Sistem moodle);   
}
