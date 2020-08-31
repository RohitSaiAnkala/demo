import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.pojo.Employee;

public class DemoSelectAll {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott1","tiger1");
			System.out.println("Got the connection");
			String selectData="select * from employee";
			Statement st=con.createStatement();
			ResultSet set=st.executeQuery(selectData);
			 while(set.next()){
		    	 String name=set.getString(1);
		    	  int id=set.getInt("empId");
		    	  int salary=set.getInt("salary");
		    	  String technology=set.getString(4);
		    	  System.out.println(name+","+id+","+salary+","+technology);
		    	// Employee emp=new Employee(name,id,salary,technology);
		    	//  System.out.println(emp);
		     }
		} catch (ClassNotFoundException|SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
