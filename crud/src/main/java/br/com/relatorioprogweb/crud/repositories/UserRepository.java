package br.com.relatorioprogweb.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.relatorioprogweb.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
