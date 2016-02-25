/**
 * Assignments sinifindan extends edilen Quiz sinifi icinde Quiz ismini tutan quizName stringi
 * ve tek parametreli constructor bulunmakta.
 * @author tayyip
 */
public class Quiz extends Assignments
{
    /**Quiz ismini tutan quizName stringi*/
    public String quizName;
    
    
    /**
     * ust sinifin constructorini cagiriyor.
     * @param assignmentsName quizName ismini alan string
     */
    public Quiz(String assignmentsName) 
    {
        super(assignmentsName);
        this.quizName=assignmentsName;
    }
    
}
