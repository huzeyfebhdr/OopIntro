public class StudentManager extends UserManager{

    public void enroll(Course course){
        System.out.println("Kurs'a kaydolundu: " + course.courseName);
    }


}
