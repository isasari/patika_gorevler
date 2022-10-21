public class Teacher {
    String name;
    String mphone;
    String branch;
    String prefix;


    Teacher(String name, String mphone, String branch, String prefix){
        this.name=name;
        this.mphone=mphone;
        this.branch=branch;
        this.prefix=prefix;
    }
    void  Print(){
        System.out.println("Öğretmenin\n" +
                "Adı: " + name + "\n" +
                "Telefonu: " + mphone + "\n" +
                "Branşı: " + branch + "\n" +
                "****************");
    }

    }
