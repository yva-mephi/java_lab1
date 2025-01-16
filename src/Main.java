import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Добавление студентов
        students.add(new Student("Иванов Иван", "Группа 1", 1, List.of(4, 5, 3)));
        students.add(new Student("Петров Петр", "Группа 1", 1, List.of(2, 3, 4)));
        students.add(new Student("Сидоров Сидор", "Группа 2", 2, List.of(5, 4, 5)));
        students.add(new Student("Алексеева Алена", "Группа 2", 2, List.of(3, 4, 2)));
        students.add(new Student("Смирнов Сергей", "Группа 3", 3, List.of(4, 5, 4)));
        students.add(new Student("Смирнов Сергей", "Группа 3", 4, List.of(2, 3, 2)));
        students.add(new Student("Смирнов Сергей", "Группа 3", 3, List.of(4, 2, 2)));

        // Вывод полного списка студентов
        System.out.println("Вот полный список студентов:");
        printAllStudents(students);

        // Удаление студентов с низким средним баллом и повышаем остальных
        deleteStudents(students);

        // Вывод списка студентов после удаления и повышения
        System.out.println("\nВот список после анализа баллов:");
        printAllStudents(students);

        // Вывод студентов на 2 курсе
        System.out.println("\nВот имена студентов на 2 курсе:");
        printStudents(students, 2);
    }

    public static void deleteStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            } else {
                student.promote();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void printAllStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
