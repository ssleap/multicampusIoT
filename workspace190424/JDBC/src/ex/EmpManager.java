package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class EmpManager {
	public void printEmployee(String jobs[]) {
		Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String sql=
        		"select e.employee_id, e.first_name, e.salary "+
        		" from employees e "+
        		     " join jobs j "+
        			 " on e.job_id=j.job_id "+
        		" where j.job_title in(?,?)";

        try {
		   con = JDBCUtil.getConnection();
		   ps = con.prepareStatement(sql);
		   ps.setString(1, jobs[0]);
		   ps.setString(2, jobs[1]);
		   rs = ps.executeQuery();
		   
		   while(rs.next()) {
			   System.out.print(rs.getString(1)+"  ");
			   System.out.print(rs.getString(2)+"  ");
			   System.out.print(rs.getString(3)+"  ");
			   System.out.println();
		   }
		   
		} catch (Exception e) {
              e.printStackTrace(); 
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		
	}
}
