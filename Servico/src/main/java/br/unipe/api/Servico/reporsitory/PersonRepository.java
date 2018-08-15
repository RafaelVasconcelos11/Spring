package br.unipe.api.Servico.reporsitory;

import br.unipe.api.Servico.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
