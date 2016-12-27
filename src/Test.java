import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

/*
 * Copyright (c) Asiainfo Technologies(China),Inc.
 *
 * FileName: Test.java
 *
 * Created: chenjk 2016年8月16日
 * 
 */

/**
 * Test
 *
 * <P>
 * </P>
 * 
 * @author chenjk 2016年8月16日
 * @version 0.0.1
 */
public class Test
{

	/**
	 *
	 *
	 * @param args
	 * @throws SQLException
	 */
	public static void main1( String[] args ) throws SQLException
	{
		try
		{
			Class.forName( "oracle.jdbc.driver.OracleDriver" );
		}
		catch ( ClassNotFoundException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties props = new Properties();
		// 设置可获取注释
		props.put( "remarksReporting", "false" );
		props.put( "user", "bomc40_gz_dev" );
		props.put( "password", "bomc40_gz_dev" );
		String url = "jdbc:oracle:thin:@10.3.3.68:1521:ECHANNEL";
		Connection connection = DriverManager.getConnection( url, props );

		String parserSql = "select * from rm_res_kpi";
		PreparedStatement pstmt = connection.prepareStatement( parserSql, ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY );
		ResultSet rs = pstmt.executeQuery();
		int i = 0;
		System.out.println( i );
		Date start = new Date();
		while ( rs.next() )
		{
			i++;
		}
		System.out.println( i );

		Date end = new Date();

		System.out.println( ( end.getTime() - start.getTime() ) / 1000 );

		rs.close();
		pstmt.close();
		connection.close();

	}
	
	public static void testFinal(String aString){
		aString = null;
	}

	public static void main( String[] args ) throws UnsupportedEncodingException
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>(1);
		System.out.println( arrayList.getClass().getSimpleName() );
	}

}
