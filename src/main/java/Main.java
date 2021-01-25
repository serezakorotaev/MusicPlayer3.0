import ru.Korotaev.SpringApp.Models.Genre;
import ru.Korotaev.SpringApp.Models.Music;
import ru.Korotaev.SpringApp.services.GenreService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        GenreService genreService = new GenreService();
//        Genre genre = new Genre("Classic");
//        genreService.saveGenre(genre);
//        Music moonSonata = new Music("Moon Sonata");
//        moonSonata.setGenre(genre);
//        genre.addMusic(moonSonata);
//        Music rhapsody = new Music("Rhapsody");
//        rhapsody.setGenre(genre);
//        genre.addMusic(rhapsody);
//        genreService.updateGenre(genre);
//        genreService.deleteGenre(genre);


        Genre genre1 = new Genre("Rock");
//        genreService.saveGenre(genre1);
//        Music be2=new Music("Likes");
//        be2.setGenre(genre1);
//        genre1.addMusic(be2);
//        genreService.updateGenre(genre1);
//        genreService.deleteGenre(genre1);



    }
}
