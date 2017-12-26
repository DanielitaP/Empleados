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
 * @author Daniela
 */
public class ControladorModificar {
    
    private ModeloModificar modeloModificar;
    
    public void modificaEmpleados(Integer codigo, String rut, String nombre, String apellido, Integer celular, String email, Integer sueldo_bruto, String est_civil, String nom_depto) throws SQLException{
        modeloModificar=new ModeloModificar();
        modeloModificar.modificaEmpleados(codigo, nombre, nombre, nombre, codigo, nombre, codigo, nombre, nombre);
    }
}
