package com.bindu;

public class Languages {

	private int LId;
	private String Lname;
	private int Lexp;
	
	
	public int getLId() {
		return LId;
	}
	public void setLId(int lId) {
		LId = lId;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getLexp() {
		return Lexp;
	}
	public void setLexp(int lexp) {
		Lexp = lexp;
	}
    @Override
	public String toString() {
		return "Languages [LId=" + LId + ", Lname=" + Lname + ", Lexp=" + Lexp + "   ]";
	}
	
	
	
}
