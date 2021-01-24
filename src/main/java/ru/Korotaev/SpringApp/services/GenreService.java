package ru.Korotaev.SpringApp.services;

import ru.Korotaev.SpringApp.DAO.GenreDAO;
import ru.Korotaev.SpringApp.Models.Genre;
import ru.Korotaev.SpringApp.Models.Music;

import java.util.List;

public class GenreService {
     private GenreDAO genreDAO = new GenreDAO();

     public GenreService(){}

     public Genre findGenre(int id){
         return genreDAO.findById(id);
     }

     public void saveGenre(Genre genre){
         genreDAO.save(genre);
     }
    public void deleteGenre(Genre genre){
        genreDAO.delete(genre);
    }
    public void updateGenre(Genre genre){
        genreDAO.update(genre);
    }

    public List<Genre> findAllGenres(){
         return genreDAO.findAll();
    }

    public Music findMusicById(int id){
         return genreDAO.findMusicById(id);
    }
}
