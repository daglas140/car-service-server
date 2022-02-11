package com.gawlas.CarServiceServer.services;

import com.gawlas.CarServiceServer.entities.dictionary.DictInfo;
import com.gawlas.CarServiceServer.entities.dictionary.DictItem;
import com.gawlas.CarServiceServer.repository.DictInfoRepository;
import com.gawlas.CarServiceServer.repository.DictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictService {

    @Autowired
    private DictRepository dictRepository;
    @Autowired
    private DictInfoRepository dictInfoRepository;

    public List<DictItem> getDictItems(String dictKey) {
        return dictRepository.findByDictInfoDictKey(dictKey);
    }

    public DictInfo getDict(String dictKey) {
        return dictInfoRepository.findByDictKey(dictKey);
    }
}
