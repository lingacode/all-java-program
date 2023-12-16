
abstract class Person1{
	String name;
	int age;
	Person1(String name,int age){
		this.name= name;
		this.age = age;
	}
}
class Student1 extends Person1{
	int rollno;
	int marks;
	
	Student1(String name,int age,int rollno,int marks){
		super(name,age);
		this.rollno = rollno;
		this.marks = marks;
	}	
}


