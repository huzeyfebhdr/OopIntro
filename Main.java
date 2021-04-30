public class Main {
    public static void main(String[] args) {

        System.out.println("------ilk kurs kayıt denemesi------");
        UserManager userManager = new UserManager();
        userManager.enroll(new Course("Java","Engin Demiroğ","16"));


        System.out.println("------ilk polimorfizm denemesi------" +
                "");

        UserManager[] liste = {new StudentManager(),new InstructorManager()};
        userManager.addMultiple(liste);



        }
    }

