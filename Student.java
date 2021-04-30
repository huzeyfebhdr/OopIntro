public class Student extends User{
    int attendance;
    Course courses[];

    public Student(int id, String userName, String password, int attendance, Course[] courses) {
        super(id, userName, password);
        this.attendance = attendance;
        this.courses = courses;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}
