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
 * @author Daniela
 */
public class ControladorAgrega {
    private ModeloAgrega modeloAgrega;
    
    public void agregaEmpleados(Integer codigo, String rut, String nombre, String apellido, Integer celular, String email, Integer sueldo_bruto, String est_civil, String nom_depto) throws SQLException{
        modeloAgrega=new ModeloAgrega();
        modeloAgrega.agregaEmpleados(codigo, rut, nombre, apellido, celular, email, sueldo_bruto, est_civil, nom_depto);
    }
    
    
}
