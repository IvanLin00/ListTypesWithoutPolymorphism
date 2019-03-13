/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */

public class List_inArraySlots {

    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
	private int filledIntElements;
	private int filledDoubleElements;
	private int filledStringElements;
    private int filledTypeElements; // the number of elements in this list
    
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
		intElements = new int[INITIAL_CAPACITY];
		doubleElements = new double[INITIAL_CAPACITY];
		stringElements = new String[INITIAL_CAPACITY];
		typeOfElements = new int[INITIAL_CAPACITY * 3];
		filledIntElements = 0;
		filledDoubleElements = 0;
		filledStringElements = 0;
		filledTypeElements = 0 ;
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
		return filledTypeElements;
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
		if (filledTypeElements == 0){
			return "[]";
		}
		for(int index = 0; index < filledTypeElements - 1; index ++){
			if (typeOfElements[index] == 0){
				s += intElements[intIndex] + ", ";
				intIndex ++;
			}
			if (typeOfElements[index] == 1){
				s += doubleElements[doubleIndex] + ", ";
				doubleIndex ++;
			}
			if (typeOfElements[index] == 2){
				s += stringElements[stringIndex] + ", ";
				stringIndex++;
			}
		}
		
		if (typeOfElements[filledTypeElements - 1] == 0)
			return s + intElements[intIndex] + "]";
		if (typeOfElements[filledTypeElements - 1] == 1)
			return s + doubleElements[doubleIndex] + "]";
		if (typeOfElements[filledTypeElements - 1] == 2)
			return s + stringElements[stringIndex] + "]";
		return s + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int type ,int intValue,double doubleValue,String stringValue) {
		if (filledIntElements > intElements.length - 1 
			|| filledDoubleElements > doubleElements.length - 1
			|| filledStringElements > stringElements.length - 1) {
			expand();
		}
		typeOfElements[filledTypeElements] = type;
		if (type == 0){
			intElements[filledIntElements] = intValue;
			filledIntElements ++;
		}
		if (type == 1){
			doubleElements[filledDoubleElements] = doubleValue;
			filledDoubleElements ++;
		}
		if (type == 2){
			stringElements[filledStringElements] = stringValue;
			filledStringElements ++;
		}	
		filledTypeElements++;
		return true;
		
    }


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
		int[] biggerType = new int[typeOfElements.length * 2];
		for (int index = 0; index < intElements.length - 1; index ++)
			biggerInt[index] = intElements[index];
		for (int index = 0; index < doubleElements.length - 1; index++)
			biggerDouble[index] = doubleElements[index];
		for (int index = 0; index < stringElements.length - 1; index ++)
			biggerString[index] = stringElements[index];
		for (int index = 0; index < typeOfElements.length - 1; index ++)
			biggerType[index] = typeOfElements[index];
		intElements = biggerInt;
		doubleElements = biggerDouble;
		stringElements = biggerString;
		typeOfElements = biggerType;
    }
}
