package SetColletion.SortSet.StudentsList;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentsManager {

    private Set<Student> students;

    public StudentsManager() {
        this.students = new HashSet<>();
    }
    public void addStudent(String name, long id, double grade) {
        students.add(new Student(name,  id,  grade));
    }
    public void removeStudent(long id) {
        Student studentToRemove = null;
        if (!students.isEmpty()) {
            for (Student std : students) {
                if (std.getId() == id) {
                    studentToRemove = std;
                }
            }
            students.remove(studentToRemove);
        }
    }
    public Set<Student> displayStudentsByName() {
        Set<Student> studentsByName = new TreeSet<>(students);
        return studentsByName;
    }
    public Set<Student> displayStudentsByGrade() {
        Set<Student> studentsByGrade = new TreeSet<>(new ComparatorPerGrade());
        studentsByGrade.addAll(students);
        return studentsByGrade;
    }
    public void displayStudents() {
        for (Student std : students) {
            System.out.print(std);
        }

    }

}
