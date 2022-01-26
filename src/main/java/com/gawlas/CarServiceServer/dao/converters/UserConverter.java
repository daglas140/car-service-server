package com.gawlas.CarServiceServer.dao.converters;

import com.gawlas.CarServiceServer.entities.User;
import org.modelmapper.ModelMapper;

public class UserConverter {
    ModelMapper modelMapper;

    public UserConverter() {
        this.modelMapper = new ModelMapper();
    }

    public User convertToEntity(com.gawlas.CarServiceServer.dao.apiModel.User src) {
        return modelMapper.map(src, User.class);
    }

    public com.gawlas.CarServiceServer.dao.apiModel.User convertToApi(User src) {
        return modelMapper.map(src, com.gawlas.CarServiceServer.dao.apiModel.User.class);
    }
}