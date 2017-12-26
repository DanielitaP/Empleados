/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela
 */
public class ModeloSolicita {
    
    public Empleados SolicitarEmpleados (Integer codigo, String rut, String nombre, String apellido, Integer celular, String email, Integer sueldo_bruto, String est_civil, String nom_depto) throws SQLException{
        System.out.println("Buscar registro empleado...");
        String sql="SELECT CODIGO, RUT, NOMBRE, APELLIDO,CELULAR, EMAIL, SUELDO_BRUTO, EST_CIVIL, NOM_DEPTO FROM EMPLEADOS WHERE CODIGO="+codigo;
        PreparedStatement preparedStatement;
        Empleados empleados=null;
        try {
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            empleados = new Empleados();
            empleados.setCodigo(codigo);
            empleados.setRut(rut);
            empleados.setNombre(resultSet.getString("NOMBRE"));
            empleados.setApellido(resultSet.getString("APELLIDO"));
            empleados.setCelular(celular);
            empleados.setEmail(resultSet.getString("EMAIL"));
            empleados.setSueldo_bruto(sueldo_bruto);
            empleados.setEst_civil(resultSet.getString("EST_CIVIL"));
            empleados.setNom_depto(resultSet.getString("NOM_DEPTO"));
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleados;
    }
    
}
