public class Student {
    String name;
    String stuNo;
    String classes;
    Course ing;
    Course mat;
    Course tarih;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course ing, Course mat, Course tarih) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.ing = ing;
        this.tarih = tarih;
        this.avarage=0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int not1, int not2, int not3, int quiz1, int quiz2, int quiz3) {
        if (not1 >= 0 && not1 <= 100) {
            this.mat.note = not1;
        }else this.mat.note=0;
        if (not2 >= 0 && not2 <= 100) {
            this.ing.note = not2;
        }else this.ing.note=0;
        if (not3 >= 0 && not3 <= 100) {
            this.tarih.note = not3;
        }else this.tarih.note=0;
        if (quiz1>=0 && quiz1<=100){
            this.mat.quiz=quiz1;
        }else this.mat.quiz=0;
        if (quiz1>=0 && quiz2<=100){
            this.tarih.quiz=quiz2;
        }else this.tarih.quiz=0;
        if (quiz1>=0 && quiz3<=100){
            this.ing.quiz=quiz3;
        }else this.ing.quiz=0;
        double trh = ((this.tarih.note*0.80)+(this.tarih.quiz*0.20));
        double dil = ((this.ing.note*0.80)+(this.ing.quiz*0.20));
        double calc= ((this.mat.note*0.80)+(this.mat.quiz*0.20));
        avarage = (dil+trh+calc) / 3.0;
    }
    void Print() {
        System.out.print("Matematik notu: " + ((this.mat.note*0.80)+(this.mat.quiz*0.20)) + "\n" +
                "İngilizce notu: " + ((this.ing.note*0.80)+(this.ing.quiz*0.20))  + "\n" +
                "Tarih notu: " + ((this.tarih.note*0.80)+(this.tarih.quiz*0.20))  + "\n" +
                "Not ortalaması: " + avarage);

    }

    void isPass(){
        if (avarage>=50){
            isPass=true;
            System.out.println("\nSınıfı geçtiniz.");
        }else {
            isPass=false;
            System.out.println("\nSınıfta kaldınız.");
        }
    }


}

