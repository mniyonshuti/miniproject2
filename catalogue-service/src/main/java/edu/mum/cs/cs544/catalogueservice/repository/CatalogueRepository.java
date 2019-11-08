package edu.mum.cs.cs544.catalogueservice.repository;

import edu.mum.cs.cs544.catalogueservice.model.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueRepository extends JpaRepository<Catalogue, Long> {
}
