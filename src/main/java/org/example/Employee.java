package org.example;

public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary(double salary) {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }


    public double tax(){
        //maaş 1000 tl den az ise vergi uygulanmaz fazla ise maaşın %3 ü kadar vergi uygulanır

        this.salary=getSalary(salary);

        if (salary>1000) {
            double tax = (salary*0.03);
            return tax;
        } else {
            return 0;
        }
    }

    public int bonus(){
        // çalışan haftada 40 saatten fazla çalıştıysa çalıştığı her saat başına 30 tl bonus ücret hesaplanır

        this.workHours = getWorkHours();
        this.salary=getSalary(salary);

        if(workHours > 40) {
            int bonus = (workHours - 40) * 30;
            return bonus;
        } else {
            return 0;
        }
    }

    public double raiseSalary(){
        /*
        çalışanın başlangıç yılına göre maaş artışı hesaplanır
        (şuan ki yıl 2021 alınır)
        çalıştığı yıl < 10 yıl maaş zammı %5
        çalıştığı yıl > 9 ve çalıştığı yıl <20 yıl maaş zammı %10
        çalıştığı yıl > 19 yıl maaş zammı %15
         */

        this.hireYear=getHireYear();
        this.salary=getSalary(salary);
        int totalYear = 2021-hireYear;
        double raise;

        if (totalYear < 10){
            return raise = salary*0.05;
        } else if (totalYear<20){
            return raise = salary*0.10;
        } else {
            return raise = salary*0.15;
        }

    }

    public String toString(){

        double tax = tax();
        int bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus=salary-tax+bonus;
        double totalSalary= salaryWithTaxAndBonus+raise;

        return "Adı: " +name+
                "\nMaaşı: "+salary +
                "\nÇalışma Saatleri: "+workHours+
                "\nBaşlangı Yılı: "+hireYear+
                "\nVergi: "+tax+
                "\nBonus: "+bonus+
                "\nMaaş Artışı: "+raise+
                "\nVergi ve Bonuslar ile birlikte maaş: "+salaryWithTaxAndBonus+
                "\nToplam Maaş: "+totalSalary;
    }
}
