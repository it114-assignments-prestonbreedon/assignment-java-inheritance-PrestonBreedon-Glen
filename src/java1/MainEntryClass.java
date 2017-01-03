package java1;

/**
 * @author Preston
 *
 */
public class MainEntryClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("BEGIN");
		
		Student student1 = new Student("Preston", 12, "middleSchool", "1234");
		System.out.println("student1 name:" + student1.getName());
		
		Professor p1 = new Professor("Albert", 101, "Ordinarious");
		System.out.println("p1 name:" + p1.getName());
		
		Person person1 = student1;
		System.out.println("person1 name:" + person1.getName());
		Studying studying1 = student1;
		System.out.println("studying1 studyFor:" + studying1.studyFor());
		
		Person person2 = new Student("kiris", 22, "college", "4321");
		System.out.println("person1 name:" + person2.getName());

		
	}

}
