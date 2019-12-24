package ming.teacher;

import ming.superclass.Person;

public class Teacher extends Person {
    @Override
    public String getType() {
        return "教师";
    }

    @Override
    public String getWork() {
        return "教授Java";
    }
}
