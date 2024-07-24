package ahm13_day1;

public class Studentinfo {
	public static void main(String[] args) {
		Student s1 = new Student("Prathmesh", 12, "CSE");
		// s1.name="abcd";
		// s1.setName("Prathmesh");
		// System.out.println(s1.getName());
		System.out.println(s1);
		
		Student s2=new Student();
		s2.show();
		System.out.println(s2);
		
		
	}
}
