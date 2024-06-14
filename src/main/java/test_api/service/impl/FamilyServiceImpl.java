package test_api.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import test_api.config.MybatisConfiguration;
import test_api.mapper.FamilyMapper;
import test_api.models.Family;
import test_api.service.FamilyService;
import test_api.util.MyBatisUtil;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class FamilyServiceImpl  implements FamilyService{
    @Autowired
    private MybatisConfiguration config;

    @Override
    public void create(Family family) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            FamilyMapper familyMapper = session.getMapper(FamilyMapper.class);
            familyMapper.create(family);
            session.commit();
        }finally{
            session.close();
        }
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            FamilyMapper familyMapper =  session.getMapper(FamilyMapper.class);
            familyMapper.delete(id);
            session.commit();
        }finally{
            session.close();
        }
    }

    @Override
    public List<Family> getFamily() {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            FamilyMapper familyMapper = session.getMapper(FamilyMapper.class);
            return familyMapper.getFamily();
        }finally{
            session.close();
        }
    }

    @Override
    public Family getFamilyId(Integer id) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            FamilyMapper familyMapper = session.getMapper(FamilyMapper.class);
            return familyMapper.getFamilyId(id);
        }finally{
            session.close();
        }
    }

    @Override
    public int upadte(Family family) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            FamilyMapper familyMapper = session.getMapper(FamilyMapper.class);
            int date = familyMapper.upadte(family);
            session.commit();
            return date;
        }finally{
            session.close();
        }
    }

    @Override
    public List<Family> getStudent(Integer id) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            FamilyMapper familyMapper = session.getMapper(FamilyMapper.class);
            return familyMapper.getStudent(id);
        }finally{
            session.close();
        }
    }

    
    
}
