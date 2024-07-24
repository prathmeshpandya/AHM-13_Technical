package scannerclassdemo;

public class Taxcalculator {
	public void calTax(Person person) {
		if(person.getAge()>65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Tax not applicable");
			
		}
		else {
			if(person.getIncome()<160000) {
				person.setTax(0);
				System.out.println("Tax not applicable for this income slab");
				
				person.setTax(person.getIncome()-160000*10/100);
				System.out.println("The person has paid 10% Tax");
				
			} else if(person.getIncome()>=500000 && person.getIncome()<800000) {
				person.setTax(person.getIncome()-160000*20/100);
				System.out.println("The person has paid 20% Tax");
			} else {
				person.setTax(person.getIncome()-160000*30/100);
				System.out.println("The person has paid 30% Tax");
			}
		} 
	}

}
