package com.cruds.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cruds.bean.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/*@Override
	public void setDataSource(DataSource ds) {
		this.jdbcTemplate = new JdbcTemplate(ds);
	}*/

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void create(Integer deptId, String deptName) {
		String sql = "insert into department(deptid, deptname) values(?,?)";
		jdbcTemplate.update(sql, new Object[]{deptId,deptName});
		
	}

	@Override
	public Department getDept(Integer deptId) {
		String sql = "select deptid,deptname from department where deptid=?";
		Department dept = jdbcTemplate.queryForObject(sql, new Object[]{deptId}, new DepartmentMapper());
		return dept;
	}

	class DepartmentMapper implements RowMapper<Department>
	{
		@Override
		public Department mapRow(ResultSet rs, int arg1) throws SQLException {
			Department d = new Department();
			d.setDeptId(rs.getInt("deptid"));
			d.setDeptName(rs.getString("deptname"));
			return d;
		}
	}
	
}
