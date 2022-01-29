package com.gawlas.CarServiceServer.repository;

import com.gawlas.CarServiceServer.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Client, Integer> {
}
