package com.gawlas.CarServiceServer.repository;

import com.gawlas.CarServiceServer.entities.dictionary.DictInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DictInfoRepository extends JpaRepository<DictInfo, Integer> {
    DictInfo findByDictKey(String dictKey);
}
