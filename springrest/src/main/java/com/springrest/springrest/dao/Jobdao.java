package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;
import com.springrest.springrest.entities.Jobs;

// @Repository
public interface Jobdao extends JpaRepository<Jobs, Long> {
    // Jobs getjobbyid(Long id);

}
