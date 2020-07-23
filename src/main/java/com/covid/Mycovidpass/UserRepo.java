package com.covid.Mycovidpass;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<d2, Long> {
    d2 findById(long pnumber);
}