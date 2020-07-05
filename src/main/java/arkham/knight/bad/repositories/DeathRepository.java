package arkham.knight.bad.repositories;

import arkham.knight.bad.models.Death;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeathRepository extends JpaRepository<Death, Long> {
}
