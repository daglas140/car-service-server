package com.gawlas.CarServiceServer.dao.converters;

import com.gawlas.CarServiceServer.entities.PersonalInfo;
import org.modelmapper.ModelMapper;

public class PersonalInfoConveter {

    ModelMapper modelMapper;

    public PersonalInfoConveter() {
        this.modelMapper = new ModelMapper();
    }

    public PersonalInfo convertToEntity(com.gawlas.CarServiceServer.dao.apiModel.PersonalInfo src) {
        return modelMapper.map(src, PersonalInfo.class);
    }

    public com.gawlas.CarServiceServer.dao.apiModel.PersonalInfo convertToApi(PersonalInfo src) {
        return modelMapper.map(src, com.gawlas.CarServiceServer.dao.apiModel.PersonalInfo.class);
    }
}
