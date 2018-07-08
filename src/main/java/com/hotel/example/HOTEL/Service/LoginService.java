package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Dto.LoginDto;
import com.hotel.example.HOTEL.Entities.Login;
import com.hotel.example.HOTEL.Repository.RepositoryLogin;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class LoginService {

    @Autowired
    private RepositoryLogin repositoryLogin;
    @Autowired
    private ModelMapper modelMapper;




    public void  save(LoginDto loginDto){
        Login loginToSave = modelMapper.map(loginDto, Login.class);
        repositoryLogin.save(loginToSave);
    }
}
//    @Autowired
//    private ModelMapper modelMapper;
//
//    public List<ProductDto> findByNameFragment(String nameFragment){
//        List<ProductEntity> allByNameIsLike = productRepository.findAllByNameContaining(nameFragment);
//        return allByNameIsLike.stream().map(entity->modelMapper.map(entity, ProductDto.class)).collect(Collectors.toList());
//    }
//
//    public void save(ProductDto productDto){
//        ProductEntity entityToSave = modelMapper.map(productDto, ProductEntity.class);
//        productRepository.save(entityToSave);
//    }
//
//    public List<ProductDto> getAllProducts(){
//        Iterable<ProductEntity> allUsers = productRepository.findAll();
//        return StreamSupport.stream(allUsers.spliterator(), false)
//                .map(userEntity -> modelMapper.map(userEntity, ProductDto.class))
//                .collect(Collectors.toList());