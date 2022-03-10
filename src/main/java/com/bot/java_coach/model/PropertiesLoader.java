package com.bot.java_coach.model;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader extends Properties {
    public static final String USER_NAME = "spring.datasource.username";
    public static final String PASSWORD = "spring.datasource.password";
    public static final String DB_URL = "spring.datasource.url";
public PropertiesLoader(){
    super();
    InputStream iS = PropertiesLoader.class.getClassLoader().getResourceAsStream("application.properties");
    try{
        this.load(iS);
    } catch (IOException e){
        System.out.println("Error al cargar las propiedades del sistema. Mensaje: " + e.getMessage());
    }
}

}
