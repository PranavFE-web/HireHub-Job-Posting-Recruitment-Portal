package com.example.JobApp.repo;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {


    // ArrayList to store JobPost objects
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost()));


    // method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return jobs;
    }

    // method to save a job post object into arrayList
    public void addJob(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);

    }

}

