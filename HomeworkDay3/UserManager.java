package odev3.Gun;

public class UserManager {
    public void add(User user) {
        // kullanici ekleme kodlari
        System.out.println("id numarasi " + user.id + " olan " + user.firstName + " " + user.lastName + " kullanicisinin kaydi yapilmistir.");
    }

    public void addMultiple(User[] users) {
        for(User user : users) {
            add(user);
        }
    }

    public void userUpdate(User user) {
        // kisi bilgileri guncelleme kodlari
        System.out.println("bilgileriniz basariyla guncellenmistir..");
    }

    public void registerForTheCourse(StudentUser studentUser) {
        // kurs kaydi islemi kodlari
        System.out.println(studentUser.firstName + " " + studentUser.lastName + " kurs kaydiniz basariyla gerceklestirilmistir..");
    }

    public void defineHomework(InstructorUser instructorUser) {
        // odev tanimlama kodlari
        System.out.println(instructorUser.firstName + " " + instructorUser.lastName + " tarafindan odev basariyla olusturulmustur");
    }

}
