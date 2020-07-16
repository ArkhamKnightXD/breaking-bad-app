package arkham.knight.bad.repositories;

import arkham.knight.bad.models.Cast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CastRepository extends JpaRepository<Cast, Long> {

    Cast findByName(String characterName);

    List<Cast> findByNameLike(String characterName);
}
