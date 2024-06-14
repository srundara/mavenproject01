package test_api.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import test_api.config.MybatisConfiguration;
import test_api.mapper.SemesterMapper;
import test_api.models.Semesters;
import test_api.service.SemesterService;
import test_api.util.MyBatisUtil;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class SemesterServiceImpl implements SemesterService{

	@Autowired
	private MybatisConfiguration config;

	@Override
	public void create(Semesters semester) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			SemesterMapper data = session.getMapper(SemesterMapper.class);
			data.create(semester);
			session.commit();
		}finally {
			session.close();
		}		
	}

	@Override
	public List<Semesters> get() {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			SemesterMapper data = session.getMapper(SemesterMapper.class);
			return data.get();
		}finally {
			session.close();
		}
	}

	@Override
	public int update(Semesters semesters) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			SemesterMapper semesterMapper = session.getMapper(SemesterMapper.class);
		 	int data = semesterMapper.update(semesters);
		 	session.commit();
		 	return data;
		}finally {
			session.close();
		}
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			SemesterMapper semesterMapper = session.getMapper(SemesterMapper.class);
			semesterMapper.delete(id);
			session.commit();
		}finally {
			session.close();
		}
		
	}


}
