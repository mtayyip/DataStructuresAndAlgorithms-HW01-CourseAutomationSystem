/**
 * Documents sinifi İcerisinde dokumanin adini tutan bir string ve bir tane constructor,
 * getDocuments ve toString metotlari bulunmaktadir.Tum dokumanlari bu sinifta tutuyorum 
 * book,slide,file,url icin ayri ayri ArrayList ler tutuyorum.
 * @author tayyip
 */
import java.util.ArrayList;
public class Documents 
{
    /**Dokumanin adini tutan string.*/ 
    public String documentsName;
    
    /**Books ile ilgili verileri bu arraylist te tutuyorum.*/    
    protected ArrayList<Books> book=new ArrayList<>();
    
    /**Slides ile ilgili verileri bu arraylist te tutuyorum.*/   
    protected ArrayList<Slides> slide=new ArrayList<>();
    
    /**Files ile ilgili verileri bu arraylist te tutuyorum.*/    
    protected ArrayList<Files> file=new ArrayList<>();
    
    /**Urls ile ilgili verileri bu arraylist te tutuyorum.*/
    protected ArrayList<Urls> url=new ArrayList<>();
    
    
    
    /**
     * Constructor tek parametre alip documents adina atiyor.
     * @param documentsName Dokumanin adini alan parametre
     */
    public Documents(String documentsName) 
    {
        this.documentsName =documentsName;
    }

    /**
     * 
     * @return Dokumanin adini return ediyorum.
     * Amac:Ayni dokumandan varsa karsilastirma yaparken bu metodu cagirarak varmi 
     * yokmu diye baktirabiliyorum.
     */
    public String getDocuments() 
    {
        return documentsName;
    }

    /**
     *
     * Object sinifinin toString metodunu override ederek kullandim.Amac:Farkli 
     * bir yerde dokumanin toString metodu cagrilirsa programla alakasiz seylerin 
     * basilmasini engellemek.
     * @return dokumanin adini return ettim.
     */
    @Override
    public String toString() {
        return documentsName;
    }
}
