package SetColletion.SortSet.StudentsList;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name;
    private long id;
    private double grade;

    public Student (String name, long id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }
    public long getId() {
        return id;
    }
    public double getGrade() {
        return grade;
    }

    public String toString() {
        return '\n'
        + "Student: " + '\n'
        + "Name - " + name + '\n'
        + "Id - " + id + '\n'
        + "Grade - " + grade + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getId() == student.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public int compareTo(Student s) {
        return name.compareTo(s.getName());
    }
}
