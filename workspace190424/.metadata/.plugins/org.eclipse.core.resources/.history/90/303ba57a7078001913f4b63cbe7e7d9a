package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class EmpManager {

	public static void printEmployees(String jobs[]) {
		String sql = "select e.employee_id, e.first_name, e.salary "
				+ "from employees e, jobs j "
				+ "where e.job_id = j.job_id "
				+ "and (lower(j.job_title) = ? or lower(j.job_title) = ?)";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, jobs[0].toLowerCase());
			ps.setString(2, jobs[1].toLowerCase());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("employee_id") + "\t");
				System.out.print(rs.getString("first_name") + "\t");
				System.out.println(rs.getInt("salary"));
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
