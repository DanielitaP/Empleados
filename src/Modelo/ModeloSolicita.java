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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela
 */
public class ModeloSolicita {
    
    public Pelicula buscarPeliculaCodigo(int codigo, int precio, int id_cat) throws SQLException{
        System.out.println("Buscar registro...");
        String sql="SELECT CODIGO, PRECIO, ID_CAT, FORMATO4K, NOMBRE FROM A_PELICULA WHERE CODIGO="+codigo;
        PreparedStatement preparedStatement;
        Pelicula pelicula=null;
        try {
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            pelicula = new Pelicula();
            pelicula.setCodigo(codigo);
            pelicula.setPrecio(precio);
            pelicula.setId_cat(id_cat);
            pelicula.setFormato4k(resultSet.getString("FORMATO4K"));
            pelicula.setNombre(resultSet.getString("NOMBRE"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pelicula;
    }
    
    public void buscarPeliculaNombre(String nombre){
        
    }

    public Pelicula buscarPeliculaCodigo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
