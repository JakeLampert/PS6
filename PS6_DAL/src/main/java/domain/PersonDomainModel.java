package domain;


import java.util.Date;
import java.util.UUID;

public class PersonDomainModel {

    private  String firstName;
    private  String lastName;
    private  String street;
    private  Integer postalCode;
    private  String city;
    private  Date birthday;
    private UUID PerId;
    /**
     * Default constructor.
     */
    public PersonDomainModel() {
    	this.setPerId(UUID.randomUUID());
    }
    
    public PersonDomainModel(String FirstName, String LastName, String Street, Integer PostalCode, String City, Date Birthday){
    	this();
    	FirstName=firstName;
    	LastName=lastName;
    	Street=street;
    	PostalCode=postalCode;
    	City=city;
    	Birthday=birthday;
    }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public UUID getPerId() {
		return PerId;
	}
	public void setPerId(UUID perId) {
		PerId = perId;
	}

}