/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloBorrar;
import java.sql.SQLException;

/**
 *
 * @author Daniela
  */

public class ControladorEliminar {
    
    private ModeloBorrar modeloBorrar;
    
    public void borrarPelicula(int codigo) throws SQLException{
        modeloBorrar=new ModeloBorrar();
        modeloBorrar.borrarPelicula(codigo);
    }
    
    public void borrarCategoria(int id_cat) throws SQLException{
        modeloBorrar=new ModeloBorrar();
        modeloBorrar.borrarCategoria(id_cat);
    }
    
    
    
}
