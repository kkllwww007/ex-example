package com.test;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by wxk on 2017-08-06.
 */
public class TestDB {
    @Test
    public void connDB() throws Exception {
        Class.forName("org.postgresql.Driver");

        String connectUrl ="jdbc:postgresql://192.168.0.105:8432/postgres?charSet=utf-8";
        Connection conn = DriverManager.getConnection(connectUrl, "postgres", "kuaile123");

        System.out.println(conn);

        conn.close();
    }
}
