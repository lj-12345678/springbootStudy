package com.dailiangjin.springboot.study;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class MyTest {
    public static Logger logger= LoggerFactory.getLogger(MyTest.class);
    @Test
    void contextLoads() {
        logger.debug("{},{},{}", StringUtils.hasText(null), StringUtils.hasText("   "), StringUtils.hasText("ddd"));
    }

}
