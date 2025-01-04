package week3.day1;

public abstract class CanaraBank implements Payments {

	public void CashOnDelivery() {
		System.out.println("COD");
		}
	public void upiPayments() {
		System.out.println("upiPayments");
	}
	public void cardPayments() {
		System.out.println("cardPayments");
	}
	public void internetBanking() {
		System.out.println("internetBanking");
	}
		
		public void recordPaymentdetails() {
		System.out.println("recordPaymentdetails");
	}
	}