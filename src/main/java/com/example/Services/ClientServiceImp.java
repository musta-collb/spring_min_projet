package com.example.Services;

import com.example.Dao.ClientDao;
import com.example.Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImp implements ClientService{
    @Autowired
    private ClientDao clientDao;

    @Override
    public void ajouterClient(Client client) {
        clientDao.save(client);
    }

    @Override
    public Client recupererClientParId(long id) {
        return clientDao.getById(id);
    }

    @Override
    public void supprimerClient(long id) {
        clientDao.deleteById(id);
    }
}
