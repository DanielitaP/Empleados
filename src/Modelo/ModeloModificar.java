/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexion;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniela
 */
public class ModeloModificar {
    
    
    
    public void modificaEmpleados(Integer codigo, String rut, String nombre, String apellido, Integer celular, String email, Integer sueldo_bruto, String est_civil, String nom_depto) throws SQLException{
        System.out.println("Modificar registro empleado...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="UPDATE EMPLEADO SET NOMBRE='"+nombre+"' WHERE CODIGO="+codigo;
        dec.executeUpdate(query1);
    }
    
}
