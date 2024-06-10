package com.song.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    private final Logger logger01 = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user01 = (User) context.getBean("user01");
        System.out.println(user01);
        user01.add();
        logger01.info("成功调用add方法");
    }

    @Test
    public void testReflectUserObject() throws Exception {
        Class<?> clazz = Class.forName("com.song.spring6.User");
        User user01 = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user01);
    }
    /* Output:
    noArgsConstructor...
    com.song.spring6.User@60285225
    */
}

