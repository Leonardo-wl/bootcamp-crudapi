package com.leonardoalonso.apicrud.services;

import com.leonardoalonso.apicrud.entities.Client;
import com.leonardoalonso.apicrud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll() {
        return clientRepository.findAll();
    }
}
