package Classes.Immutable;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> subject=new ArrayList<>();
        subject.add("math");
        subject.add("English");
        Student s=new Student("Akash",subject);
        s.getSubject().add("Science");
        System.out.println(s.getSubject());
    }
}
