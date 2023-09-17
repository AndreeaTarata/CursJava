package Homework4;

import java.util.Scanner;

public class InvoiceDiscount {
	double factura;
	
	public void askInvoiceValue() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Valorea facturii este: ");
		factura = scan.nextDouble();
		
	}
	
	public void applyDiscount() {
		
		askInvoiceValue();
		double result = (factura > 100)? factura - (factura * 0.10) : factura - (factura * 0.05);
		System.out.println(result);
	}
	
	

}
