package test_api.service.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import test_api.config.MybatisConfiguration;
import test_api.mapper.BranchMapper;
import test_api.mapper.CarMapper;
import test_api.models.Branch;
// import test_api.models.Class;
import test_api.service.BranchService;
import test_api.util.MyBatisUtil;

@Service
// @NoArgsConstructor
// @AllArgsConstructor
public class BranchServiceImpl implements BranchService{
	
	@Autowired
	private MybatisConfiguration config;
	
	@Override
	public void create(Branch branch) {
		// TODO Auto-generated method stub
		SqlSession session =  MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			BranchMapper branchMapper = session.getMapper(BranchMapper.class);
			branchMapper.create(branch);
			session.commit();
		}finally {
			session.close();
		}
	}

	@Override
	public List<Branch> getAll() {
		// TODO Auto-generated method stub
		SqlSession session =  MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			BranchMapper branchMapper = session.getMapper(BranchMapper.class);
			return branchMapper.getAll();
		}finally{
			session.close();
		}
	}

	@Override
	public Branch getBranchById(Integer id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			BranchMapper branchMapper = session.getMapper(BranchMapper.class);
			return branchMapper.getBranchById(id);
		}finally{
			session.close();
		}
	}

	@Override
	public int update(Branch branch) {
		// TODO Auto-generated method stub
		SqlSession session =  MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			BranchMapper branchMapper = session.getMapper(BranchMapper.class);
			int data = branchMapper.update(branch);
			session.commit();
			return data;
		}finally{
			session.close();
		}
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			BranchMapper branchMapper = session.getMapper(BranchMapper.class);
			branchMapper.delete(id);
			session.commit();
		}finally{
			session.close();
		}
	}

	@Override
    public List<Branch> selectByName() {
        // TODO Auto-generated method stub
        SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            BranchMapper branchMapper = session.getMapper(BranchMapper.class);
            return branchMapper.selectByName();
        }finally{
            session.close();
        }
    }

	@Override
	public List<Branch> selectId(Integer id) {
		// TODO Auto-generated method stub
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try{
			BranchMapper branchMapper = session.getMapper(BranchMapper.class);
			return branchMapper.selectId(id);
		}finally{
			session.close();
		}
	}

	

	
	
}
