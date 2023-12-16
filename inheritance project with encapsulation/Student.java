public class Student extends Person{
	private static String institute;
	
	private int eno;
	private String course;
	private double fee;
	
	public static String getInstitute(){
		return institute;
	}
	public static void setInstitute(String institute){
		Student.institute = institute;
	}
	
	public int getEno(){
		return eno;
	}
	public void setEno(int eno){
		this.eno = eno;
	}
	public String getCourse(){
		return course;
	}
	public void setCourse(String course){
		this.course = course;
	}
	public double getFee(){
		return fee;
	}
	public void setFee(double fee){
		this.fee = fee;
	}
	
	
	
	public void listen(){
		System.out.println(getName() + " is listening");
	}
	public void reply(){
		System.out.println(getName() + " is replying ");
	}
	public void read(){
		System.out.println(getName() + " is reading ");
	}
	public void write(){
		System.out.println(getName() + " is Writing ");
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n" +
			         (" institute\t: "	+ institute) + "\n" +
				     (" sno\t\t: "		+ eno)		+ "\n" +
				     (" course\t\t: "	+ course)	+ "\n" +
				     (" fee\t\t: "		+ fee);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	