/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pelicula;
import Modelo.Categoria;
import Modelo.ModeloMostrar;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Daniela (
 */
public class ControladorMostrar {
    
    private ModeloMostrar modeloLista;
    
    public ArrayList <Pelicula> getListadoPelicula() throws SQLException{
        modeloLista = new ModeloMostrar();
        return modeloLista.getListadoPelicula(); 
    }
    
    public ArrayList <Categoria> getListadoCategoria() throws SQLException{
        modeloLista = new ModeloMostrar();
        return modeloLista.getListadoCategoria(); 
    }
    
}
