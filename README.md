# hw01
cse222
Muhammet Tayyip ÇANKAYA-131044054
********************************************************************************
Senaryo 1,2-->Kullanicilar sisteme ekleniyor.

Senaryo 3  -->Kullanicilar sistemden kaldiriliyor veya ayni numarada sistemde 
              baska bir kisi varsa sisteme ekleme yapilmiyor.
              
Senaryo 4,5-->Sisteme kullanici ekleme yetkisi olmayan kisiler ekleme yapmaya 
              calisirsa hata mesaji ile uyariliyor.(Exception firlatip try-catch
              ile yakalaniyor.)
              
Senaryo 6  -->Admin tarafindan sisteme kurslar ekleniyor.

Senaryo 7  -->Teacher tarafindan kurslara ogrenciler ekleniyor.Ayni zamanda 
              ogrencilerde aldigi her kursu kendi icinde tutuyor.
              
Senaryo 8  -->Tek tek kurslarda bulunan ogrenciler ekrana yaziliyor.

Senaryo 9  -->Admin tarafindan sistemden kurs cikartiliyor.

Senaryo 10 -->Teacher tarafindan assignment'lar,deadline,late deadline'lar ve 
              hangi derse eklenecegi belirtiliyor.
              
Senaryo 11 -->Teacher tarafindan dokuman'lar ve hangi derse eklenecegi belirtiliyor.

Senaryo 12 -->Sistem tarafindan tum kullanicilar ve sistemdeki tum kurslar bilgi 
              olarak ekrana veriliyor.
              
NOT-->Senaryolar screenshot olarak dosyada bulunmaktadir.
********************************************************************************
ÖZET:
    Odevde ilk olarak Sistem diye bir sinif yapip icerisinde sistemde bulunan
kullanicilar ve kurslari tutan ArrayListlerim vardi.Bu sistem sinifindan Users ve 
Course diye 2 sinif turettim.Users sinifi ayni zamanda person_interface i ni 
implements etti.Users sinifindan Admin,Teacher,Students siniflari türettim.Daha sonra 
Students sinifi students_interface i ni implements etti ve Tutors sinifini turettim.
Assignments ve Documents siniflari kimseden turemiyor.Ama assignments sinifi 
GroupProject,Quiz,Homework sinifilarini,Documents ise Urls,Books,Slides ve Files
 siniflarini turetti.   
 
 NOT-->Sinif hiyerarsisi resim olarak dosyada bulunmaktadir.  
