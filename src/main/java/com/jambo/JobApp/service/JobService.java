package com.jambo.JobApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jambo.JobApp.model.JobPost;
import com.jambo.JobApp.repo.JobRepo;
import java.util.List;


@Service
public class JobService {
    
    
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost job){
        repo.addJob(job);

    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
    
}
