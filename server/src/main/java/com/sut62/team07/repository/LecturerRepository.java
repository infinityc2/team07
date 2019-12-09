package com.sut62.team07.repository;

import java.util.Optional;

import com.sut62.team07.entity.Lecturer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LecturerRepository extends JpaRepository<Lecturer, Long>{

	Optional<Lecturer> findByName(String name);

}