package HomeworkDay4.GameDemo.entities;

public class Gamer {

    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirthday;
    private String nationalityId;
    private String nickName;

    public Gamer() {
    }

    public Gamer(int id, String firstName, String lastName, String dateOfBirthday, String nationalityId, String nickName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDateOfBirthday(dateOfBirthday);
        this.setNationalityId(nationalityId);
        this.setNickName(nickName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
