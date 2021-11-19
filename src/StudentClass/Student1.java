
package StudentClass;

import Generic.GenericStudent;

public class Student1 extends GenericStudent {
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String newNameString) {
        name = newNameString;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }
}
