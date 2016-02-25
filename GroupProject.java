/**
 * Assignments sinifindan extends edilen GroupProject sinifi icinde GroupProject ismini tutan gpName stringi
 * ve tek parametreli constructor bulunmakta.
 * @author tayyip
 */
public class GroupProject extends Assignments
{
    /**GroupProject ismini tutan gpName stringi*/
    public String gpName;
    
    
    /**
     * ust sinifin constructorini cagiriyor.
     * @param assignmentsName group project ismini alan string
     */
    public GroupProject(String assignmentsName) {
        super(assignmentsName);
        this.gpName=assignmentsName;
    }
    
}
