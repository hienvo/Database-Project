package model;

public class user {
	private int customer_id;
	private String name;
	private String email;
	private String birthday;
	private String zipcode;
	private String gender;
	private String description;
//getter method	
	public int getId()
	{
		return customer_id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getBirthday()
	{
		return birthday;
	}
	
	public String getZipcode()
	{
		return zipcode;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getDescription()
	{
		return description;
	}
	
//setter methods
	public void setCustomer_id(int customer_id) 
	{
		this.customer_id = customer_id;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public void setBirthday(String birthday) 
	{
		this.birthday = birthday;
	}
	
	public void setZipcode(String zipcode) 
	{
		this.zipcode = zipcode;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	

}
