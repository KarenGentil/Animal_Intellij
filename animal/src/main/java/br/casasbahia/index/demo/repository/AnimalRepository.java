package br.casasbahia.index.demo.repository;


import br.casasbahia.index.demo.model.Animal;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
