package com.example.Services;

import com.example.Entities.Produit;
import com.example.Repositories.ClientDao;
import com.example.Entities.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public void supprimerClient(long id) throws Exception{
        try {
            clientDao.deleteById(id);
        }catch (Exception e){
            throw new Exception("supprission entité : entité avec l'id: "+id+" non trouvée!");
        }

    }

    @Override
    public List<Client> recuperClients(){
        return clientDao.findAll();
    }

    @Override
    public Client trouverClientParEmail(String email) {
        return clientDao.findByEmailEquals(email);
    }
    /*
    @Override
    public List<Produit> recupererProduits(long id){
        return clientDao.recupererProduitsParClients(id);
    }
    */

}
