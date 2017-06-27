package main.java.hello;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adrian Ispas on 27.06.2017.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
