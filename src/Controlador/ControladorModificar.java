/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloModificar;
import java.sql.SQLException;

/**
 *
 * @author Cèsar
 */
public class ControladorModificar {
    
    private ModeloModificar modeloModificar;
    
    public void modificaPelicula(int codigo, String nombre) throws SQLException{
        modeloModificar=new ModeloModificar();
        modeloModificar.modificaPelicula(codigo, nombre);
    }
}
