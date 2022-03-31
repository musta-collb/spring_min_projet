package com.example.Services;

import com.example.Entities.Produit;
import com.example.Repositories.ClientDao;
import com.example.Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Client> recuperClients(){
        return clientDao.findAll();
    }
    /*
    @Override
    public List<Produit> recupererProduits(long id){
        return clientDao.recupererProduitsParClients(id);
    }
    */

}
