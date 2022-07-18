package com.springrest.springrest.myController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Jobs;
import com.springrest.springrest.services.JobService;

@RestController
public class MyController {

    @Autowired
    public JobService js;

    // @GetMapping("/home")
    // public String home() {
    // return "This is Home";
    // }

    @RequestMapping("/jobs")
    public List<Jobs> getjobs() {
        return js.getjobs();
    }

    @GetMapping("/jobs/{id}")
    public Jobs getjobid(@PathVariable String id) {
        return js.getjob(Long.parseLong(id));
    }

    @PostMapping("/jobs")
    public Jobs addjob(@RequestBody Jobs job) {
        return js.addJob(job);
    }

    @PutMapping("/jobs")
    public Jobs updatejob(@RequestBody Jobs job) {
        return js.updatejob(job);
    }

    @DeleteMapping("/jobs/{id}")
    public String deljob(@PathVariable String id) {
        return js.deljob(Long.parseLong(id));
    }
}
