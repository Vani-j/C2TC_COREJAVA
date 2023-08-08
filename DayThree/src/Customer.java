
public class Customer {
	//variables
	private int customerId;			//instance variable-
	private String customerName;
	private String customerCity;
	
	void display() {
		
	}
	
	//user defined no argument
	Customer(){
		
	}
	
	//user defined - parametrised/argumented Constructor
Customer(int id,String name,String city){		//local variable id, city, name
	customerId=id;
	customerName=name;
	customerCity=city;
		
	}
	
	//methods
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", getCustomerId()=" + getCustomerId() + ", getCustomerName()=" + getCustomerName()
				+ ", getCustomerCity()=" + getCustomerCity() + "]";
	}
}

	
	
	

