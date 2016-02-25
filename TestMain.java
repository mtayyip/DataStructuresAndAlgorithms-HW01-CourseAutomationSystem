public class TestMain {

    public static void main(String[] args) 
    {
        
        Sistem moodle = new Sistem();
        Admin admin = new Admin("Yasemin", "Kaya", 999);
        
        Tutors tutor1 = new Tutors("Elif", "Yılmaz", 131044);
        Tutors tutor2 = new Tutors("Muhammet", "Tayyip", 1310344);
        Tutors tutor3 = new Tutors("Ali", "Riza", 131000);
        Students student1 = new Students("Fatma", "Kurt", 141044);
        Students student2 = new Students("Ahmet", "Can", 141045);
        Students student3 = new Students("Tayyip", "Cankaya", 141044);
        Teachers teacher1 = new Teachers("Mustafa", "Demir", 1001);
        Teachers teacher2 = new Teachers("İsmail", "Aydin", 1002);
        Teachers teacher3 = new Teachers("Yusuf", "Koc", 1003);
        
        
        /*Kullanicilar admin tarafindan sisteme ekleniyor.Senaryo 1*/
        admin.addUser(teacher1, moodle);
        admin.addUser(teacher2, moodle);
        admin.addUser(teacher3, moodle);
        admin.addUser(tutor1, moodle);
        admin.addUser(tutor2, moodle);
        admin.addUser(tutor3, moodle);
        
        /*Kullanicilar teacher tarafindan sisteme ekleniyor.Senaryo 2*/
        teacher2.addUser(student1, moodle);
        teacher1.addUser(student2, moodle);
        teacher3.addUser(student3, moodle);
        
        /*sistemden Kullanici kaldiriliyorSenaryo 3*/
        admin.removeUser(tutor3, moodle);
        
        
       /*Sisteme kullanici ekleme yetkisi olmayan kisiler ekleme yapmaya 
              calisirsa Exception firlatiliyor Senaryo 4*/ 
        try {
            student1.addUser(admin, moodle);} 
        catch (Exception exception) {
            System.out.println(exception.getMessage());}
        
        
        try {
            tutor1.removeUser(student1, moodle);} 
        catch (Exception exception) {
            System.out.println(exception.getMessage());}
        
        
        /*kurslar ekleniyor.Senaryo 5*/
        Course bil101 = new Course("BIL101", 101);
        Course bil102 = new Course("BIL102", 102);
        Course mat118 = new Course("MAT118", 118);
        Course bil232 = new Course("BIL232", 232);
        Course bil244 = new Course("BIL244", 244);
        Course bil222 = new Course("BIL222", 222);
        Course mat101 = new Course("MAT101", 1010);
        
        
        /*Admin tarafindan sisteme kurslar ekleniyor.Senaryo 6*/
        admin.addCourse(bil232, moodle);
        admin.addCourse(bil244, moodle);
        admin.addCourse(bil101, moodle);
        admin.addCourse(bil102, moodle);
        admin.addCourse(mat118, moodle);
        admin.addCourse(bil222, moodle);
        admin.addCourse(mat101, moodle);
        
        
        
        /*Teacher tarafindan kurslara ogrenciler ekleniyor.Senaryo 7*/       
        teacher1.addCourseUser(bil101, student1, moodle);
        teacher2.addCourseUser(bil101, student1, moodle);
        teacher2.addCourseUser(bil102, student1, moodle);
        teacher1.addCourseUser(bil244, student1, moodle);
        teacher2.addCourseUser(bil101, student2, moodle);
        teacher1.addCourseUser(bil102, student2, moodle);
        teacher1.addCourseUser(bil244, student3, moodle);
        teacher2.addCourseUser(bil101, student3, moodle);
        teacher1.addCourseUser(bil102, student3, moodle);
        teacher3.addCourseUser(bil222, tutor1, moodle);
        teacher1.addCourseUser(bil232, tutor1, moodle);
        teacher2.addCourseUser(mat118, tutor1, moodle);
        teacher3.addCourseUser(bil222, tutor2, moodle);
        teacher2.addCourseUser(bil102, tutor2, moodle);
        teacher1.addCourseUser(bil101, tutor3, moodle);
        teacher2.addCourseUser(bil232, tutor3, moodle);
        
        
        
        /*Tek tek kurslarda bulunan ogrenciler ekrana yaziliyor.Senaryo 8*/
        bil101.coursesUsers();
        bil102.coursesUsers();
        bil232.coursesUsers();
        mat101.coursesUsers();
        mat118.coursesUsers();
        bil222.coursesUsers();
        bil244.coursesUsers();
        
        
        /*Admin tarafindan sistemden kurs cikartiliyor.Senaryo 9*/
        admin.removeCourse(mat101, moodle);
        
        
        
        Homework hw232 = new Homework("Devre Homework1");
        Homework hw222 = new Homework("Devre Homework1");
        GroupProject gp102 = new GroupProject(" Bilgisayara Giris Grup Projesi");
        
        /*Teacher tarafindan assignment'larin hangi derse eklenecegi belirtiliyor.Senaryo 10*/        
        teacher1.addAssignments(hw232, "21.02.2016", "22.02.2016", bil232);
        teacher1.addAssignments(hw222, "25.02.2016", "26.02.2016", bil222);
        teacher2.addAssignments(gp102, "25.02.2016", "27.02.2016", bil101);
        
        /*Teacher tarafindan dokuman'lar ve hangi derse eklenecegi belirtiliyor.Senaryo 11*/        
        teacher1.addDocuments(new Files(mat118.getCourse() + " Probability of Statistics for Engineering"), mat118);
        teacher2.addDocuments(new Books(bil101.getCourse() + " Computer Science,8th Edition"), bil101);
        teacher2.addDocuments(new Slides(bil102.getCourse() + " C Dersi Slaytlari"), bil102);
        
        
        /*tum kullanicilar ve tum kurslar ekrana veriliyor.Senaryo 12*/        
        moodle.printUser();
        moodle.printCourse();
    }
}
