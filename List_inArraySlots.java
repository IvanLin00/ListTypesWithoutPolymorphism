/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements = 0; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */
    private int[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
	intElements = new int[10];
	doubleElements = new double[10];
	stringElements = new String[10];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
	int s = 0;
	for (int num: intElements)
	    s += 1;
	for (double num: doubleElements)
	    s += 1;
	for (String str: stringElements)
	    s += 1;
	return s;
    }


    /**
       @return a string representation of this list,
       in [a,b,c,] format
    */
    public String toString() {
	String s = "[";
	int intIndex = 0;
	int doubleIndex = 0;
	int stringIndex = 0;
	if (filledElements == 0){
	    return "[]";
	}
	for (int num: typeOfElements){
	    if (num == 0){
			s += intElements[intIndex] + ", ";
			intIndex ++;
	    }
	    if (num == 1){
			s += doubleElements[doubleIndex] + ", ";
			doubleIndex ++;
	    }
	    s += stringElements[stringIndex] + ", ";
	    stringIndex++;
	}
	return s + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     // public boolean add( int type   // same meaning as in typeOfElements
                       // , int    intValue
                       // , double doubleValue
                       // , String stringValue
                       // ) {
		
    // }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
     private void expand() {
        System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during
              development, the programmer must verify that
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
		int[] biggerInt = new int[intElements.length * 2];
		double[] biggerDouble = new double[doubleElements.length * 2];
		String[] biggerString = new String[stringElements.length * 2];
		for (int index = 0; index < intElements.length - 1; index ++) {
			biggerInt[index] = intElements[index];
		}
		for (int index = 0; index < doubleElements.length - 1; index++) {
			biggerDouble[index] = doubleElements[index];
		}
		for (int index = 0; index < stringElements.length - 1; index ++) {
			biggerString[index] = stringElements[index];
		}
		intElements = biggerInt;
		doubleElements = biggerDouble;
		stringElements = biggerString;
    }
}
