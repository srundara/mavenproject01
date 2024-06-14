package test_api.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import test_api.mapper.ClassSubjectMaapper;
import test_api.mapper.SubjectMapper;
import test_api.models.ClassSubject;
import test_api.models.Subject;
import test_api.service.ClassSubjectService;
import test_api.service.SubjectService;
import test_api.util.MyBatisUtil;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Override
	public void create(Subject subject) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);
			subjectMapper.create(subject);
			session.commit();
		}finally {
			session.close();
		}
	}

	@Override
	public List<Subject> getClassBySubject(Integer id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			SubjectMapper subjectMapper = session.getMapper(SubjectMapper.class);
			return subjectMapper.getClassBySubject(id);
		}finally {
			session.close();
		}
	}

	
}
