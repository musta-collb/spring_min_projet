package com.example.Services;

import com.example.Entities.Client;

public interface ClientService {
    public void ajouterClient(Client client);

    public Client recupererClientParId(long id);

    public void supprimerClient(long id);

}
