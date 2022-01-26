package com.gawlas.CarServiceServer.repository;

import com.gawlas.CarServiceServer.entities.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer> {
}
