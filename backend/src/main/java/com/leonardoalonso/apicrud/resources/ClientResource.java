package com.leonardoalonso.apicrud.resources;

import com.leonardoalonso.apicrud.entities.Client;
import com.leonardoalonso.apicrud.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        List<Client> list =  clientService.findAll();
        return ResponseEntity.ok().body(list);
    }
}
