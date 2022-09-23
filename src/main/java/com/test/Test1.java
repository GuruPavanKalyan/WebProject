package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;



import java.sql.SQLException;



import org.junit.jupiter.api.Test;



class Test1 {



   @Test
    void test() throws SQLException {
        Testing t = new Testing();
        assertEquals(true, t.isConnected());
    }



}