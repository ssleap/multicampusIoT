package 임원경;
//70.12.115.57
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.BookVo;

public class DeptManager {

	List<Dept> list = new ArrayList<Dept>();

	public List<Dept> getDepts() {

		String sql = "select * from dept";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {

				Dept dpt = new Dept();
				dpt.setDeptno(rs.getInt("deptno"));
				dpt.setDname(rs.getString("dname"));
				dpt.setLoc(rs.getString("loc"));
				
				list.add(dpt);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			JDBCUtil.close(con, ps, rs);

		}
		
		return list;

	}

}
