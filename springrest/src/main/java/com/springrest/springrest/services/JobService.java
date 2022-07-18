package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Jobs;

public interface JobService {
    public List<Jobs> getjobs();

    public Jobs getjob(Long Id);

    public Jobs addJob(Jobs job);

    public Jobs updatejob(Jobs job);

    public String deljob(Long id);

}
