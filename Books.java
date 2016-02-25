/**
 * Documents sinifindan extends edilen Books sinifi icinde Books ismini tutan bookName stringi
 * ve tek parametreli constructor bulunmakta.
 * @author tayyip
 */
public class Books extends Documents
{   
    /**Books ismini tutan bookName stringi*/
    public String bookName;

    /**
     * ust sinifin constructorini cagiriyor.
     * @param documentsName bookName ismini alan string
     */
    public Books(String documentsName) 
    {
        super(documentsName);
        this.bookName=documentsName;
    }
   
}
