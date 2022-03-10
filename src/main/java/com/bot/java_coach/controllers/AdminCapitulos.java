package com.bot.java_coach.controllers;

import com.bot.java_coach.model.dao.CapitulosDao;
import com.bot.java_coach.model.dto.CapitulosDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class AdminCapitulos{
    private CapitulosDao capitulosDao = new CapitulosDao();                                                      //llamamos a capitulo dao para obtener capitulo dto(capitulos dao sabe llamar a capitulos y capitulosdto sabe mostrar la informacion)


    @GetMapping("/capitulos")
    public List<CapitulosDto> listarCapitulosDto() {
        List<CapitulosDto> capitulosDto = null;
        try {
            capitulosDto = capitulosDao.listarCapitulosDto();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return capitulosDto;

   /* @GetMapping("/capitulos")
    public CapitulosDto listarCapitulos() {
        CapitulosDto capitulosDto = listarCapitulos();
        return capitulosDto;
    }*/

    }}

