

public class Address {
	
	//instance variables: 
	private String city; //stores city of Address
	private String state; //stores state of Address


	//Parameterized constructor
	public Address(String city, String state){
	this.city = city;
	this.state = state;

	}

	//getters and setters
	public String getCity(){
	return city;
	} //end of getCity() method

	public void setCity(String  city){
	this.city = city;
	} //end of setCity() method

	public String getState(){
	return state;
	} //end of getState() method

	public void setState(String  state){
	this.state = state;
	} //end of setState() method



	//@Override
	public String toString(){
	String result = "";
	result = result +"city: " + city+", ";
	result = result +"state: " + state+"\n";
	return result;
	}


}
