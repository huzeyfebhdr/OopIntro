public class StudentManager extends UserManager{
    public void start(){
        System.out.println("Öğrenci Kursa başladı");
    }
    public void enroll(Course course){
        System.out.println("Kurs'a kaydolundu: " + course.courseName);
    }


}
