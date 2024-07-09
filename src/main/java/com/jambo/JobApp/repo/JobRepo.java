package com.jambo.JobApp.repo;
import  com.jambo.JobApp.model.JobPost;
import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.ArrayList;


@Repository
public class JobRepo {
    
    List<JobPost> jobs=new ArrayList<>(Arrays.asList(
    new JobPost(1,"Java Dev","Must have good",1,List.of("Java","Spring Boot")),
    new JobPost(2,"Java Script Dev"," good",1,List.of("Java Script","React")),
    new JobPost(3,"Python Dev","Must have good",1,List.of("Python","Django")),
    new JobPost(4,"Jquery Dev","Must be Good at",1,List.of("js","Jquery")),
    new JobPost(5,"Mobile dev","Must have good at mobile application development",1,List.of("dart","Flutter"))
    ));
    
    
    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println("data added !!");
    }
    
}
