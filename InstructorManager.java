public class InstructorManager extends UserManager{

    public void enroll(Course course){
        System.out.println("Kursunuz öğretime açıldı: " + course.courseName);

    }

}
