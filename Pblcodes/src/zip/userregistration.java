package exception;

class InvalidCountryException extends Exception{
	public InvalidCountryException(String message){
		super(message);
	}
}
public class userregistration {
	public void UserRegistration(String name,String country) throws InvalidCountryException{
		if(!country.equals("India"))
		throw new InvalidCountryException("Outside country cannot be registered");
	else 
		System.out.println("Registration successfull");
	
	}
	public static void main(String[] args) {
	userregistration register =new userregistration();
		try {
			register.UserRegistration("Tamil", "India");
		}
		catch(InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}
