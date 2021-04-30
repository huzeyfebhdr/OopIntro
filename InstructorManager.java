public class InstructorManager extends UserManager{

    public void start(){
        System.out.println("Hoca Kursa başladı");
    }
    public void enroll(Course course){
        System.out.println("Kursunuz öğretime açıldı: " + course.courseName);

    }

}
