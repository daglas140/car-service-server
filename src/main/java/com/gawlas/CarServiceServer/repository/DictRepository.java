package com.gawlas.CarServiceServer.repository;

import com.gawlas.CarServiceServer.entities.dictionary.DictInfo;
import com.gawlas.CarServiceServer.entities.dictionary.DictItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Repository
public interface DictRepository extends JpaRepository<DictItem, Integer> {
    List<DictItem> findByDictInfoDictKey(String dictKey);
}
