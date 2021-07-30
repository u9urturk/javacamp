package Kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.hrms.entities.concretes.ConfirmationHistory;

public interface ConfirmationHistoryDao extends JpaRepository<ConfirmationHistory, Integer> {

}
