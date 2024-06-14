package test_api.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import test_api.mapper.ClassMapper;
import test_api.models.Class;
import test_api.service.ClassService;
import test_api.util.MyBatisUtil;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class ClassServiceImpl implements ClassService {

    @Autowired
    private MybatisAutoConfiguration config;

    @Override
    public void create(Class classes) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            ClassMapper classMapper = session.getMapper(ClassMapper.class);
            classMapper.create(classes);
            session.commit();
        } finally {
            session.close();
        }
    }

    @Override
    public List < Class > showAllClass() {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            ClassMapper classMapper = session.getMapper(ClassMapper.class);
            return classMapper.showAllClass();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            ClassMapper classMapper = session.getMapper(ClassMapper.class);
            classMapper.delete(id);
            session.commit();
        } finally {
            session.close();
        }
    }

    @Override
    public Class findById(Integer id) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            ClassMapper classMapper = session.getMapper(ClassMapper.class);
            return classMapper.findById(id);
        } finally {
            session.close();
        }
    }

    @Override
    public int update(Class classes) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            ClassMapper classMapper = session.getMapper(ClassMapper.class);
            int data = classMapper.update(classes);
            session.commit();
            return data;
        } finally {
            session.close();
        }
    }

	@Override
	public List<Class> getSubjectByClass(Integer id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			ClassMapper classMapper = session.getMapper(ClassMapper.class);
			return classMapper.getSubjectByClass(id);
		}finally {
			session.close();
		}
	}
    
}