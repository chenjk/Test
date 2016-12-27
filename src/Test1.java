import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test1
{

	public static void ssq()
	{
		Set aSet = new HashSet();
		while ( aSet.size() < 6 )
		{
			aSet.add( (int) ( 1 + Math.random() * ( 33 - 1 + 1 ) ) );
		}

		List aList = new ArrayList<>();
		List asList = Arrays.asList( aSet );
		for (Object i : aSet)
		{
			aList.add(i);
		}
		Collections.sort( aList );

		for ( int i = 0; i < aList.size(); i++ )
		{
			System.out.print( aList.get( i )+ "," );
		}

		Set bSet = new HashSet<>();
		bSet.add( (int) ( 1 + Math.random() * ( 16 - 1 + 1 ) ) );
		System.out.println( bSet );
	}

	public static void main( String[] args )
	{
		/*for ( int i = 0; i < 5; i++ )
		{
			ssq();
		}*/
		
		
		String res_name = "kkk-ddd-dddd-02";
		String u = res_name.substring( res_name.lastIndexOf( "-" ) + 1);
		
		System.out.println( u );

	}

}
