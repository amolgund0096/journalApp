package net.engineeringdigest.journalApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.engineeringdigest.journalApp.Entity.Test;

public interface TestRepository extends JpaRepository<Test, Integer>{

}
