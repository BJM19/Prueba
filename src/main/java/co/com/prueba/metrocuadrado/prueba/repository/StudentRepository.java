package co.com.prueba.metrocuadrado.prueba.repository;

import co.com.prueba.metrocuadrado.prueba.entity.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Students,String> {

}

