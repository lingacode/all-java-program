class Company{
    public static void main(String[] args){
    Employee e1 = new Employee();
    Employee e2 = new Employee();


    e1.sno = 103;
    e1.sname ="Hari";
    e1.department = "cj";
    e1.sal = 2500;

    e2.sno = 104;
    e2.sname ="Balaaya";
    e2.department = "Acting";
    e2.sal = 3500;
   
    System.out.println("e1.sno\t\t" + e1.sno);
    System.out.println("e1.sname\t" + e1.sname);
    System.out.println("e1.department\t" + e1.department);
    System.out.println("e1.sal\t\t" + e1.sal);

    System.out.println("e2.sno\t\t" + e2.sno);
    System.out.println("e2.sname\t" + e2.sname);
    System.out.println("e2.department\t" + e2.department);
    System.out.println("e2.fee\t\t" + e2.sal);
    }
}
