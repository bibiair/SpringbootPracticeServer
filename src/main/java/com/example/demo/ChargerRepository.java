package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
interface ChargerRepository extends JpaRepository<Charger,Long>{
}