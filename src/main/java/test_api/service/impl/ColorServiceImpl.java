package test_api.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import test_api.mapper.ColorMapper;
import test_api.models.Color;
import test_api.service.ColorService;
import test_api.util.MyBatisUtil;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class ColorServiceImpl implements ColorService{
      @Autowired
    private MybatisAutoConfiguration config;

    @Override
    public void create(Color color) {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            ColorMapper colorMapper = session.getMapper(ColorMapper.class);
            colorMapper.create(color);
            session.commit();
        }finally{
            session.close();
        }
    }

    @Override
    public List<Color> list() {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            ColorMapper colorMapper = session.getMapper(ColorMapper.class);
            return colorMapper.list();
        }finally{
            session.close();
        }
    }
    
    
}
