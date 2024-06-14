package test_api.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import test_api.mapper.CarMapper;
import test_api.models.Car;
import test_api.service.CarService;
import test_api.util.MyBatisUtil;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class CarServiceImpl implements CarService{
      @Autowired
    private MybatisAutoConfiguration config;
    
    @Override
    public void create(Car car) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CarMapper carMapper = session.getMapper(CarMapper.class);
            carMapper.create(car);
            session.commit();
        }finally{
            session.close();
        }
    }

    @Override
    public List<Car> list() {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CarMapper carMapper = session.getMapper(CarMapper.class);
            return carMapper.list();
        }finally{
            session.close();
        }
    }

    @Override
    public List<Car> selectByName() {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            CarMapper carMapper = session.getMapper(CarMapper.class);
            return carMapper.selectByName();
        }finally{
            session.close();
        }
    }
    
    
}
