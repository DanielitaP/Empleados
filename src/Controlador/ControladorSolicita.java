/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pelicula;
import Modelo.ModeloSolicita;
import java.sql.SQLException;

/**
 *
 * @author Daniela
 */
public class ControladorSolicita {
    
    private ModeloSolicita modeloBusca;
    
     public Pelicula buscarPeliculaCodigo(int codigo) throws SQLException{
         modeloBusca=new ModeloSolicita();
         return modeloBusca.buscarPeliculaCodigo(codigo);  
     }

    public ModeloSolicita getModeloBusca() {
        return modeloBusca;
    }

    public void setModeloBusca(ModeloSolicita modeloBusca) {
        this.modeloBusca = modeloBusca;
    }
    
}
