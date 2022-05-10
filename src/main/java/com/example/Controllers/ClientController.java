package com.example.Controllers;

import com.example.Entities.Client;
import com.example.Entities.Produit;
import com.example.Services.ClientService;
import com.example.Services.ProduitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class ClientController {
    private Logger logger = LoggerFactory.getLogger(ClientController.class);
    @Autowired
    private ClientService clientService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder ;
    //@Autowired
    //private ProduitService produitService;


    @GetMapping(path = "/clients")
    public List<Client> getClients(){
        return clientService.recuperClients();

    }

    @GetMapping(path="/clients/{id}")
    public ResponseEntity<Client> getClient(@PathVariable long id){
            return ResponseEntity.ok().body(clientService.recupererClientParId(id));
    }

    @PostMapping(path = "/clients")
    public ResponseEntity<String> ajouterClient(@RequestBody Client client){
        System.out.println(client.toString());
        client.setPassword(bCryptPasswordEncoder.encode(client.getPassword()));
        clientService.ajouterClient(client);
        return ResponseEntity.ok().body("un client a était crée");
    }
    @DeleteMapping(path = "/clients/{id}")
    public void supprimerClient(@PathVariable long id){
        try {
            clientService.supprimerClient(id);
        }catch (Exception e){
            //
        }

    }
    @PutMapping(path = "/clients/{id}")
    public ResponseEntity<String> modifierClient(@RequestBody Client client,@PathVariable int id){
        client.setId(id);
        clientService.ajouterClient(client);
        return ResponseEntity.ok().body("le client a été modifié avec success!");
    }

    //Listons les produits d'un client
   // @GetMapping(path = "/{id}/produits")
    // public List<Produit> recupererProduits(@PathVariable long id)
    //{
      //  return clientService.recupererProduits(id);
    //}

}
