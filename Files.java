/**
 * Documents sinifindan extends edilen Files sinifi icinde Files ismini tutan fileName stringi
 * ve tek parametreli constructor bulunmakta.
 * @author tayyip
 */
public class Files extends Documents
{
    /**Files ismini tutan fileName stringi*/
    public String fileName;
    
    /**
     * ust sinifin constructorini cagiriyor.
     * @param documentsName fileName ismini alan string
     */
    public Files(String documentsName) {
        super(documentsName);
        this.fileName=documentsName;
    }
    
}
