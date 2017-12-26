/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexion;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Daniela
 */
public class ModeloAgrega {
    
    //private ArrayList<Curso> cursos;
    private Empleados empleados;
    
    public void agregaEmpleados(Integer codigo, String rut, String nombre, String apellido, Integer celular, String email, Integer sueldo_bruto, String est_civil, String nom_depto) throws SQLException{
        System.out.println("Agregar Empleado...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="insert into EMPLEADOS (CODIGO, RUT, NOMBRE, APELLIDO,CELULAR, EMAIL, SUELDO_BRUTO, EST_CIVIL, NOM_DEPTO) VALUES ('"+codigo+"', '"+rut+"', '"+nombre+"', '"+apellido+"', '"+celular+"', '"+email+"', '"+sueldo_bruto+"', '"+est_civil+"', '"+nom_depto+"')";
        dec.executeUpdate(query1);
        
    }
}