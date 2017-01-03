/**
 * 
 */
package java1;

/**
 * @author Preston
 *
 */
public class Professor extends PersonBase {
//public class Professor extends PersonBase implements Person {
	private String  title;
	
	public Professor(String _name, Integer _age, String _title) {
		super(_name, _age);
		title = _title;
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.myapp.mycomponent.Person#getName()
	 */
	@Override
	public String getName() {
		return "Professor: " + super.getName();
	}


}
