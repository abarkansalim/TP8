package cigma.pfe.services;

import cigma.pfe.dao.IClientDao;
import cigma.pfe.models.Client;

public class ClientServiceImpl implements IClientService{
    IClientDao clientDao ;
    public ClientServiceImpl(IClientDao clientDao) {
        System.out.println("Call ClientServiceImpl with ClientRepository param....");
        this.clientDao = clientDao;
    }

    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }

    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientDao.save(c);
    }

    @Override
    public Client modify(Client c) {
        return clientDao.update(c);
    }

    @Override
    public void removeById(long id) {
        clientDao.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return clientDao.findById(id);
    }
}
