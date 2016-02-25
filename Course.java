/**
 * Course sinifi Sistem sinifindan turetilen bir siniftir.icerisinde kurs ismini 
 * tutan courseName stringi,Dokumanlari tutan documents arraylisti,Assignmentsleri
 * tutan assignments arraylisti ve dateline lari  tutan string arraylisti 
 * bulunmaktadir.Ayrica bir tane constructor,addCourse 
 * ve getCourse metodu bulunmaktadir.
 */
import java.util.ArrayList;
public class Course extends Sistem        
{
    /**Kurs ismini tutan string*/
    public String courseName;
    
    /**Kurs id si tutan int*/
    public int courseId;

    
    /**Dokumanlari tutan documents arraylisti*/
    protected ArrayList<Users> usersCourse=new ArrayList<>();
    
    /**Dokumanlari tutan documents arraylisti*/
    protected ArrayList<Documents> documents=new ArrayList<>();
    
    /**Assignmentsleri tutan assignments arraylisti*/
    protected ArrayList<Assignments> assignments=new ArrayList<>();
    
    /**Deadline tutan string arraylisti*/
    protected ArrayList<String> deadLine=new ArrayList<>();
    
    /**Late deadline tutan string arraylisti*/
    protected ArrayList<String> late_deadLine=new ArrayList<>();
    
    /**Default Constructor*/
    public Course()
    {}
    
    
    /**
     * 
     * @param course yeni olusturulan kursun ismi
     * @param id kurs'un id si
     */
    public Course(String course,int id) 
    {
        this.courseName=course;
        this.courseId=id;
    }
    
    /**
     * 
     * @param course kursa eklemek icin alinan kurs
     * @param person kullaniciya eklemek icin alinan kisi
     */
    public void addCourse(Course course,Users person) 
    {
        this.systemCourse.add(course);
        this.systemUser.add(person);
    }

    /**
    * 
    * @return coursename return ediyor 
    */
    public String getCourse() 
    {
        return courseName;
    }
    
    /**
    * 
    * @return courseId return ediyor 
    */
    public int getCourseId() 
    {
        return courseId;
    }
    

    /**
     * 
     * @param user kursa eklenmek istenen kisi.
     * @return eger eklenmek istenen kisi kursta zaten varsa true return ediyor.Yoksa false return ediyorum.
     */
    boolean sameUsers(Users user)
    {      
        for(int i=0;i<usersCourse.size();i++)
            if(usersCourse.get(i).getNo()==user.getNo()) 
                return true;
                 
        return false;}
    
    
    /**
     * Test fonksiyonudur.Uzerinde cagrilan kursa eklenen kisileri ekrana veriyor.
     */
    void coursesUsers()
    {
        String course_user="";
        
        for(int i=0;i<usersCourse.size();i++)
            course_user+=usersCourse.get(i).getName()+",";
       
        System.out.println("\n"+this.courseName+" user's:\n"+course_user);
    }
}
