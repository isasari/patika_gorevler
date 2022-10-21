import java.util.Scanner;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int quiz;
    Teacher teacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quiz=0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.prefix.equals(this.prefix)) {
            this.teacher = teacher;
        } else System.out.println("Öğretmen - ders seçimi uyumlu değil.");

    }

    void Print() {
        System.out.print("Ders: " + name + "\n" +
                "Öğretmen: " + teacher);
    }


}
