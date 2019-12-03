/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.movies.models;

import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.model.MovieDb;
import info.movito.themoviedbapi.model.Video;
import info.movito.themoviedbapi.model.core.MovieResultsPage;
import java.util.ArrayList;

/**
 *
 * @author jones
 */
public class Movies {
    
    private static final TmdbApi CONNECTION = new TmdbApi("92e8e436ac6f62d8a8750e0882a1943c");
    private static final String LANGUAGE = "en-US";
    public ArrayList<MovieDb> getMovies(){
        TmdbMovies movies = new TmdbMovies(CONNECTION);
    
        MovieResultsPage results = movies.getNowPlayingMovies(LANGUAGE, Integer.SIZE, "");
    
        return (ArrayList<MovieDb>) results.getResults();
    }
    
    public ArrayList<Video> getVideos(int movieId){
        TmdbMovies movies = new TmdbMovies(CONNECTION);
        
        return (ArrayList<Video>) movies.getVideos(movieId, LANGUAGE);

    }
    
}
