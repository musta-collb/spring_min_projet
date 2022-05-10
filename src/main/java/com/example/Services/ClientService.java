package com.example.Services;

import com.example.Entities.Client;
import com.example.Entities.Produit;
import com.example.Repositories.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ClientService {
    public void ajouterClient(Client client);

    public Client recupererClientParId(long id);

    public void supprimerClient(long id) throws Exception;

    public List<Client> recuperClients();

    public Client trouverClientParEmail(String email);

    //public List<Produit> recupererProduits(long id);

}