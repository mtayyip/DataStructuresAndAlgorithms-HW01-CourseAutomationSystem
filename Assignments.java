/**
 * Assignments sinifi İcerisinde assignment adini tutan bir string ve bir tane constructor,
 * getassignment ve toString metotlari bulunmaktadir.Tum assignmentlari bu sinifta tutuyorum 
 * homework,quiz,groupproject icin ayri ayri ArrayList ler tutuyorum.
 * @author tayyip
 */
import java.util.ArrayList;
public class Assignments
{
    /**Assignment ismini tutan string*/
    public String assignmentsName;
    
    /**assignment'a verilen not*/
    public int grade;
    
    
    /**Homework ile ilgili verileri bu arraylist te tutuyorum.*/
    protected ArrayList<Homework> hw=new ArrayList<>();
    
    /**Quiz ile ilgili verileri bu arraylist te tutuyorum.*/
    protected ArrayList<Quiz> quiz=new ArrayList<>();
    
    /**GroupProject ile ilgili verileri bu arraylist te tutuyorum.*/
    protected ArrayList<GroupProject> project=new ArrayList<>();

    
    
    /**
     * Constructor tek parametre alip assignments adina atiyor.
     * @param assignmentsName gelen stringi assignment ismi olarak aliyor. 
     */
    public Assignments(String assignmentsName) 
    {
        this.assignmentsName = assignmentsName;
    }

    

    /**
     * 
     * @return Assignment adini return ediyorum.
     * Amac:Ayni assignmentdan varsa karsilastirma yaparken bu metodu cagirarak varmi 
     * yokmu diye baktirabiliyorum.
     */
    public String getAssignments() 
    {
        return assignmentsName;
    }


    /**
     *
     * Object sinifinin toString metodunu override ederek kullandim.Amac:Farkli 
     * bir yerde assignments uzerinden toString metodu cagrilirsa programla alakasiz seylerin 
     * basilmasini engellemek.
     * @return assignment adini return ettim.
     */    
    @Override
    public String toString() {
        return assignmentsName;
    }
    
}
