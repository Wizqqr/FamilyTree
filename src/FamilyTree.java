import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FamilyTree {
    private Map<String, Person> people;

    public FamilyTree() {
        this.people = new HashMap<>();
    }

    public void addPerson(Person person) {
        people.put(person.getName(), person);
    }

    public Person getPerson(String name) {
        return people.get(name);
    }

    public List<Person> getChildren(String name) {
        Person person = getPerson(name);
        if (person != null) {
            return person.getChildren();
        }
        return new ArrayList<>();
    }

    public void addChild(String parentName, Person child) {
        Person parent = getPerson(parentName);
        if (parent != null) {
            parent.addChild(child);
            addPerson(child);
        }
    }
}
