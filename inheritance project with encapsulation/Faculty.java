public class Faculty extends Person{
	private static String institute;
	
	private int eno;
	private String dept;
	private String subject;
	private double sal;
	
	public static String getInstitute(){
		return institute;
	}
	public static void setInstitute(String institute){
		Faculty.institute = institute;
	}
	
	public int getEno(){
		return eno;
	}
	public void setEno(int eno){
		this.eno = eno;
	}
	public String getDept(){
		return dept;
	}
	public void setDept(String dept){
		this.dept = dept;
	}
	public String getSubject(){
		return subject;
	}
	public void setSubject(String subject){
		this.subject = subject;
	}
	public double getSal(){
		return sal;
	}
	public void setSal(double sal){
		this.sal = sal;
	}
	
	
	public void teach(){
		System.out.println(getName() + " is teaching "+ subject);
	}
	public void preparematerial(){
		System.out.println(getName() +" is preparing "+ subject + "material");
	}
	public static void main(String[] args){
			Faculty f1 = new Faculty();
				System.out.println(f1.toString());				
	}
	
	@Override
	public String toString(){
		return super.toString()+" institute\t: "	+ institute + "\n" +
				" eno\t\t: "	+ eno+ "\n" +
				" dept\t\t: "	+ dept	+ "\n" +
			    "subject\t\t: "	+ subject + "\n" +
				" sal\t\t: "	+ sal ;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	