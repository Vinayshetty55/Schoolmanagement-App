package com.studentmanagementapp.DAO;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.studentmanagementapp.api.Student;

import com.studentmanagementapp.rowMapper.StudentRowMapper;
@Repository
@Component
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub
		List<Student> studentlist = new ArrayList<>();
		String sql =  "SELECT * FROM students";
		List<Student> thelistofstudent  = jdbcTemplate.query(sql,new StudentRowMapper());
		return thelistofstudent;
	}
	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		if(checkDatabase()) {
			String sql = "ALTER TABLE students AUTO_INCREMENT = 1";
			jdbcTemplate.update(sql);
		}
		Object[] sqlparamenter = {student.getName(),student.getMobile(),student.getCountry()};
		String sql = "insert into students (name,mobile,country) values (?,?,?)";
		jdbcTemplate.update(sql,sqlparamenter);
		System.out.println("Records updated");
	}
	@Override
	public Student getStudent(int id) {
		
		String sql = "select * from students where id=?";
		Student student = jdbcTemplate.queryForObject(sql,new StudentRowMapper(),id);
		return student;
	}
	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		String sql = "UPDATE students SET name = ?, mobile = ?,country = ? WHERE id = ?";
		jdbcTemplate.update(sql,student.getName(),student.getMobile(),student.getCountry(),student.getId());
		System.out.println("Update sucessfull");
	}
	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM students where id = ?";
		jdbcTemplate.update(sql,id);
	}
	@Override
	public boolean checkDatabase() {
		// TODO Auto-generated method stub
		boolean isTableEmpty = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM students", Integer.class) == 0;
		return isTableEmpty;
	}

}
