/**
 Test list features.
 */
public class UserOfList {
    
    
    public static void main( String[] args ) {
	List_inArraySlots list;
        list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
        list.add( 2, -1, -2.0,  "important");
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added string: " + list);

        list.add( 0, 17, -2.0,  "junk");
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added int: " + list);

        list.add( 1, -1, 1.618, "junk");
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added double: " + list);

        // Add enough elements that expansion is expected
        for( int elemIndex = list.size(); elemIndex < 15; elemIndex++ ) {

            if( list.size() == 10) System.out.println( "expansion expected");

            list.add( 0, -elemIndex, -2.0,  "junk");
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of expanded list: "
             + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());
		
		//Tests get()
		for( int elemIndex = list.size() - 1;elemIndex > -1; elemIndex-- ){
			System.out.println(list.get(elemIndex));
		}
    }
}
