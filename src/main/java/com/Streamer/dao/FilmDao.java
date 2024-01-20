package com.Streamer.dao;

import com.Streamer.Model.Film;

import java.util.List;

public interface FilmDao {
    public void save(Film f);
    public List<Film> search(String director);

}
