package ru.astondevs.lesson9.task4;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Result {

    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 16, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        System.out.println("\nСредний возраст: " + averageStudentAge(students));
        System.out.println("\nПризывники: " + appeal(students));
    }

    public static double averageStudentAge(Collection<Student> students) {
        Collection<Student> maleStudents = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .collect(Collectors.toList());

        double averageAge = maleStudents.stream()
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble();
        return averageAge;
    }

    public static Collection<Student> appeal(Collection<Student> students) {
        Collection<Student> maleStudents = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .collect(Collectors.toList());

        Stream<Student> conscriptionAgeStudents = maleStudents.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27);

        return conscriptionAgeStudents.collect(Collectors.toList());
    }
}
