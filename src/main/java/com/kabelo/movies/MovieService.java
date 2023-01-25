package com.kabelo.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepo;
    public List<Movie> allMovies(){
        //System.out.println(movieRepo.findAll().toString());
        return movieRepo.findAll();


    }
}
