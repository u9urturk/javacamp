package Kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.hrms.entities.concretes.JobSeeker;

public interface JobSeekersDao extends JpaRepository<JobSeeker, Integer> {

	JobSeeker findByNationalIdentity(String nationalIdentity);

}
