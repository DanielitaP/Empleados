/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloAgrega;
import java.sql.SQLException;

/**
 *
 * @author daniela
 */
public class ControladorAgrega {
    private ModeloAgrega modeloAgrega;
    
    public void agregaPelicula(int codigo, int precio, int id_cat, String formato4k, String nombre) throws SQLException{
        modeloAgrega=new ModeloAgrega();
        modeloAgrega.agregaPelicula(codigo, precio, id_cat, formato4k, nombre);
    }
    
    public void agregaCategoria(int id_cat, String descripcion) throws SQLException{
        modeloAgrega=new ModeloAgrega();
        modeloAgrega.agregaCategoria(id_cat, descripcion);
    }
    
}
