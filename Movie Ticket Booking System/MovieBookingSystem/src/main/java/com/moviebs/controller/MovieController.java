package com.moviebs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.moviebs.dto.MovieDTO;
import com.moviebs.model.Movie;
import com.moviebs.service.MovieService;
import com.moviebs.util.MovieConverter;

//indicates that this class is a controller that handles RESTful API requests
@RestController
@RequestMapping("/api")
public class MovieController 
{
	
	//automatic dependency injection
	@Autowired
	private MovieService movieService;
	
	//automatic dependency injection.
	@Autowired
	private MovieConverter movieConverter;
	
	// POST request to add a movie
	@PostMapping("/addMovie")
	public ResponseEntity<String> createMovie(@RequestBody MovieDTO movieDTO)
	{
		
		// converts the MovieDTO to a Movie entity using the movieConverter
		final Movie movie= movieConverter.convertToMovieEntity(movieDTO);
		
		
			//calls the createMovie method from the movieService
			movieService.createMovie(movie);
			return new ResponseEntity<String>("Movie is added Successfully", 
					HttpStatus.CREATED);
	}
	
	
	//Handles the GET request to retrieve all movies
	@GetMapping("/getAllMovies")
	public List<Movie> getAllMovies()
	{
		return movieService.getAllMovies();
	}
	
	//Handles the PUT request to update a movie
	@PutMapping("/{id}")
	public ResponseEntity<?> updateMovie(@PathVariable("id") int id, @RequestBody MovieDTO movieDTO)
		{
			Movie movie1= movieConverter.convertToMovieEntity(movieDTO);
			return new ResponseEntity<MovieDTO>(movieService.updateMovie(id, movie1), HttpStatus.OK);
		}
		
	
	// Handles the DELETE request to delete a movie
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteMovieById(@PathVariable ("id") int id)
	{
			
				return new ResponseEntity<String>(movieService.deleteMovieById(id), HttpStatus.OK);
	}
		
	
	//Handles the GET request to retrieve movies by genre
	@GetMapping("/getMovieByGenre/{genre}")
	public List<MovieDTO> getMovieByGenre(@PathVariable("genre") String genre)
	{
		return movieService.getMovieByGenre(genre);
	}
	
	// Handles the GET request to retrieve movies by price
	@GetMapping("/getMovieByPrice/{price}")
	public List<MovieDTO> getMovieByPrice(@PathVariable("price") float moviePrice)
	{
		return movieService.getMovieByPrice(moviePrice);
	}
	
//	@GetMapping("/getMovieByPriceBetween/{startPrice}/{endPrice}")
//	public List<MovieDTO> getMovieByPriceBetween(@PathVariable("startPrice") float startPrice,
//			@PathVariable("endPrice") float endPrice)
//	{
//		return movieService.getMovieBYPriceBetween(startPrice, endPrice);
//	}	

}
