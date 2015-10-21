package com.spdukraine.mvc.repository;


import com.spdukraine.mvc.entity.Applicant;

import java.util.List;

public interface ApplicantDao {
    public void insert(Applicant applicant);
    public void delete(int id);
    public Applicant findApplicantbyId(int id);
    public void updateApplicant(Applicant applicant);
    public List<Applicant> getAllApplicant();
}
