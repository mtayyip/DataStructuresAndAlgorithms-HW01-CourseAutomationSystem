/**
 * Admin sinifi Users sinifi extends eden,Admin_interface  i implements eden siniftir
 Icerisinde 3 parametre alan constructor,addUser,removeUser,addCourse,removeCourse
 ve toString metotlari bulunmaktadir.addUser ve removeUser metotlari super sinifin 
 implements ettigi Person_interface'inin,addCourse ve removeCourse Admin sinifinin 
 implements ettigi metotlardir.Yani Admin sinifinin tum metotlari override edilmistir.
 * @author tayyip
 */
public class Admin extends Users implements Admin_interface
{
    /**
     * 3 parametre alan constructor.Isim,soyisim,no alip adminin bilgilerini dolduruyor. 
     * @param name admin ismi
     * @param surname admin soyismi
     * @param no admin no'su
     */
    public Admin(String name, String surname,int no) 
    {
        super(name, surname,no);

    }
 
    /**
     * Person_interface inin metodu
     * Sisteme kullanici ekleme metodu
     * @param person sisteme eklenecek olan user
     * @param moodle hangi sisteme eklenecegi
     * @return ekleme basarili ise true,degilse false return ediyor.
     */  
    @Override
    public boolean addUser(Users person,Sistem moodle) 
    {
        //Eger sistemde ayni kisi varsa(numaralarina bakiyor) ekleme yapmayip bilgi veriyor.
        if(person.sameUser(moodle.systemUser)==true ){
            System.out.println("\n!!!Hata "+person.getName()+" "+person.getSurname()+" "+person.getNo()+" sistemde kayitli.Eklenemedi.\n");
            return false;}
        
        //Eklemek icin herhangi bir sorun yoksa sisteme ekleme yapiyorum.
        else{
            moodle.systemUser.add(person);
            person.successfullAdd();
            return true;}
    }

    
    
    /**
     * Person_interface inin metodu
     * Sistemden kullanici kaldirma metodu
     * @param person sistemden kaldirilacak olan user
     * @param moodle hangi sistemden kaldirilacak
     * @return kaldirma basarili ise true,degilse false return ediyor.
     */
    @Override
    public boolean removeUser(Users person,Sistem moodle) 
    {
        
        //Eger sistemde kaldirilmak istenen kisi yoksa(numaralarina bakiyor) kaldirma yapmayip bilgi veriyor.
        if(moodle.systemUser.indexOf(person)==-1){
            System.out.println("Hata kaldirilmak istenen kullanici "+person.getName()+" "+person.getSurname()+" bulunamadi.");
            return false;}
        
        //Kaldirmak icin herhangi bir sorun yoksa sistemden kaldirma islemi yapiyorum.
        else{
            moodle.systemUser.remove(person);
            person.successfullRemove();
            return true;}    
    }

    
    /**
     * Admin_interface 'inin metodu
     * Sisteme kurs ekleme metodu.
     * @param course sisteme eklenecek olan kurs
     * @param moodle kurs hangi sisteme eklenecek 
     * @return ekleme basarili ise true,degilse false return ediyor.
     */
    @Override
    public boolean addCourse(Course course, Sistem moodle) 
    {            
        if(moodle.systemCourse.indexOf(course)!=-1){
            System.out.println("Hata kurs zaten mevcuttur.");
            return false;}
        
        else{
            moodle.systemCourse.add(course); 
            return true;}
    }  

    
    /**
     * Admin_interface 'inin metodu
     * Sistemden kurs kaldirma metodu.
     * @param course sistemden kaldirilacak olan kurs
     * @param moodle kurs hangi sistemden kaldirilacak 
     * @return kaldirma basarili ise true,degilse false return ediyor.
     */
    @Override
    public boolean removeCourse(Course course, Sistem moodle)
    {
        if(moodle.systemCourse.indexOf(course)==-1){
            System.out.println("Hata kaldirilmak istenen "+course.courseName+" kurs sistemde bulunamadi.");
            return false;}
        
        else{
            moodle.systemCourse.remove(course);
            System.out.println("\n"+course.courseName+" kursu basarili bir sekilde kaldirildi.");
            return true;}
    }    
  
    
    
    /**
    * Object sinifinin toString metodunu override ederek kullandim.Amac:Farkli 
    * bir yerde Admin uzerinden toString metodu cagrilirsa programla alakasiz seylerin 
    * basilmasini engellemek. 
     * @return admin ismi,soyismi ve numarasi
     */
    @Override
    public String toString() 
    {
        return "Admin==>"+this.getName()+" "+this.getSurname()+" "+this.getNo();
    }
}
