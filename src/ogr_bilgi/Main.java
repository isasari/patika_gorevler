import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Teacher t1 = new Teacher("İsa", "555", "Tarih", "TRH\n");
        Teacher t2 = new Teacher("Ali", "444", "Matematik", "MAT\n");
        Teacher t3 = new Teacher("Veli", "222", "İnglizce", "ING\n");

        Course mat = new Course("Matematik", "101", "MAT\n");
        Course tarih = new Course("Tarih", "105", "TRH\n");
        Course ing = new Course("İngilizce", "202", "ING\n");

        tarih.addTeacher(t1);
        mat.addTeacher(t2);
        ing.addTeacher(t3);
        Student recep = new Student("Recep", "1453", "4", mat, tarih, ing);
        recep.addBulkExamNote(70, 80, 40, 50, 600,90);
        recep.Print();
        recep.isPass();
    }
}















