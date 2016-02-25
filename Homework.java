/**
 * Assignments sinifindan extends edilen Homework sinifi icinde homework ismini tutan hwName stringi
 * ve tek parametreli constructor bulunmakta.
 * @author tayyip
 */
public class Homework extends Assignments
{
    /**Homework ismini tutan hwName stringi*/
    public String hwName;
    
    
    /**
     * Ust sinifin constructorini cagiriyor.
     * @param assignmentsName hwName ismini alan string
     */
    public Homework(String assignmentsName) 
    {
        super(assignmentsName);
        this.hwName=assignmentsName;
    }
    
}
