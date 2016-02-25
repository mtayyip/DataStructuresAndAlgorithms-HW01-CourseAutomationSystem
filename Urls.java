/**
 * Documents sinifindan extends edilen Urls sinifi icinde Urls ismini tutan urlName stringi
 * ve tek parametreli constructor bulunmakta.
 * @author tayyip
 */
public class Urls extends Documents
{
    /**Urls ismini tutan urlName stringi*/
    public String urlName;
    
    /**
     * ust sinifin constructorini cagiriyor
     * @param documentsName url ismini alan string
     */
    public Urls(String documentsName) 
    {
        super(documentsName);
        this.urlName=documentsName;
    }
    
}
