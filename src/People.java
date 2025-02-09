public class People {

    //Variables that will get the information
    private String name;
    private int age;
    private String gender;
    private String email;
    private String idNumber;

    //Constructor (Here an encapsulation block with objects was created)
    public People(String name, int age, String gender, String email, String idNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.idNumber = idNumber;
    }

    //In this part, getters and setters were used to ensure access and modification of attributes.

    //Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Age
    public int getAge(int age) {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Gender
    public String getGender(String gender) {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    //Email
    public String getEmail(String email) {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //IdNumber
    public String getIdNumber(String idNumber) {
        return idNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    //Code output method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Email: " + email + ", IdNumber: " + idNumber;
    }
}