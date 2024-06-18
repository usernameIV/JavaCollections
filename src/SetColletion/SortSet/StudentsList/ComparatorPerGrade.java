package SetColletion.SortSet.StudentsList;

import java.util.Comparator;

public class ComparatorPerGrade implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGrade(), s2.getGrade()  );
    }
}
