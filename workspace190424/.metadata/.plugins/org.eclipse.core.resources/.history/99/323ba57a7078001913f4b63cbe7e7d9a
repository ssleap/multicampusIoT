package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class EmpTest {

	public static void main(String[] args) {
		String sql = "select count(*) as count, e1.employee_id, e1.last_name " + 
				"from employees e1, employees e2 " + 
				"where e1.employee_id = e2.manager_id " + 
				"group by e1.employee_id, e1.last_name " + 
				"having count(*) >= 8 " + 
				"order by count";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt("count") + "\t");
				System.out.print(rs.getInt("employee_id") + "\t");
				System.out.println(rs.getString("last_name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			JDBCUtil.close(con, ps, rs);
		}
	}

}
