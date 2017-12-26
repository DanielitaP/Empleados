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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela
 */
public class ModeloMostrar {
    
    public ArrayList<Pelicula> getListadoPelicula() throws SQLException{
        ArrayList<Pelicula> listPelicula = null;
        String sql="SELECT NOMBRE, FORMATO$K FROM A_PELICULA";
        PreparedStatement preparedStatement;
        try {
            listPelicula=new ArrayList<>();
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Pelicula pelicula = new Pelicula();
            pelicula.setNombre(resultSet.getString("NOMBRE"));
            pelicula.setFormato4k(resultSet.getString("FORMATO4K"));
            listPelicula.add(pelicula);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPelicula;
    }
    
    public ArrayList<Categoria> getListadoCategoria() throws SQLException{
        ArrayList<Categoria> listCategoria = null;
        String sql="SELECT DESCRIPCION_A_CATEGORIA FROM A_CATEGORIA";
        PreparedStatement preparedStatement;
        try {
            listCategoria=new ArrayList<>();
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Categoria categoria = new Categoria();
            categoria.setDescripcion(resultSet.getString("DESCRIPCION_A_CATEGORIA"));
            listCategoria.add(categoria);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCategoria;
    }
    
}
