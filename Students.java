/**
 * Students sinifi Users sinifini extends edip Students_interface arayüzünü
 implements ediyor.Students sinifinda constructor,viewGrades,successfullAdd
 ve toString metodlari bulunmaktadir.
 * @author tayyip
 */
public class Students extends Users implements Students_interface
{
    /**
     * Constructor name,surname,no olarak 3 parametre almakta ve super class'in constructorunu cagırıyorum.
     * @param name studentin ismi
     * @param surname studentin soyismi
     * @param no studentin numarasi
     */     
    public Students(String name, String surname,int no) 
    {
        super(name, surname,no);
    }

    
    /**
     * Students in derslerde aldigi notlari gostermektedir.
     * @param grade not
     * @return not
     */
    @Override
    public int viewGrades(int grade) 
    {
        return grade;
    }

    
    /**Polimorfizm kullanmak icin olusturulan ve kullanicinin basarili bir sekilde eklendigini belirten metod*/
    @Override
    public void successfullAdd()
    {
        System.out.println("Student==>"+this.getName()+" "+this.getSurname()+" "+this.getNo()+" basarili bir sekilde eklendi.");
    }  
    
    
    /**Polimorfizm kullanmak icin olusturulan ve kullanicinin basarili bir sekilde kaldirildigini belirten metod*/
    @Override
    public void successfullRemove()
    {
        System.out.println("Student==>"+this.getName()+" "+this.getSurname()+" "+this.getNo()+" basarili bir sekilde kaldirildi.\n");
    }    


    /**
     * 
     * @param p eklenmek istenen person
     * @param m hangi sisteme eklenmek istiyor
     * @return throw firlattigi icin kullanilmiyor
     * Exception kullanicinin ekleme yetkisi yoksa throw firlatilabilecegini belirtiyorum.  
     */
    @Override
    public boolean addUser(Users p, Sistem m) {
        throw new UnsupportedOperationException("Student==> "+this.getName()+" "+this.getSurname()+" kullanici ekleme yetkisi yok."); 
    }

    
    /**
     * 
     * @param p kaldirilmak istenen person
     * @param m hangi sistemden kaldirilmak istiyor
     * @return throw firlattigim icin return e gerek kalmiyor.
     * Exception kullanicinin ekleme yetkisi yoksa throw firlatilabilecegini belirtiyorum.  
     */
    @Override
    public boolean removeUser(Users p, Sistem m) {
        throw new UnsupportedOperationException("Student==> "+this.getName()+" "+this.getSurname()+" kullanici cikarma yetkisi yok."); 
    }
       
    
    /**
     * Object sinifinin toString metodunu override ederek kullandim
     * @return student bilgilerini return ediyorum.
     */
    @Override
    public String toString() {
        String ders="";
        String odev="";
        String doc="";
        String deadline="";
        String latedeadline="";
        
        /*
          person sinifindaki personCourse da bulunan ve ogrencinin sectigi dersler ders
          isimli stringte tutuluyor. 
         */
        for(int i=0;i<this.personCourse.size();i++)
            ders+=this.personCourse.get(i).getCourse()+"-----";

        /*
          person sinifindaki personCourse da bulunan ve ogrencinin sectigi derslerdeki
          odevleri odev isimli stringte tutuluyor.  
         */        
        for(int i=0;i<this.personCourse.size();i++){
            if(this.personCourse.get(i).assignments.toString().equals("[]")==true)
                odev+="[Odev Yok]-----";
            else   
                odev+=this.personCourse.get(i).assignments.toString()+"-----";
        }
     
        
        /*
          person sinifindaki personCourse da bulunan ve ogrencinin sectigi derslerdeki
          odevlerin deadlinelarini date isimli stringte tutuluyor.  
         */        
        for(int i=0;i<this.personCourse.size();i++){
            if(this.personCourse.get(i).deadLine.toString().equals("[]")==true)
                deadline+="[Odev Yok]-----";
            else            
                deadline+=this.personCourse.get(i).deadLine.toString()+"-----";}

        /*
          person sinifindaki personCourse da bulunan ve ogrencinin sectigi derslerdeki
          odevlerin late datelinelarini date isimli stringte tutuluyor.  
         */        
        for(int i=0;i<this.personCourse.size();i++){
            if(this.personCourse.get(i).late_deadLine.toString().equals("[]")==true)
                latedeadline+="[Odev Yok]-----";
            else             
                latedeadline+=this.personCourse.get(i).late_deadLine.toString()+"-----";}
        
        
        /*
          person sinifindaki personCourse da bulunan ve ogrencinin sectigi derslerdeki
          dokumanlari doc isimli stringte tutuluyor.  
         */        
        for(int i=0;i<this.personCourse.size();i++){
            if(this.personCourse.get(i).documents.toString().equals("[]")==true)
                doc+="[Dokuman Yok]-----";
            else            
                doc+=this.personCourse.get(i).documents.toString()+"-----";}
        
        
        System.out.println("\n*********************************************************");
        
        //return olarakda ustteki bilgileri donderiyorum.       
        return "Student==>"+this.getName()+" "+this.getSurname()+" "+this.getNo()+
               "\n\nStudent's Courses: "+ders+"\n\nStudent's Assignments:"+odev+
               "\n\nStudent's Assignments Deadline:"+deadline+
               "\n\nStudent's Assignments Late Deadline:"+latedeadline+
               "\n\nStudent's Documents:"+doc;
    }



}
