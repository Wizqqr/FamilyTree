public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Person john = new Person("John", 40, "Male");
        Person mary = new Person("Mary", 38, "Female");
        Person paul = new Person("Paul", 18, "Male");
        Person anna = new Person("Anna", 16, "Female");

        familyTree.addPerson(john);
        familyTree.addPerson(mary);

        familyTree.addChild("John", paul);
        familyTree.addChild("John", anna);
        familyTree.addChild("Mary", paul);
        familyTree.addChild("Mary", anna);

        System.out.println("Children of John:");
        for (Person child : familyTree.getChildren("John")) {
            System.out.println(child);
        }

        System.out.println("Children of Mary:");
        for (Person child : familyTree.getChildren("Mary")) {
            System.out.println(child);
        }
    }
}
