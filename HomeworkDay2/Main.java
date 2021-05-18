package odev2.Gun;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course(1,"Yazilim Gelistirici Yetistirme Kampi","Engin DEMIROG",0);
        Course course2 = new Course(2,"Yazilim Gelistirici Yetistirme Kampi (JAVA & REACT)","Engin DEMIROG",0);
        Course course3 = new Course(3,"Programlamaya Giris Icin Temel Kurs","Engin DEMIROG",0);
        
        Course[] courses = {course1,course2,course3};

        for (Course course : courses) {
            System.out.println(course.courseName + " programi " + course.unitPrice + " TL karsiliginda " + course.teacherName + " tarafindan anlatilmaktadir");
        }

        CourseManager courseManager = new CourseManager();
        courseManager.findACourse();
        courseManager.beIncludedInTheProgram(course2);
    }
}
