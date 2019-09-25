package wang;

public class SaleTicket {
	//两百张票
	int i = 200;
	
	
	public void text() {
		while(i>0) {
			i--;
		}
	}
	public static void main(String[] args) {
		
		SaleTicket s = new SaleTicket();
		s.text();
		
	}
	
    
}
