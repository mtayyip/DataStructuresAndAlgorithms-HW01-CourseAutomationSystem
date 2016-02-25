/**
 * Sistem en temel sınıftir.İcerisinde 2 tane arraylist ve sistemde bulunan
 * tum kullanicilari ve tum kurslari ekrana yazan metot bulunmaktadir. 
 * @author tayyip
 */
import java.util.ArrayList;
public class Sistem 
{
    /**sistemdeki tum kullanicilari tutan arraylist*/
    protected ArrayList<Users> systemUser=new ArrayList<>();
    
    /**sistemdeki tum kurslari tutan arraylist*/
    protected ArrayList<Course> systemCourse=new ArrayList<>();

    /**Default Constructor*/
    public Sistem() 
    {}
    
    /**
     *Tum kullanicilari ekrana yazan metot
     */
    public void printUser()
    {
        System.out.println("\n\nSYSTEM USERS:");
        for(int i=0;i<systemUser.size();i++)
            System.out.println(systemUser.get(i));
    }        
    
    /**
     *Tum kurslari ekrana yazan metot 
     */
    public void printCourse()
    {
        System.out.println("\n\nSYSTEM ALL COURSES:");
        for(int i=0;i<systemCourse.size();i++)
            System.out.println(systemCourse.get(i).getCourse());        
    }


    
    
}
