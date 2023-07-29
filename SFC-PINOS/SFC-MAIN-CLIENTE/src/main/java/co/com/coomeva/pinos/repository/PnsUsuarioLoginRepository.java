package co.com.coomeva.pinos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.coomeva.pinos.domain.PnsUsuarioLogin;

public interface PnsUsuarioLoginRepository extends JpaRepository <PnsUsuarioLogin, Integer>{
	
	PnsUsuarioLogin findByUsuarioIngreso(String nombre);
}
