package com.oracle.dao;

import org.junit.Assert;
import org.junit.Test;

public class ConexionTest {
     @Test
     public void testConexion() {
         ConeccionDao con= new ConeccionDao();
         con.Conectar();
         Assert.assertNotNull(con.getCon());
         
     }
}
