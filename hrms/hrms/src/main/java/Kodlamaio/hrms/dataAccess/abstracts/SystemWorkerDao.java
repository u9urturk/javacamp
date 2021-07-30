package Kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.hrms.entities.concretes.SystemWorker;


public interface SystemWorkerDao extends JpaRepository<SystemWorker, Integer>{

}
