package exercise1;

import java.util.Scanner;

public class InvoiceItem2 {

	public static void main(String[] args) {
		InvoiceItem item1 = new InvoiceItem("112", "Book", 3, 35000);
		InvoiceItem item2 = new InvoiceItem("101", "Phone", 2, 920000);
		InvoiceItem item3 = new InvoiceItem("187", "Laptop", 1, 1100000);
		
		System.out.println("=====================================");
		System.out.println("  품번    항목명    수량    단가    금액  ");
		System.out.println("-------------------------------------");
		dispInvoice(item1);
		dispInvoice(item2);
		dispInvoice(item3);
		
		InvoiceItem item4 = new InvoiceItem();
		Scanner sc = new Scanner(System.in);
		System.out.print("품번을 입력하세요:");
		item4.setId(sc.next());
		System.out.print("품목명을 입력하세요:");
		item4.setDesc(sc.next());
		System.out.print("수량을 입력하세요:");
		item4.setQty(sc.nextInt());
		System.out.print("단가를 입력하세요:");
		item4.setUnitPrice(sc.nextLong());
		
		System.out.println(item4);
	}
	
	public static void dispInvoice(InvoiceItem item) {
		System.out.printf("%3s %9s %5d %8d %7d\n", item.getId(), item.getDesc(), item.getQty(), item.getUnitPrice(), item.getTotal());
		
		
		

	}

}
