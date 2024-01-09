package com.oopsLab;
class Nib
{
	private String materialtype;
	private int width;
	
	Nib()
	{
		
	}
	Nib(String materialtype,int width)
	{
		this.materialtype=materialtype;
		this.width=width;
	}
	public String getMaterialtype() {
		return materialtype;
	}
	public void setMaterialtype(String materialtype) {
		this.materialtype = materialtype;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Nib [materialtype=" + materialtype + ", width=" + width + "]";
	}	
}
class Refill
{
	private String inkcolor;
	private int refilllength;
	  private Nib nib;
	 
	 Refill()
	 {
		 
	 }
	 Refill(String inkcolor,int refilllength,Nib nib)
	 {
		 this.inkcolor=inkcolor;
		 this.nib=nib;
		 this.refilllength=refilllength;
	 }
	public String getInkcolor() {
		return inkcolor;
	}
	public void setInkcolor(String inkcolor) {
		this.inkcolor = inkcolor;
	}
	public int getRefilllength() {
		return refilllength;
	}
	public void setRefilllength(int refilllength) {
		this.refilllength = refilllength;
	}
	
	public Nib getNib() {
		return nib;
	}
	public void setNib(Nib nib) {
		this.nib = nib;
	}
	@Override
	public String toString() {
		return "Refill [inkcolor=" + inkcolor + ", refilllength=" + refilllength + ", nib=" + nib + "]";
	}	
}
class Pen
{
	private int caplength;
	private String brand;
	 private Refill refill;
	Pen()
	{
		
	}
	public Pen(int caplength, String brand, Refill refill) {
		super();
		this.caplength = caplength;
		this.brand = brand;
		this.refill = refill;
	}
	public int getCaplength() {
		return caplength;
	}
	public void setCaplength(int caplength) {
		this.caplength = caplength;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Refill getRefill() {
		return refill;
	}
	public void setRefill(Refill refill) {
		this.refill = refill;
	}
	@Override
	public String toString() {
		return "Pen [caplength=" + caplength + ", brand=" + brand + ", refill=" + refill + "]";
	}
	
	
}
public class Containment {
	public static void main(String[] args) {
		Nib n=new Nib();
		n.setWidth(1);
		n.setMaterialtype("steel");
		System.out.println(n);
		Refill r=new Refill();
		System.out.println("--------------------------------");
		r.setInkcolor("black");
		r.setRefilllength(10);
		r.setNib(n);
		System.out.println(r);
		System.out.println("---------------------------------");
		Pen p1=new Pen();
		p1.setCaplength(2);
		p1.setBrand("cello");
		p1.setRefill(r);
		System.out.println(p1);
		System.out.println("-----------------------------");
		
		
		
	}

}
