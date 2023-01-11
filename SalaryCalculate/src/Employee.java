public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        if (this.salary>1000)
            return salary*0.03;
        else
            return 0; //this.salary;
    }
     double bonus(){
        double hourBonus=0;
        if (this.workHours>40){
            hourBonus=this.workHours-40;
            return hourBonus*30;
        }
        return hourBonus;
     }

     double raiseSalary(){
        if (2021-this.hireYear<10)
            return this.salary*0.05;
        if (2021-this.hireYear>=10 && 2021-this.hireYear<20)
            return  this.salary*0.10;
        if (2021-this.salary>=20)
            return this.salary*0.15;
        return 0;
     }

      void toSString(){
        String info="Adı: "+this.name+"\n" +
                "Maaşı: "+this.salary+"\n" +
                "Çalışma Saati: "+this.workHours+"\n" +
                "Başlangıç Yılı: "+this.hireYear+"\n" +
                "Vergi: "+tax()+"\n" +
                "Bonus: "+bonus()+"\n" +
                "Maaş Artışı: "+raiseSalary()+"\n" +
                "Vergi Ve Bonuslar İle Maaş: "+ (this.salary+bonus()-tax())+"\n" +
                "Toplam Maaş: "+(this.salary+raiseSalary()+bonus()-tax());

          System.out.println(info);
     }
}