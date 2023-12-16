
abstract class Person{
	String name;
	int age;
}
class Student extends Person{
	int rollno;
	int marks;
	Student(String name,int age,int rollno,int marks){
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.marks = marks;
	}	
}


