package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db"; //ruta de la base de datos pero cuando se vaya a montar a iMaster toca dejarlo predeterminado

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION; //llave de acceso a la base de datos 

        return DriverManager.getConnection(url); // puente de comunicaciones a un tipo Connection
    }
}
