package AccessModifier_static.equals;

import java.util.Objects;

public class Test {
    private String name;
    private static int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return age == test.age && Objects.equals(name, test.name);
    }
}
