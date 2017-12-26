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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela
 */
public class ModeloMostrar {
    
    public ArrayList<Empleados> getListadoEmpleados() throws SQLException{
        ArrayList<Empleados> listEmpleados = null;
        String sql="NOMBRE, APELLIDO, NOM_DEPTO FROM EMPLEADOS";
        PreparedStatement preparedStatement;
        try {
            listEmpleados=new ArrayList<>();
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Empleados empleados = new Empleados();
            empleados.setNombre(resultSet.getString("NOMBRE"));
            empleados.setApellido(resultSet.getString("APELLIDO"));
            empleados.setNom_depto(resultSet.getString("NOM_DEPTO"));
            listEmpleados.add(empleados);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloMostrar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listEmpleados;
    }
}