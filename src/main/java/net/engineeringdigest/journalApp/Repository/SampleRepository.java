package net.engineeringdigest.journalApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.engineeringdigest.journalApp.Entity.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
