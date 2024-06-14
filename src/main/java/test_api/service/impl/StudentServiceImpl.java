package test_api.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import test_api.config.MybatisConfiguration;
import test_api.mapper.StudentMapper;
import test_api.models.Students;
import test_api.service.StudentService;
import test_api.util.MyBatisUtil;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private MybatisConfiguration config;
	
	@Override
	public void create(Students students) {
		// TODO Auto-generated method stub
		SqlSession session =  MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			studentMapper.create(students);
			session.commit();
		}finally {
			session.close();
		}
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		SqlSession session =  MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			studentMapper.delete(id);
			session.commit();
		}finally{
			session.close();
		}
		
	}

	@Override
	public List<Students> getStudent() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			return studentMapper.getStudent();
		}finally{
			session.close();
		}
	}

	@Override
	public Students getStudentById(Integer id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			return studentMapper.getStudentById(id);
		}finally{
			session.close();
		}
	}

	@Override
	public int update(Students students) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			StudentMapper studentMapper = session.getMapper(StudentMapper.class);
			int student = studentMapper.update(students);
			session.commit();
			return student;
		}finally{
			session.close();
		}
	}
	

}
