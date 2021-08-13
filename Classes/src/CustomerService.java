
public class CustomerService {
	
	public void add(String firstName,String lastName,int yearOfBirth,String email,String description) {
		
		System.out.println("Müþteri Eklendi..");
		
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi..");
	}
	
	public Customer[] getCustomers() {
		Customer customer1 = new Customer();
		customer1.firstName="Abdullah";
		customer1.lastName="Bilgen";
		customer1.yearOfBirth=25;
		customer1.email="bilgen760@gmail.com";
		
		Customer customer2 = new Customer();
		customer2.firstName="Abdurrahman";
		customer2.lastName="Bilgen";
		customer2.yearOfBirth=22;
		customer2.email="bilgen760@gmail.com";
		
		Customer customer3 = new Customer();
		customer3.firstName="Celalettin";
		customer3.lastName="Bilgen";
		customer3.yearOfBirth=35;
		customer3.email="bilgen760@gmail.com";
		
		Customer customer4 = new Customer();
		customer4.firstName="Raþit";
		customer4.lastName="Bilgen";
		customer4.yearOfBirth=45;
		customer4.email="bilgen760@gmail.com";
		
		Customer customer5 = new Customer();
		customer5.firstName="Hüseyin";
		customer5.lastName="Bilgen";
		customer5.yearOfBirth=55;
		customer5.email="bilgen760@gmail.com";
		
		
		Customer[] customers = {customer1,customer2,customer3,customer4 ,customer5};
		
		return customers;
	}

}
