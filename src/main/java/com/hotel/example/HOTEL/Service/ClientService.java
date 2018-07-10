package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Dto.ClientDto;
import com.hotel.example.HOTEL.Entities.Client;
import com.hotel.example.HOTEL.Repository.RepositoryClient;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private RepositoryClient repositoryClient;
    @Autowired
    private ModelMapper modelMapper;



    public void  save(ClientDto clientDto){
        Client clientToSave = modelMapper.map(clientDto, Client.class);
        repositoryClient.save(clientToSave);
    }
}
