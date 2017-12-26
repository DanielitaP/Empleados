/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleados;
import Modelo.ModeloSolicita;
import java.sql.SQLException;

/**
 *
 * @author Daniela
 */
public class ControladorSolicita {
    
    private ModeloSolicita modeloSolicita;
    
     public Empleados solicitaEmpleadosCodigo(Integer codigo, String rut, String nombre, String apellido, Integer celular, String email, Integer sueldo_bruto, String est_civil, String nom_depto) throws SQLException{
         modeloSolicita=new ModeloSolicita();
         return modeloSolicita.SolicitarEmpleados(codigo, rut, nombre, apellido, codigo, email, codigo, est_civil, nom_depto);
     }

    public ModeloSolicita getModeloSolicita() {
        return modeloSolicita;
    }

}
