package com.catalog.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.catalog.demo.entity.MovieInfo;
import com.catalog.demo.repository.MovieInfoRepository;

@RestController
public class MovieInfoController {

	@Autowired
	private MovieInfoRepository repository;

	@PostMapping("/movie-info/save")
	public List<MovieInfo> saveAll(@RequestBody List<MovieInfo> movieInfoList) {
		return repository.saveAll(movieInfoList);
	}

	@GetMapping("/movie-info/list")
	public List<MovieInfo> getAll() {
		return repository.findAll();
	}

	@GetMapping("/movie-info/find-path-by-id/{movieInfoId}")
	public String findPathById(@PathVariable Long movieInfoId) {
		var videoInfoOptional = repository.findById(movieInfoId);
		return videoInfoOptional.map(MovieInfo::getPath).orElse(null);
	}

}