package base;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;

public class Person_Test {
	private static PersonDomainModel Per1 = new PersonDomainModel();
	private static PersonDomainModel Per3 = new PersonDomainModel();
	@Test
	public void Test() throws Exception{
		Per1.setBirthday(new Date(0));
		Per1.setCity("Newark");
		Per1.setFirstName("Jake");
		Per1.setLastName("Lamp");
		Per1.setPostalCode(11717);
		Per1.setStreet("Mike");		
		PersonDAL.addPerson(Per1);
		PersonDomainModel per2 = PersonDAL.getPerson(Per1.getPerId());
		assertEquals(Per1.getPerId(), per2.getPerId());
		
		Per3.setBirthday(new Date(0));
		Per3.setCity("Newark");
		Per3.setFirstName("Jake1");
		Per3.setLastName("Lamp1");
		Per3.setPostalCode(11718);
		Per3.setStreet("Mike1");		
		PersonDAL.updatePerson(Per3);
		assertNotEquals(Per3.getFirstName(), Per1.getFirstName());
		ArrayList<PersonDomainModel> persons = PersonDAL.getPersons();
		assertNotNull(persons);
		PersonDAL.deletePerson(Per1.getPerId());
		PersonDAL.deletePerson(Per3.getPerId());
		
		
	}
	@BeforeClass
	public void before() throws Exception {
		
	}

	@AfterClass
	public static void tearDown() throws Exception {
		PersonDAL.deletePerson(Per1.getPerId());
		PersonDAL.deletePerson(Per3.getPerId());
	}
}
