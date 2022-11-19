package Revisao.RevisaoElProva.repository;

import Revisao.RevisaoElProva.entity.Enderecos;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClienteRepository extends JpaRepository<Enderecos,Long> {

}
