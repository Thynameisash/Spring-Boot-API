package com.springrest.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.dao.Jobdao;
import com.springrest.springrest.entities.Jobs;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    public Jobdao jdao;

    @Override
    public List<Jobs> getjobs() {
        return jdao.findAll();
    }

    @Override
    public Jobs getjob(Long Id) {
        return jdao.findById(Id).orElse(null);
    }

    @Override
    public Jobs addJob(Jobs job) {
        System.out.println(job);
        jdao.save(job);
        return job;
    }

    @Override
    public Jobs updatejob(Jobs job) {
        jdao.save(job);
        return job;
    }

    @Override
    public String deljob(Long id) {
        jdao.deleteById(id);
        return "Deleted";
    }
}
