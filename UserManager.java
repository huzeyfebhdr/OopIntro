public class UserManager{
public void start(){
    System.out.println("Kullanıcı Kursa başladı");
}
    public void enroll(Course course){
        System.out.println("Kurs başlatıldı: " + course.courseName);
    }
    public void deleteCourse(Course course){
        System.out.println("Kursunuz silindi " + course.courseName);

    }
public void addMultiple(UserManager[] liste){
        for(UserManager i:liste){
            i.start();
        }

}

}
