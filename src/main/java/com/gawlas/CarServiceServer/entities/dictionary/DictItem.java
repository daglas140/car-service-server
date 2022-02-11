package com.gawlas.CarServiceServer.entities.dictionary;

import com.gawlas.CarServiceServer.entities.base.BaseEntity;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "dict_item")
public class DictItem extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    @Column(name = "code")
    private String code;
    @NotNull
    @Column(name = "name")
    private String name;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "dict_info_key", referencedColumnName="dict_key", nullable = false)
    private DictInfo dictInfo;

    public DictItem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DictInfo getDictInfo() {
        return dictInfo;
    }

    public void setDictInfo(DictInfo dictInfo) {
        this.dictInfo = dictInfo;
    }
}
