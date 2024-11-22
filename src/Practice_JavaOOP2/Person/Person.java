package Practice_JavaOOP2.Person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void showInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGender());
      //  System.out.println(getAddress());
       // System.out.println(getPhone());
    }
}
