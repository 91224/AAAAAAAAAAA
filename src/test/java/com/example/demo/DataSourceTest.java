package com.example.demo;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/java/com/example/demo/WEBINF/spring/rootcontext.xml")
public class DataSourceTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testConnection() {
        try (
                Connection con = dataSource.getConnection();
                SqlSession session = sqlSessionFactory.openSession();
        ){

            System.out.println("con=" + !con.isClosed());
            System.out.println("session=" + (session != null));

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}