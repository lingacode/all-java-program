class College{
    public static void main(String[] args){
    Student s1 = new Student();
    Student s2 = new Student();
	
	s1.sno = 101;
	s1.sname = "Hari";
	s1.course = "cj";
	s1.fee = 2500;
 
	s2.sno = 102;
	s2.sname = "Balaaya";
	s2.course = "Acting";
	s2.fee = 3500;

     System.out.println("\n s1 object values ");
     System.out.println("s1.Sno\t\t" + s1.sno);
     System.out.println("s1.Sname\t" + s1.sname);
     System.out.println("s1.Course\t" + s1.course);
     System.out.println("s1.Fee\t\t" + s1.fee);

     System.out.println("\n s2 object values ");
     System.out.println("s2.sno\t\t" + s1.sno);
     System.out.println("s2.sname\t" + s1.sname);
     System.out.println("s2.course\t" + s1.course);
     System.out.println("s2.fee\t\t" + s1.fee);
     }
}