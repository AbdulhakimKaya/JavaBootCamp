package HomeworkDay3;

public class Main {
    public static void main(String[] args) {
        StudentUser studentUser = new StudentUser();
        studentUser.id = 9;
        studentUser.firstName = "Abdulhakim";
        studentUser.lastName = "KAYA";

        InstructorUser instructorUser = new InstructorUser();
        instructorUser.id = 1;
        instructorUser.firstName = "Engin";
        instructorUser.lastName = "DEMIROG";

        UserManager userManager = new UserManager();

        User[] users = {studentUser,instructorUser};

        userManager.addMultiple(users);

        userManager.userUpdate(instructorUser);

        userManager.registerForTheCourse(studentUser);

        userManager.defineHomework(instructorUser);
    }

}
