package com.gawlas.CarServiceServer.controllers;

import com.gawlas.CarServiceServer.dao.apiModel.DictItem;
import com.gawlas.CarServiceServer.dao.converters.DictItemConverter;
import com.gawlas.CarServiceServer.entities.dictionary.DictInfo;
import com.gawlas.CarServiceServer.services.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/dict")
public class DictController {

    @Autowired
    private DictService dictService;

    @GetMapping("/getDictItems")
    public List<DictItem> getDictItems(String dictKey) {
        return new DictItemConverter().convertToApiList(dictService.getDictItems(dictKey));
    }

    @GetMapping("/getDict")
    public DictInfo getDict(String dictKey) {
        return dictService.getDict(dictKey);
    }
}
