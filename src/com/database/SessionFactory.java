package com.database;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;


/**
 * 数据访问会话工厂类
 * @author Rojay
 * @version 1.0.0
 * @createTime 2019年11月29日  15:54:44
 */
public class SessionFactory {

    private static SqlSessionFactory sessionFactory;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession() {
        //return sessionFactory.openSession(true);  //true自动提交事务，false手动提交事务（默认）
        return sessionFactory.openSession();
    }


}
