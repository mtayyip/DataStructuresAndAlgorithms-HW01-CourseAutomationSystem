/**
 * Students_interface arayüzü kendisini implements eden siniflarin arayüzde bulunan
 * metotlari KESİNLİKLE override etmesini saglamaktadir.Ben bu arayuzu Students ve Tutors
 * siniflarinda implements ettim ve bu siniflarin bu metodu override etmesini 
 * sagladim.(Aslinda Students sinifinda implements ettigim icin Students dan turettigim
 * Tutors sinifina implement etmeme gerek yoktu.Cunku Students sinifi icin zorunlu 
 * override edilmesi gereken bu metot,subclass olan Tutors sinifi icinde zorunluydu,
 * Ancak kodlari okumakta kolaylik ve daha iyi gorulmesi icin her iki sinifada implements ettim.)
 * Bunu yapmaktaki amacim her iki sinifinda kullanicilari derslerdeki notlarini gorebilmeleriydi.
 * @author tayyip
 */
public interface Students_interface 
{
   
    
    /**Ogrencinin notlarini gormesi icin yapilan metot
     * 
     * @param grade not
     * @return not
     */
    public int viewGrades(int grade);
}
