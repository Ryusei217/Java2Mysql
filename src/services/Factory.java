/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 */
public class Factory {
    private static Connection conexion;
    private static PreparedStatement consulta;
    private static ResultSet datos;
    
     /**
     * Realiza una nueva conexion al servidor indicado
     * @param servidor nombre del servidor
     * @param bd nombre de la base de datos
     * @param usuario nombre del usuario
     * @param password contraseña del usuario
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static void conectar(String servidor, String bd, String usuario, String password) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://"+servidor+"/"+bd,usuario,password);
    }
    
    /**
     * Cierra todas las conexiones con la base de datos.
     * @throws SQLException 
     */
    public static void desconectar() throws SQLException{
        conexion.close();
        consulta.close();
        datos.close();
    }

    /* Getters y Setters */
    public static Connection getConexion() {
        return conexion;
    }

    public static void setConexion(Connection aConexion) {
        conexion = aConexion;
    }

    public static PreparedStatement getConsulta() {
        return consulta;
    }

    public static void setConsulta(PreparedStatement aConsulta) {
        consulta = aConsulta;
    }

    public static ResultSet getDatos() {
        return datos;
    }

    public static void setDatos(ResultSet aDatos) {
        datos = aDatos;
    }
}
