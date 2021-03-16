package an.buyvalenko.customer_service.repository;

import an.buyvalenko.customer_service.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
