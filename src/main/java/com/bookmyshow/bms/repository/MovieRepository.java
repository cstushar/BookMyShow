package com.bookmyshow.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookmyshow.bms.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Movie findByTitle(final String title);
}