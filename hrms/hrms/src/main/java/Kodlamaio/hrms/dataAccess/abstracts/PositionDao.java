package Kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.hrms.entities.concretes.Position;


public interface PositionDao extends JpaRepository<Position, Integer> {

}
