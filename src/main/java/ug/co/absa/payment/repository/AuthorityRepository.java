package ug.co.absa.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.co.absa.payment.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
