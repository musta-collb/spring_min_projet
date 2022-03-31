package com.example.Controllers;

import com.example.Entities.Client;
import com.example.Entities.Produit;
import com.example.Services.ClientService;
import com.example.Services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class ClientController {

    @Autowired
    private ClientService clientService;
    //@Autowired
    //private ProduitService produitService;


    @GetMapping(path = "/clients")
    public List<Client> getClients(){
        return clientService.recuperClients();
    }

    @GetMapping(path="/clients/{id}")
    public Client getClient(@PathVariable long id){
        return clientService.recupererClientParId(id);
    }
    @PostMapping(path = "/clients")
    public void ajouterClient(@RequestBody Client client){
        clientService.ajouterClient(client);
    }
    @DeleteMapping(path = "/clients/{id}")
    public void supprimerClient(@PathVariable long id){
        clientService.supprimerClient(id);
    }
    @PutMapping(path = "/clients/{id}")
    public void modifierClient(@RequestBody Client client){
        clientService.ajouterClient(client);
    }

    //Listons les produits d'un client
   // @GetMapping(path = "/{id}/produits")
    // public List<Produit> recupererProduits(@PathVariable long id)
    //{
      //  return clientService.recupererProduits(id);
    //}

}
