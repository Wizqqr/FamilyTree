import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private String gender;
    private List<Person> children;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.children = new ArrayList<>();
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

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        this.children.add(child);
    }

    @Override
    public String toString() {
        return name + " (" + age + ", " + gender + ")";
    }
}
