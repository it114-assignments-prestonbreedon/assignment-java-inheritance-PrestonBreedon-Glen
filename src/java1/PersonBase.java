package java1;

/**
 * @author Preston
 *
 */
public abstract class PersonBase implements Person {
	protected String  name;
	protected Integer age;
	
	public PersonBase(String _name, Integer _age) {
		name = _name;
		age = _age;
	}
	
	public PersonBase() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Integer getAge() {
		return age;
	}

}
