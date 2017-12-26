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
public class ModeloBorrar {
    
    public void borrarPelicula(int codigo) throws SQLException{
        System.out.println("Borrar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1= "DELETE FROM A_CATEGORIA_A_PELICULA WHERE CODIGO="+codigo;
        dec.addBatch(query1);
        String query2 = "DELETE FROM A_ALUMNO WHERE CODIGO="+codigo;
        dec.addBatch(query2);
            dec.executeBatch();
    }

     public void borrarCategoria(int id_cat) throws SQLException{
        System.out.println("Borrar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="DELETE FROM A_CATEGORIA_A_PELICULA WHERE ID_CAT="+id_cat;
        dec.addBatch(query1);
        String query2="DELETE FROM A_CATEGORIA WHERE ID_CAT="+id_cat;
        dec.addBatch(query2);
        dec.executeBatch();
    }
    
}
