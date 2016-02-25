/**
 * Teachers sinifi Users sinifi extends eden siniftir.Icerisinde her ogretmenin 
 * verdigi dersleri arraylist olarak tutan teacherCourse bulunmakda.3 parametre 
 * alan constructor teacher bilgilerini dolduruyor.addUser ve removeUser metodu ile
 * sisteme kullanici ekleyip cikarma islemini yapiyor.addCourseUser ve removeCourseUser
 * metotlari personlara kurs eklemeyi,addAssignments ve addDocuments persona
 * assignments veya documnets eklemeyi sagliyor.successfullAdd ve successfullRemove 
 * metotlari ile person sisteme basarili bir sekilde eklendimi diye bakiyorum.toString metodunu object
 * sinifindan override ettim.sameObject ile ise teacher'in ayni kursu birden fazla eklememesini
 * sagladim.
 * @author tayyip
 */
import java.util.ArrayList;
public class Teachers extends Users
{   
    /**Ogretmenler icin her ogretmenin verdigi dersleri arraylist olarak tutuyorum*/
    protected ArrayList<Course>teacherCourse=new ArrayList<>();
    
    
    /**
     * 3 parametre alan constructor.Isim,soyisim,no alip teacher in bilgilerini dolduruyor. 
     * @param name ogretmen ismi
     * @param surname ogretmen soyismi
     * @param no ogretmen no'su
     */
    public Teachers(String name, String surname,int no) 
    {
        super(name, surname,no);
    }

    
    
