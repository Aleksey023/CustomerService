package an.buyvalenko.customer_service.service;

import an.buyvalenko.customer_service.model.Client;
import an.buyvalenko.customer_service.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void create(Client client) {
        clientRepository.save(client);
    }

    @Override
    public ArrayList<Client> readAll() {
        return (ArrayList<Client>) clientRepository.findAll();
    }

    @Override
    public Client read(long id) {
        return clientRepository.getOne((int) id);
    }

    @Override
    public boolean update(Client client, long id) {
        if (clientRepository.existsById((int) id)) {
            client.setId(id);
            clientRepository.save(client);
            return true;
        }

        return false;
    }
}
