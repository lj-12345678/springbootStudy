package com.dailiangjin.springboot.study;

import com.dailiangjin.springboot.study.dao.TbDeptDao;
import com.dailiangjin.springboot.study.entity.TbDept;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Random;

@SpringBootTest
public class DaoTest {
    public static Logger logger = LoggerFactory.getLogger(DaoTest.class);
    private static Random random = new Random();
    //依赖注入
    @Autowired
    private TbDeptDao tbDeptDao;

    @Test
    public void one() throws Exception {
        List<TbDept> tbDeptList = tbDeptDao.queryAll(new TbDept());
        for (TbDept dept : tbDeptList) {
            logger.debug("部门查询测试===================");
            logger.debug("{}", dept);

        }
    }

    @Test
    public void two() throws Exception {
        TbDept dept = new TbDept();
//        dept.setDeptName("部门" + random.nextInt(10000));
        dept.setDeptName("干饭部");
        dept.setDeptInfo("专注干饭");//部门描述
       int result=tbDeptDao.add(dept);
        logger.debug("{},{}", result, dept);
    }

}
