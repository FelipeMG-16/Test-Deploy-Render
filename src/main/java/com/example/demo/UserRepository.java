package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository //Anotacion para convertir mi interface en un repositorio

public interface UserRepository extends JpaRepository<User, Long>{
	
	//Query personalizada
	@Query("SELECT usuario FROM User WHERE usuario.nombre=?1")

	Optional<User> findByUsername(String username);
}




	