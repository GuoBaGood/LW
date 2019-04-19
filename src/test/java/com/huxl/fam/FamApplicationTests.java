package com.huxl.fam;

import com.huxl.fam.entity.DvDept;
import com.huxl.fam.entity.DvState;
import com.huxl.fam.mapper.DvDeptMapper;
import com.huxl.fam.mapper.DvStateMapper;
import com.huxl.fam.service.DeptService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FamApplicationTests {

	@Autowired
	private DeptService deptService;
	@Test
	public void contextLoads() {
		int b = 0;
	}

	@Test
	@Ignore
	public void b() throws Exception {
		DvDept d = new DvDept();
		d.setDeptName("hhh");
		deptService.insertSelective(d);
		System.out.println("hh");
	}

	@Test
	@Ignore
	public void name() throws Exception {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH:mm:ss");
		String id = "d" + sdf.format(date).replaceAll(":", "");
		System.out.println("h");
	}

	@Autowired
	private DvDeptMapper dvDeptMapper;

	@Autowired
	private DvStateMapper stateMapper;

	//@Transactional(rollbackFor = Exception.class)
	@Transactional
	@Test
	public void dummy() {
		DvState s = new DvState();
		DvDept d = new DvDept();

		d.setDeptId("66");
		d.setDeptName("text");
		d.setDeptPrinciple("text");

		s.setStateName("text");
		s.setStateId("66");

		try{
			stateMapper.insertSelective(s);
			dvDeptMapper.insertSelective(d);
			return ;

		}catch (Exception e){
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//关键
		}

		String  a = "hhh";
	}
}

