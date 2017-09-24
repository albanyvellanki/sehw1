package labhw1;

import javax.faces.bean.ManagedBean;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

@ManagedBean
public class userlogin 

{
	
	private String Firstname;
	private String Lastname;
	private String Address;
	private String Phonenumber;
	private String Personalemail;
	private String username;
	private String password;
	
	

	
	public String getFirstname() {
		return Firstname;
	}



	public void setFirstname(String firstname) {
		Firstname = firstname;
	}



	public String getLastname() {
		return Lastname;
	}



	public void setLastname(String lastname) {
		Lastname = lastname;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String getPhonenumber() {
		return Phonenumber;
	}



	public void setPhonenumber(String Phonenumber) {
		this.Phonenumber = Phonenumber;
	}



	public String getPersonalemail() {
		return Personalemail;
	}



	public void setPersonalemail(String personalemail) {
		Personalemail = personalemail;
	}



	public String getusername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getpassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String vali(){
		if(this.username.equals("Admin") && this.password.equals("Admin"))
		{
			
			return "welcomeadmin";
		}
		else
		{
			return "failurelogin";
		}
	}
		
		public String reg()
		{
			if(this.Phonenumber.matches("^[0-9]{10}$") && this.Personalemail.matches("^[_A-Za-z0-9-]+(\\[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"))
	    	{
				return "success";
	    	
	    	 
	    	}
	    	else
	    	{
	    		return "registrationfailure";
	    	}
		
    }

}
