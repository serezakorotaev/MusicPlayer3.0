package ru.Korotaev.SpringApp.Models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotEmpty(message = "genre should not be empty")
    @Size(min = 1,max=15, message = "genre name should be between 1 and 15 characters")
    private String name;

    @OneToMany(mappedBy = "genres", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Music> musicArray;

    public Genre( String name) {

        this.name = name;
        musicArray = new ArrayList<>();
    }

    public Genre() {
    }

    public void addMusic(Music music){
        music.setGenre(this);
        musicArray.add(music);
    }
    public void removeMusic(Music music){
        musicArray.remove(music);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Music> getMusicArray() {
        return musicArray;
    }

    public void setMusicArray(List<Music> musicArray) {
        this.musicArray = musicArray;
    }

    @Override
    public String   toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", music=" + musicArray +
                '}';
    }
}
