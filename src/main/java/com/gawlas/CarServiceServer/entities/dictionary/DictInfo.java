package com.gawlas.CarServiceServer.entities.dictionary;

import com.gawlas.CarServiceServer.entities.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "dict_info")
public class DictInfo extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "dict_key")
    private String dictKey;
    @Column(name = "dict_name")
    private String dictName;
    /**
        Describe type of dictionary USER or SYSTEM
     */
    @Column(name = "dict_type", length = 5)
    private String dictType;
    @Column(name = "dict_description")
    private String dictDescription;

    public DictInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictDescription() {
        return dictDescription;
    }

    public void setDictDescription(String dictDescription) {
        this.dictDescription = dictDescription;
    }
}