    /**
     * Person_interface inin metodu
     * Sisteme kullanici ekleme metodu
     * @param person sisteme eklenecek olan user
     * @param moodle hangi sisteme eklenecek
     * @return ekleme basarili ise true,degilse false return ediyor.
     */    
    @Override
    public boolean addUser(Users person,Sistem moodle) 
    {
        //Teacher,admin veya baska bir teacher yetkisi hakki yok. 
        if((person instanceof Admin) ||(person instanceof Teachers)){
            System.out.println("Hata "+person.getClass()+" ekleme yetkiniz yok");
            return false;}
        
        //Eger sistemde ayni kisi varsa(numaralarina bakiyor) ekleme yapmayip bilgi veriyor.
        else if(person.sameUser(moodle.systemUser)==true){
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
        //Teacher,admin veya baska bir teacher kaldirma yetkisi yok. 
        if((person instanceof Admin) ||(person instanceof Teachers)){
            System.out.println("Hata"+person.getClass()+" kaldirma yetkiniz yok");
            return false;}
        
        //Eger sistemde kaldirilmak istenen kisi yoksa(numaralarina bakiyor) kaldirma yapmayip bilgi veriyor.
        else if(moodle.systemUser.indexOf(person)==-1){
            System.out.println("Hata kaldirilmak istenen "+person.getName()+" "+person.getSurname()+" "+person.getNo()+"kullanici bulunamadi.");
            return false;}
        
        //Kaldirmak icin herhangi bir sorun yoksa sistemden kaldirma islemi yapiyorum.
        else{
            moodle.systemUser.remove(person); 
            return true;}   
    }

    
    /**
     * Kursa users ve Users'a kurs ekleme metodu..
     * @param course eklenecek olan kurs
     * @param person kursun eklenecegi kisi
     * @param moodle eklenecek olan sistem
     * @return ekleme basarili ise true,degilse false return ediyor.
     */
    public boolean addCourseUser(Course course,Users person,Sistem moodle) 
    {                    
        //Eklemek istenen kurs sistemde yoksa hata mesaji veriyorum.
        if(moodle.systemCourse.indexOf(course.getCourse())!=-1){
            System.out.println("Hata eklenmek istenen "+course.getCourse()+" kursu bulunamadi");
            return false;}
        
        //Eger person'da eklenmek istenen kurs varsa sameUsers metodu ile bakip karar veriyorum.
        else if(course.sameUsers(person)==true){
            return false;}
        
        //Eklenmek istenen kisi sistemde varmi diye bakiyor.Yoksa false return ediyor.
        else if(person.sameUser(moodle.systemUser)==false){
            return false;}
        
        //Kursu eklemek icin herhangi bir sorun yoksa persona kurs ekleniyor.
        else{
            course.usersCourse.add(person);
            person.personCourse.add(course);
            //Teacher icin ayni kursu birden fazla eklememek icin sameObject metodu ile bakip karar veriyorum.
            if(this.sameObject(course)==true)
                  this.teacherCourse.add(course);
            
            return true;}         
    }        
    
 
    
    public boolean removeCourseUser(Course course,Users person,Sistem moodle) 
    {
        if(moodle.systemCourse.indexOf(course)==-1){
            System.out.println("Hata kaldirilmak istenen "+course.getCourse()+" kursu bulunamadi)");
            return false;}
        
        else{
            course.usersCourse.remove(person);
            this.teacherCourse.remove(course);
            return true;}
    } 
    

    /**
     * Amac kursa assignment eklemek.Assignment olarak quiz,homework,group project gelebilir.
     * @param as eklenencek assignment
     * @param deadline assignment in eklenecegi tarih
     * @param late_deadline assignment in son eklenecegi tarih
     * @param course assignment in eklenecegi kurs
     * @return eklenip eklenmedigini true-false olarak return ediyorum 
     */
    public boolean addAssignments(Assignments as,String deadline,String late_deadline,Course course)
    {
        if(course.assignments.indexOf(course.assignments)!=-1){
           System.out.println("Hata eklenmek istenen "+course.assignments+" ödev zaten mevcut.");
           return false;}
        
        else{
            course.assignments.add(as);
            course.deadLine.add(deadline);
            course.late_deadLine.add(late_deadline);
            return true;}    
    }   
    
    
     public boolean gradeAssignments(Assignments as,Course course,int grade)
     {
         if(course.assignments.indexOf(as)==-1){
           System.out.println("Hata not verilmek istenen "+course.courseName+" kursunda "+as.assignmentsName+" bulunamadi.");
           return false;}
         else{
             as.grade=grade;
             return true;
         }
     }
     
     
     
     
     
     
    /**
     * Amac kursa dokuman eklemek.Dokuman olarak books,files,slides,urls gelebilir.
     * @param doc eklenecek olan dokuman
     * @param course dokumanin eklenecegi kurs
     * @return eklenip eklenmedigini true-false olarak return ediyorum
     */
    public boolean addDocuments(Documents doc,Course course)
    {
        if(course .documents.indexOf(course.documents)!=-1){
           System.out.println("Hata eklenmek istenen "+course.documents+" ödev zaten mevcut.");
           return false;}
        
        else{
            course.documents.add(doc);
            return true;}    
    }
    
    
    /**polimorfizm kullanmak icin olusturulan ve kullanicinin basarili bir sekilde eklendigini belirten metod*/
    @Override
    public void successfullAdd()
    {
        System.out.println("Teacher==>"+this.getName()+" "+this.getSurname()+" "+this.getNo()+" basarili bir sekilde eklendi.");
    } 

    
    /**polimorfizm kullanmak icin olusturulan ve kullanicinin basarili bir sekilde kaldirildigini belirten metod*/
    @Override
    public void successfullRemove()
    {
        System.out.println("Teacher==>"+this.getName()+" "+this.getSurname()+" "+this.getNo()+" basarili bir sekilde kaldirildi.\n");
    }
    
    
    /**
     *Object sinifinin toString metodunu override ederek kullandim
     * @return teacher in bilgilerini return ediyor.
     */
    @Override
    public String toString() 
    {
        String ders=" ";
        System.out.println("\n*********************************************************");
        
        for(int i=0;i<this.teacherCourse.size();i++)   
                ders+=this.teacherCourse.get(i).getCourse()+"-----";
                
        return "Teacher==>"+this.getName()+" "+this.getSurname()+" "+
                this.getNo()+"\n\nTeacher's Courses:"+ders;
    }

    
    
    /**
     *Amac teacher'in ayni kursu birden fazla eklememesi  
     * @param course teachercourse a eklenmek istenen kurs
     * @return true veya false return eder.
     */
    boolean sameObject(Course course)
    {
        for(int i=0;i<teacherCourse.size();i++)
            if(this.teacherCourse.get(i).courseId==course.courseId)
                return false;
    
        return true;
    }
}
