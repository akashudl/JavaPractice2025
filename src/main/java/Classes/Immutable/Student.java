package Classes.Immutable;

import java.util.ArrayList;
import java.util.List;

public final class  Student {


    // whose objects cannot be modified once they are created.
    //no setter method shopuld be there
    // instance varibales should be priavte
    private final String studentName;
    private final List<String> Subject;

    Student (String studentName,List<String>subject)
    {
        this.studentName=studentName;
        this.Subject=subject;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getSubject() {
        return new ArrayList<>(Subject);
    }
}
