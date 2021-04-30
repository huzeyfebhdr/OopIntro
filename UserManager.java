public class UserManager{

    public void enroll(Course course){
        System.out.println("Kurs başlatıldı: " + course.courseName);
    }
    public void deleteCourse(Course course){
        System.out.println("Kursunuz silindi " + course.courseName);

    }


}
