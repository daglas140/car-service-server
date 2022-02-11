package com.gawlas.CarServiceServer.entities.dictionary;

import com.gawlas.CarServiceServer.entities.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "dict_info")
public class DictInfo extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "dict_key")
    private String dictKey;
    @Column(name = "dict_name")
    private String dictName;
    @Column(name = "dict_description")
    private String dictDescription;

    public DictInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictDescription() {
        return dictDescription;
    }

    public void setDictDescription(String dictDescription) {
        this.dictDescription = dictDescription;
    }
}
