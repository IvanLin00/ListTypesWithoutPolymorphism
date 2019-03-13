public class Element{
	private int type;
	private int intElement;
	private double doubleElement;
	private String stringElement;
	
	public Element(int t, int i, double d, String s) {
		type = t;
		intElement = i;
		doubleElement = d;
		stringElement = s;
	}
	
	public String toString(){
		String s = "";
		if (type == 0) return s + intElement;
		if (type == 1) return s + doubleElement;
		return stringElement;
	}
}