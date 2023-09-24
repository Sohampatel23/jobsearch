package com.weektest.jobsearch.repo;

import com.weektest.jobsearch.model.Jobsearch;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IJobRepo extends CrudRepository<Jobsearch,Integer> {

    List<Jobsearch> findByTitleContaining(String keyword);
    List<Jobsearch> findByLocationAndSalaryGreaterThan(String location, double salary);


//    @Modifying
//    @Query(value = "UPDATE JOBSEARCH  SET SALARY = salary WHERE ID = :id", nativeQuery = true)
//    void updateJobById(Integer id, Double salary);
}
