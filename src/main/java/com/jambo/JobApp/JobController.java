package com.jambo.JobApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jambo.JobApp.model.JobPost;
import com.jambo.JobApp.service.JobService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class JobController {
    
    @Autowired
    private JobService service;

    @RequestMapping({"/","home"})
    public String home(){
        System.out.println("hitted");
        return "home";
    }
    @GetMapping("addjob")
    public String addJob() {
        System.out.println("hello");
        return "addjob";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewAllJob(Model m) {
        
        List<JobPost> jobs=service.getAllJobs();
        m.addAttribute("jobPosts",jobs);
        return "viewAllJobs";
    }
    
    
    
}
