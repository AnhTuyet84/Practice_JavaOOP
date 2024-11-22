package Practice_JavaOOP2.Person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Duy Khôi", 9, "Males", "TPHCM", "0954023225");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getAddress());
        System.out.println(person.getPhone());
    }
}
