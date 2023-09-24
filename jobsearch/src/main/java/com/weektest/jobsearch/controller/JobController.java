package com.weektest.jobsearch.controller;

import com.weektest.jobsearch.model.Jobsearch;
import com.weektest.jobsearch.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;
    @PostMapping("job")
    public String addJob(@RequestBody Jobsearch job)
    {
        return jobService.addJob(job);
    }

    @GetMapping("getjobs")
    public List<Jobsearch> getJob()
    {
        return  jobService.getAllJobs();
    }

    @GetMapping("getjob/id/{id}")
    public Jobsearch getJobById(@PathVariable Integer id)
    {
        return jobService.getJobById(id);
    }

    @DeleteMapping("deletejob/id/{id}")
    public String deleteJobById(@PathVariable Integer id)
    {
        return jobService.deletejob(id);
    }

    @GetMapping ("getjob/title/{title}")
    public List<Jobsearch> getJobByTitle(@PathVariable String title)
    {
        return jobService.getJobByTitle(title);
    }

    @GetMapping ("getjob/location/{location}/salarygreater/{salary}")
    public List<Jobsearch> getJobByTitle(@PathVariable String location,@PathVariable double salary)
    {
        return jobService.getJobByLocationandSalary(location,salary);
    }

    @PutMapping("updatejob/id/{id}/salary/{salary}")
    public String updateSalaryById(@PathVariable Integer Id,@PathVariable  double salary)
    {
        return jobService.updateSalary(Id,salary);
    }
}
