
public class Address {
	private String city;
	private String street;
	int count=0;
	///s
	
	
	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}
	public String getCity() {
		count++;
		System.out.println(count);
		return city;
		
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	

}
