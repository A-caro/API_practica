package com.bot.java_coach.model.dao;
import com.bot.java_coach.model.PropertiesLoader;
import com.bot.java_coach.model.dto.CapitulosDto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CapitulosDao {
    PropertiesLoader pl = new PropertiesLoader();
    private Conexion con;
    private Connection connection;

    public CapitulosDao() {
        String jdbcURL = (String) pl.get(PropertiesLoader.DB_URL);
        String jdbcUsername = (String) pl.get(PropertiesLoader.USER_NAME);
        String jdbcPassword = (String) pl.get(PropertiesLoader.PASSWORD);

        System.out.println(jdbcURL);
        con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
    }


    // listar todos los productos
    public List<CapitulosDto> listarCapitulosDto() throws SQLException {
        List<CapitulosDto> listaCapitulosDto = new ArrayList<CapitulosDto>();
        String sql = "SELECT * FROM capitulos";
        con.conectar();
        connection = con.getJdbcConnection();
        Statement statement = connection.createStatement();
        ResultSet resulSet = statement.executeQuery(sql);

        while (resulSet.next()) {
            int id_capitulo = resulSet.getInt("id_capitulo");
            int numero_Capitulo = resulSet.getInt("numero_Capitulo");
            String nombre_Capitulo = resulSet.getString("nombre_Capitulo");
            int id_nivel = resulSet.getInt("id_nivel");
            CapitulosDto capitulosDto = new CapitulosDto(id_capitulo, numero_Capitulo, nombre_Capitulo, id_nivel);
            listaCapitulosDto.add(capitulosDto);
        }
        con.desconectar();
        return listaCapitulosDto;
    }




}


