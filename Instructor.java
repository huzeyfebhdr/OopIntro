public class Instructor extends User{
        String courseGiven;

        public Instructor(int id, String userName, String password, String courseGiven) {
                super(id, userName, password);
                this.courseGiven = courseGiven;
        }


        public String getCourseGiven() {
                return courseGiven;
        }

        public void setCourseGiven(String courseGiven) {
                this.courseGiven = courseGiven;
        }
}
