
public class Main {

	public static void main(String[] args) {
		
		String[] customers = {"P1","P2","P3","P4","P5"};
		
		for	(String customer:customers) {
			System.out.println(customer);
		}
		
		System.out.println("----------------------------------");
		CustomerService customerService = new CustomerService();
		Customer[] result = customerService.getCustomers();
		
	
		for(Customer customer:result) {
			System.out.println(customer.firstName);
			System.out.println(customer.lastName);
			System.out.println(customer.yearOfBirth);
			System.out.println(customer.email);
			System.out.println("------------------");
			
		}
		
		
		customerService.add("Engin", "Demiroð", 34, "engindemirog@gmail.com","Ýstanbul");
		customerService.add("Özkan", "Demircan", 25, "ozkandemircan@gmail.com","Ýstanbul");
		
		//customerService.add(customer1);
		//customerService.add(customer2);
		
	}

}
