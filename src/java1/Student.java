/**
 * 
 */
package java1;

/**
 * @author Preston
 *
 */
public class Student extends PersonBase implements  Studying{
	
	private String grade;
	private String id;
	
	public Student() {
		super("Preston", 12);
	}

	public Student(String _name, Integer _age) {
		super(_name, _age);
	}

	
	public Student(String _name, Integer _age, String _grade) {
		this(_name, _age);
		grade = _grade;
	}
	
	
	public Student(String _name, Integer _age, String _grade, String _id) {
		this(_name, _age, _grade);
		id = _id;
	}
	
	public String getName(String _name, Integer _age) {
		return name;
	}
	
	public String getName(String _lastName) {
		return name + _lastName;
	}

	@Override
	public Integer getAge() {
		return age - 10;
	}

	@Override
	public String studyFor() {
		// TODO Auto-generated method stub
		return "IT114";
	}

}
