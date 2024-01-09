package com.oopsLab;
class Mobile
{
	private int imeino;
	private int noofSims;
	private String Networktype;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int imeino, int noofSims, String networktype) {
		super();
		this.imeino = imeino;
		this.noofSims = noofSims;
		Networktype = networktype;
	}
	public int getImeino() {
		return imeino;
	}
	public void setImeino(int imeino) {
		this.imeino = imeino;
	}
	public int getNoofSims() {
		return noofSims;
	}
	public void setNoofSims(int noofSims) {
		this.noofSims = noofSims;
	}
	public String getNetworktype() {
		return Networktype;
	}
	public void setNetworktype(String networktype) {
		Networktype = networktype;
	}
	@Override
	public String toString() {
		return "Mobile [imeino=" + imeino + ", noofSims=" + noofSims + ", Networktype=" + Networktype + "]";
	}

	}
class AndroidMobile extends Mobile
{
	private String companyname;
	private String mobilename;
	
	public AndroidMobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AndroidMobile(int imeino, int noofSims, String networktype) {
		super(imeino, noofSims, networktype);
		// TODO Auto-generated constructor stub
	}
	public AndroidMobile(String companyname, String mobilename) {
		super();
		this.companyname = companyname;
		this.mobilename = mobilename;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getMobilename() {
		return mobilename;
	}
	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}
	@Override
	public String toString() {
		return super.toString()+"AndroidMobile [companyname=" + companyname + ", mobilename=" + mobilename + "]";
	}
	
}
class IOSMobile extends Mobile
{
	private String ioscompany;
	private String  iosmobilename;
	
	public IOSMobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IOSMobile(int imeino, int noofSims, String networktype) {
		super(imeino, noofSims, networktype);
		// TODO Auto-generated constructor stub
	}
	public IOSMobile(String ioscompany, String iosmobilename) {
		super();
		this.ioscompany = ioscompany;
		this.iosmobilename = iosmobilename;
	}
	public String getIoscompany() {
		return ioscompany;
	}
	public void setIoscompany(String ioscompany) {
		this.ioscompany = ioscompany;
	}
	public String getIosmobilename() {
		return iosmobilename;
	}
	public void setIosmobilename(String iosmobilename) {
		this.iosmobilename = iosmobilename;
	}
	@Override
	public String toString() {
		return super.toString()+"IOSMobile [ioscompany=" + ioscompany + ", iosmobilename=" + iosmobilename + "]";
	}
	}
class WindowMobile extends Mobile
{
	private String wdcompany;
	private String  wdsmobilename;
	public WindowMobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WindowMobile(int imeino, int noofSims, String networktype) {
		super(imeino, noofSims, networktype);
		// TODO Auto-generated constructor stub
	}
	public WindowMobile(String wdcompany, String wdsmobilename) {
		super();
		this.wdcompany = wdcompany;
		this.wdsmobilename = wdsmobilename;
	}
	public String getWdcompany() {
		return wdcompany;
	}
	public void setWdcompany(String wdcompany) {
		this.wdcompany = wdcompany;
	}
	public String getWdsmobilename() {
		return wdsmobilename;
	}
	public void setWdsmobilename(String wdsmobilename) {
		this.wdsmobilename = wdsmobilename;
	}
	@Override
	public String toString() {
		return super.toString()+"WindowMobile [wdcompany=" + wdcompany + ", wdsmobilename=" + wdsmobilename + "]";
	}
	
	}
public class MobliPhone {
	public static void main(String[] args) {
		WindowMobile w=new WindowMobile();
		System.out.println(w);
		System.out.println("-----------------------------------------------------------------");
		AndroidMobile a=new AndroidMobile();
		System.out.println(a);
		System.out.println("--------------------------------------------------------------------");
		IOSMobile i=new IOSMobile();
		System.out.println(i);
	}

}
