package net.engineeringdigest.journalApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.engineeringdigest.journalApp.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	
}
