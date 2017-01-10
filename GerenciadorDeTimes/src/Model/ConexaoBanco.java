/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;

/**
 *
 * @author mateus
 */
public class ConexaoBanco {
	
    public Connection conexao(){
        Connection myConn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver"); //registrando o driver
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        
        return myConn;
    }
    
    public void desconexao(Connection conn){
        try {
            if (conn != null) {
               conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
