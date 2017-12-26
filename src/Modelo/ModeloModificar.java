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
    
    
    
    public void modificaPelicula(int codigo, String nombre) throws SQLException{
        System.out.println("Modificar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="UPDATE A_PELICULA SET NOMBRE='"+nombre+"' WHERE CODIGO="+codigo;
        dec.executeUpdate(query1);
    }
    
}
