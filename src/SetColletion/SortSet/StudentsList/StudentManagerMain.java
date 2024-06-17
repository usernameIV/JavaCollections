package SetColletion.SortSet.StudentsList;

public class StudentManagerMain {

    public static void main(String[] args) {

        StudentsManager std = new StudentsManager();

        std.addStudent("Danton", 1648225, 6.25);
        std.addStudent("Adiles", 1642131, 9.0);
        std.addStudent("Nebula", 1603232, 10.00);
        std.addStudent("Danton", 1648225, 9.0);

        std.displayStudents();
        System.out.println();
        System.out.println("Students sorted by name: ");
        System.out.println(std.displayStudentsByName());


        System.out.println();
        System.out.println("Students sorted by grade: ");
        System.out.println(std.displayStudentsByGrade());

    }
}
