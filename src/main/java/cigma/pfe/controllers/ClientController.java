package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;

public class ClientController {
    IClientService clientService;
    public ClientController(IClientService clientService) {
        System.out.println("Call ClientController with clientService param....");
        this.clientService = clientService;
    }

    public Client save(Client c){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }

    public ClientController() {
        System.out.println("Call ClientController ....");
    }

    public void modify(Client c){
        clientService.modify(c);
    }

    public void removeById(long id){
        clientService.removeById(id);
    }

    public Client getById(long id){
        return clientService.getById(id);
    }
}
