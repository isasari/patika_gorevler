public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear=2021;
    double t;
    int b;
    double r;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }

    double tax() {
        if (this.salary <= 1000) {
            t = 0;
        } else t = (this.salary * 3) / 100;
       return t;
    }

    int bonus() {
        if (this.workHours >= 40) {
            b = (this.workHours - 40) * 30;
        } else b = 0;
        return b;
      //  System.out.println(b);
    }

    double raiseSalary() {
        r=2021-hireYear;
        if (this.r < 10) {
            r = (salary * 5) / 100;
        } else if (r < 20) {
            r = (salary * 10) / 100;
        } else r = (salary * 15) / 100;
       return r;
    }

    void print() {
        double total= bonus() + raiseSalary()+ tax();
        System.out.println(
                        "***************************************\n" +
                        "Adı: " + name + "\n" +
                        "Maaşı :" + salary + "\n" +
                        "Çalışma Saati: " + workHours + " \n" +
                        "Başlangıç yılı: " + hireYear + "\n" +
                        "Vergi: " + t + "\n" +
                        "Bonus: " + b + "\n" +
                        "Maaş Artışı: " + r + "\n" +
                        "Maaşa eklenecek toplam miktar: " + (b + r) + "\n" +
                        "Kesintiler toplamı: " + t + "\n" +
                        "Net Ödenen: " + ((salary + r + b) - t)
        );
    }
}




