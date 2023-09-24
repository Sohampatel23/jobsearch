package com.weektest.jobsearch.service;

import com.weektest.jobsearch.model.Jobsearch;
import com.weektest.jobsearch.repo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class JobService {

    @Autowired
    IJobRepo iJobRepo;
    public String addJob(Jobsearch job) {

        iJobRepo.save(job);
        return "Job Added";
    }



    public List<Jobsearch> getAllJobs() {
       return (List<Jobsearch>) iJobRepo.findAll();
    }

    public Jobsearch getJobById(Integer id) {
        return iJobRepo.findById(id).get();
    }

    public String deletejob(Integer id) {
        iJobRepo.deleteById(id);
        return "Job Deleted";
    }

    public List<Jobsearch> getJobByTitle(String title) {
        return  iJobRepo.findByTitleContaining(title);
    }

    public List<Jobsearch> getJobByLocationandSalary(String location, double salary) {
        return iJobRepo.findByLocationAndSalaryGreaterThan(location,salary);
    }



    public String updateSalary(Integer id, double salary) {

        Jobsearch jobsearch = iJobRepo.findById(id).orElse(null);
        if(jobsearch != null)
        {
            jobsearch.setSalary(salary);
            iJobRepo.save(jobsearch);
            return "Salary updated!!";
        }
        else {
            return "Salary not found!";
        }
    }
}
