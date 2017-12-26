/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela
 */
public class ModeloEliminar {
    
    public void EliminarEmpleados(Integer codigo) throws SQLException{
        System.out.println("Eliminar registro empleado...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1= "DELETE FROM EMPLEADOS_CODIGO WHERE CODIGO="+codigo;
        dec.addBatch(query1);
        
            dec.executeBatch();
    }

}
