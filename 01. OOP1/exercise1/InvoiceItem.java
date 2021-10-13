package exercise1;

public class InvoiceItem {
	
	private String id;
	private String desc;
	private int qty;
	private long unitPrice;
	
	public InvoiceItem() { }
	
	public InvoiceItem(String id, String desc, int qty, long unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	
	public String getId() {
		return id;		
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getQty() {
		return qty;
	}
	
	public long getUnitPrice() {
		return unitPrice;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public void setUnitPrice(long unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public long getTotal() {
		long total = (long)qty * unitPrice;
		return total;
	}

	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}
	
}




