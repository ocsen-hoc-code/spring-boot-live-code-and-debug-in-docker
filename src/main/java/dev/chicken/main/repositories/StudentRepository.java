package dev.chicken.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.chicken.main.models.Students;

public interface StudentRepository extends JpaRepository<Students, Integer> {
}
