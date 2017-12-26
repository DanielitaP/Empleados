/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloEliminar;
import java.sql.SQLException;

/**
 *
 * @author Daniela
  */

public class ControladorEliminar {
    
    private ModeloEliminar modeloEliminar;
    
    public void eliminarEmpleado(int codigo) throws SQLException{
        modeloEliminar=new ModeloEliminar();
        modeloEliminar.EliminarEmpleados(codigo);
    }
   
    
    
}
