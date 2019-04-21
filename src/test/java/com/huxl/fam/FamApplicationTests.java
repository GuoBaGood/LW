package com.huxl.fam;

import com.huxl.fam.entity.DvAssetsReduce;
import com.huxl.fam.entity.DvDept;
import com.huxl.fam.entity.DvState;
import com.huxl.fam.mapper.DvAssetsReduceMapper;
import com.huxl.fam.mapper.DvDeptMapper;
import com.huxl.fam.mapper.DvStateMapper;
import com.huxl.fam.service.DeptService;
import com.huxl.fam.service.ViewService;
import com.huxl.fam.tool.ComUtil;
import com.huxl.fam.vo.ConditionVo;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.text.SimpleDateFormat;
import java.util.*;

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

	@Autowired
	private ViewService viewService;

	@Autowired
	private DvAssetsReduceMapper reduceMapper;
	@Test
	public void bfff() throws Exception {
		String a = "hh";
		ConditionVo vo = new ConditionVo();
		vo.setYear(2018);
		Map<String ,Object> bt = reduceMapper.queryDataByYear(vo);
		List<Integer> list1 = new ArrayList<>();
		for (String key:bt.keySet()){
			Integer value = Integer.parseInt(bt.get(key.toString()).toString());
			list1.add(value);
		}
		String ab = "hh";
		Map<String, Object> m = new LinkedHashMap<>();
	}


}

