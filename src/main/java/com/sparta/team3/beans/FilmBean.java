package com.sparta.team3.beans;

import com.sparta.team3.components.Film;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class FilmBean {

    @Inject
    private DAO dao;

    public List<Object> displayFilms(String userInput){

        if (userInput == null) {
            return dao.getFilms();
        } else {
            return dao.getFilmsByActors(userInput);
        }
    }
}

//1List all actors - and show films that the selected actor has been inq
//        2List all filsm
//        3
//        4