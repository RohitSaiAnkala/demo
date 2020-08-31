import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.pojo.Employee;

public class DemoPreparedStatement {
	
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		 	System.out.println("Enter details of employee");
			Employee e=new Employee(sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott1","tiger1");
				System.out.println("Got the connection");
				String insertData="insert into employee values(?,?,?,?)";
				
				PreparedStatement ps=con.prepareStatement(insertData);
				ps.setString(1, e.getEmpName());
				ps.setInt(2, e.getEmpId());
				ps.setInt(3, e.getSalary());
				ps.setString(4,e.getTechnology());
				int updated=ps.executeUpdate();
				if(updated>0){
					System.out.println("Inserted values");
				}
				else
					System.out.println("Sorry");
			} catch (ClassNotFoundException|SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
	}

}
