/**
 * Users sinifini Sistem sinifindan extends ettim ve abstract class yaparak mainde 
 * dogrudan objesinin yapilmasini engelledim.Kullanicilarinda Users sinifini extends
 * etmesini sagladim.Person_interface i ile de
 * Users sinifi name,surname,no ve studentsCourse olmak uzere 
 * 4 degerimiz vardir.Burada setter,getter,toString,successfulAdd metodlari bulunmaktadir. 
 * @author tayyip
 */
import java.util.ArrayList;
public abstract class Users extends Sistem implements Person_interface
{
    /**name Stringi*/
    private String name;
    
    /**surname Stringi*/
    private String surname;
    
    /**no degerini tutan integer*/
    private int no;
    
    /**her person icin tutulan personCourse ArrayListi*/
    protected ArrayList<Course> personCourse=new ArrayList<Course>();
    
    
    /**
     * abstract metot
     * Person_interface arayuzunun override etmeye zorladigi metotlar.
     * @param p eklenecek olan person
     * @param m hangi sisteme person eklenecek
     * @return basarili bir sekilde eklendimi true-false return eder.
     */     
    @Override
    public abstract boolean addUser(Users p, Sistem m); 

    
    /**abstract metot
     * Person_interface arayuzunun override etmeye zorladigi metotlar.
     * @param p kaldirilacak olan person
     * @param m hangi sistemden person kaldirilacak 
     * @return basarili bir sekilde kaldirildimi true-false return eder.
     */     
    @Override
    public abstract boolean removeUser(Users p, Sistem m);    
    

    
    /**
     * Constructor name,surname,no olarak 3 parametre almakta
     * @param name userin ismi
     * @param surname userin soyismi
     * @param no userin numarasi
     */
    public Users(String name, String surname,int no) 
    {
        this.name = name;
        this.surname = surname;
        this.no=no;
    }
 
        

    /**
     * 
     * @return ogrenci ismini return eder.
     */
    public String getName() 
    {
        return name;
    }
    
    
    /**
     * 
     * @param name ogrenci ismini alarak uzerinden cagrilan nesnenin ismine atama yapar.
     */
    public void setName(String name) 
    {
        this.name = name;
    }
    
    
    
    /**
     * 
     * @return ogrenci soyismini return eder.
     */
    public String getSurname() 
    {
        return surname;
    }
    
    
    /**
     * 
     * @param surname ogrenci soyismini alarak uzerinden cagrilan nesnenin soyismine atama yapar. 
     */
    public void setSurname(String surname) 
    {
        this.surname = surname;
    }

    
    
    /**
     * 
     * @return ogrenci numarasini return eder.
     */
    public int getNo() 
    {
        return no;
    }
    
    
    /**
     * 
     * @param no ogrenci numarasini alarak uzerinden cagrilan nesnenin numarasina atama yapar. 
     */
    public void setNo(int no) 
    {
        this.no = no;
    }

    
    /**polimorfizm kullanmak icin olusturulan ve kullanicinin basarili bir sekilde eklendigini belirten metod**/
    public void successfullAdd()
    {
        System.out.println("Person==>"+this.getName()+" "+this.getSurname()+" "+this.getNo()+" basarili bir sekilde eklendi.");
    }

    
    
    
    /**polimorfizm kullanmak icin olusturulan ve kullanicinin basarili bir sekilde kaldirildigini belirten metod**/
    public void successfullRemove()
    {
        System.out.println("Person==>"+this.getName()+" "+this.getSurname()+" "+this.getNo()+" basarili bir sekilde kaldirildi.");
    }
    
    
    
    /**
     * Object sinifinin toString metodunu override ederek kullandim
     * Amac:Farkli  bir yerde person referansi uzerinden toString metodu cagrilirsa programla 
     * alakasiz seylerin basilmasini engellemek.
     * @return Users in name,surname,no degerleri
     */
    @Override
    public String toString() {
        return "Person==>"+this.getName()+" "+this.getSurname()+" "+this.getNo();
    }

    
    
    /**
     * Sistemde ayni kisi varsa bulmasini sagliyor
     * @param person kisi aldim ve numaralari ayni mi diye bakiyorum.
     * @return true veya false return eder.
     */
    public boolean sameUser(ArrayList<Users> person)
    {      
        for(int i=0;i<person.size();i++)
            if(person.get(i).no==this.no)   
                return true;
                 
        return false;}
   
    
  
}
