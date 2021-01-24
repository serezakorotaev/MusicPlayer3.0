import ru.Korotaev.SpringApp.Models.Genre;
import ru.Korotaev.SpringApp.Models.Music;
import ru.Korotaev.SpringApp.services.GenreService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        GenreService genreService = new GenreService();
        Genre genre = new Genre("Classic");
        genreService.saveGenre(genre);
        Music moonSonata = new Music("Moon Sonata");
        moonSonata.setGenre(genre);
        genre.addMusic(moonSonata);
        Music rhapsody = new Music("Rhapsody");
        rhapsody.setGenre(genre);
        genre.addMusic(rhapsody);
        genreService.updateGenre(genre);
    }
}
