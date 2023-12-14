package tp;

import java.util.Arrays;
import java.util.Collections;

public class TableauPhone extends Phone{
	private static int numserie;
	private static String nom;
	private Phone[] phoneArray;
	

	public TableauPhone(Phone[] phoneArray) {
		super(nom, numserie, numserie);
		this.phoneArray = phoneArray;
	}
	
	public void sortPhones() {
		Arrays.sort(phoneArray);
	}
	
	public void addPhone(int Dkhol , Phone phone) throws Exception {
		
		if (Dkhol> this.phoneArray.length || Dkhol < 0 ) {
			throw new Exception("wa khuna 7ot hna");
		}
		this.phoneArray[Dkhol] = phone ;
	}
	
	public void removePhone(int Dkhol  ) throws Exception {
		
		if (Dkhol> this.phoneArray.length || Dkhol > 0 ) {
			throw new Exception("wa khuna 7yd lina mn hna");
		}
		this.phoneArray[Dkhol] = null ;
	}
	
	public int countPhones() {
		return this.phoneArray.length;
	}


	public void reverseOrder() {
		Collections.reverse(Arrays.asList(phoneArray));
	}
	
	public void displayPhones() {
		
		for (Phone phone : phoneArray){
			System.out.println(phone);
		}
	}
	public Phone getMaxPhone() {
		if (phoneArray.length==0) {
			return null;	
		}
		Phone maxPhone = phoneArray[0];
		for (Phone phone : phoneArray) {
			if (phone !=null && phone.compareTo(maxPhone)>0) {
				maxPhone = phone;
			}
		}
		return maxPhone;
		
	}
	@Override
	public boolean equals(Object obj) {
	        return Arrays.equals(this.phoneArray,(Phone[])obj );
	    }
	
	
	
	
	
}
