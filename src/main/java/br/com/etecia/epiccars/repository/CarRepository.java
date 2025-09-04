package br.com.etecia.epiccars.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etecia.epiccars.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
