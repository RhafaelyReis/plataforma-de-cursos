package br.edu.ifms.plataforma_cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifms.plataforma_cursos.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    
} 