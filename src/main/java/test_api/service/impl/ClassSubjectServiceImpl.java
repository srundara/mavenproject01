package test_api.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import test_api.mapper.ClassSubjectMaapper;
import test_api.models.ClassSubject;
import test_api.service.ClassSubjectService;
import test_api.util.MyBatisUtil;

@Service
public class ClassSubjectServiceImpl implements ClassSubjectService{

	@Override
	public void classSubject(ClassSubject classSubjects) {
		// TODO Auto-generated method stub
		SqlSession session =  MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			ClassSubjectMaapper classSubjectMaapper = session.getMapper(ClassSubjectMaapper.class);
			classSubjectMaapper.classSubject(classSubjects);
			session.commit();
		}finally {
			session.close();
		}
	}
	
}
