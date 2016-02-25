/**
 * Documents sinifindan extends edilen Slides sinifi icinde Slides ismini tutan slidesName stringi
 * ve tek parametreli constructor bulunmakta.
 * @author tayyip
 */
public class Slides extends Documents
{
    /**Slides ismini tutan slidesName stringi*/
    public String slidesName;
    
    
    /**
     * ust sinifin constructorini cagiriyor.
     * @param documentsName slides ismini alan string
     */
    public Slides(String documentsName) 
    {
        super(documentsName);
        this.slidesName=documentsName;
    }
    
}
