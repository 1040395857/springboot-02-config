package com.oracle.springboot02config;

import com.oracle.springboot02config.pojo.Dog;
import com.oracle.springboot02config.pojo.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ConfigApplicationTests {

    @Autowired
    Person person;
    @Test
    void contextLoads() {
//        日志处理流程
//        按照优先级从低到高进行
        Logger logger = LoggerFactory.getLogger(Dog.class);
//        logger.trace("");
        logger.trace("打印调试信息································");
        logger.info("打印info信息·································");
        logger.warn("打印warn信息·································");
        logger.error("打印error信息·······························");
        System.out.println(person);
    }

}
