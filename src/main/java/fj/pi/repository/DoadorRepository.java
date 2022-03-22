package fj.pi.repository;



import java.util.List;
import fj.pi.model.Doador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DoadorRepository extends JpaRepository<Doador, Long> {


}
