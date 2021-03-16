package an.buyvalenko.customer_service.service;

import an.buyvalenko.customer_service.model.Client;

import java.util.ArrayList;

public interface ClientService {
    /**
     * Создает нового клиента
     * @param client - клиент для создания
     */
    void create(Client client);

    /**
     * Возвращает список всех имеющихся клиентов
     * @return список клиентов
     */
    ArrayList<Client> readAll();

    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - объект клиента с заданным ID
     */
    Client read(long id);

    /**
     * Обновляет клиента с заданным ID,
     * в соответствии с переданным клиентом
     * @param client - клиент в соответсвии с которым нужно обновить данные
     * @param id - id клиента которого нужно обновить
     * @return - true если данные были обновлены, иначе false
     */
    boolean update(Client client, long id);
}
