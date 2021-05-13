package com.leonardoalonso.apicrud.services;

import com.leonardoalonso.apicrud.dto.ClientDTO;
import com.leonardoalonso.apicrud.entities.Client;
import com.leonardoalonso.apicrud.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public List<ClientDTO> findAll() {
        List<Client> list = clientRepository.findAll();
        return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
    }
}
