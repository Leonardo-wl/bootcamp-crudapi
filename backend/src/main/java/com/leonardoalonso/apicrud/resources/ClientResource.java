package com.leonardoalonso.apicrud.resources;

import com.leonardoalonso.apicrud.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        List<Client> list = new ArrayList<>();
        list.add(new Client(1L, "Leonardo", "12345678900", 2000.00, null, 2));
        list.add(new Client(1L, "Sandra", "23555589878", 3000.00, null, 3));
        return ResponseEntity.ok().body(list);
    }
}
