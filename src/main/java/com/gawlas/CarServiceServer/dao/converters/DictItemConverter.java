package com.gawlas.CarServiceServer.dao.converters;

import com.gawlas.CarServiceServer.entities.dictionary.DictItem;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class DictItemConverter {
    ModelMapper modelMapper;

    public DictItemConverter() {
        this.modelMapper = new ModelMapper();
    }

    public DictItem convertToEntity(com.gawlas.CarServiceServer.dao.apiModel.DictItem src) {
        return modelMapper.map(src, DictItem.class);
    }

    public com.gawlas.CarServiceServer.dao.apiModel.DictItem convertToApi(DictItem src) {
        return modelMapper.map(src, com.gawlas.CarServiceServer.dao.apiModel.DictItem.class);
    }

    public List<DictItem> convertToEntityList(List<com.gawlas.CarServiceServer.dao.apiModel.DictItem> dictItemList) {
        return dictItemList.stream().map(this::convertToEntity).collect(Collectors.toList());
    }

    public List<com.gawlas.CarServiceServer.dao.apiModel.DictItem> convertToApiList(List<DictItem> dictItemList) {
        return dictItemList.stream().map(this::convertToApi).collect(Collectors.toList());
    }
}
