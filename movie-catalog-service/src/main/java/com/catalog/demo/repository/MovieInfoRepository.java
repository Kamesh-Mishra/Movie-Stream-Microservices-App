package com.catalog.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalog.demo.entity.MovieInfo;

@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo, Long> {

}
