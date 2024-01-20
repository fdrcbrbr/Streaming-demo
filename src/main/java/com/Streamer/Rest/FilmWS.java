package com.Streamer.Rest;

import com.Streamer.Model.Film;
import com.Streamer.dao.FilmDao;
import com.Streamer.dao.FilmDaoImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FilmWS")
public class FilmWS {
    @PostMapping
    public ResponseEntity<String> Save(@RequestBody Film f){
        FilmDao fd = new FilmDaoImpl();
        fd.save(f);
        return new ResponseEntity<String>("Film added.", HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity <List<Film>> search(@RequestParam String director){
        FilmDao fd = new FilmDaoImpl();
        List<Film> list = fd.search(director);
        return new ResponseEntity <List<Film>>(list, HttpStatus.OK);
    }
}
