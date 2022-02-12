package com.gawlas.CarServiceServer.entities;

import com.gawlas.CarServiceServer.dao.constants.ItemState;
import com.gawlas.CarServiceServer.entities.dictionary.DictItem;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "service_item")
public class ServiceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "item", length = 200)
    private String item;
    @Column(name = "item_brand", length = 200)
    private String itemBrand;
    @Column(name = "item_no", length = 200)
    private String itemNo;
    @Column(name = "item_guarantee")
    private Date itemGuarantee;
    @Column(name = "item_state", length = 4)
    @Enumerated(EnumType.STRING)
    private ItemState itemState;
    @Column(name = "item_position")
    private String itemPosition;
    @Formula("SELECT * FROM dict_item di WHERE di.code = item_position")
    private DictItem diItemPosition;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "service_history_id", referencedColumnName="id", nullable = false)
    private ServiceHistory serviceHistory;

    public ServiceItem() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public Date getItemGuarantee() {
        return itemGuarantee;
    }

    public void setItemGuarantee(Date itemGuarantee) {
        this.itemGuarantee = itemGuarantee;
    }

    public ItemState getItemState() {
        return itemState;
    }

    public void setItemState(ItemState itemState) {
        this.itemState = itemState;
    }

    public String getItemPosition() {
        return itemPosition;
    }

    public void setItemPosition(String itemPosition) {
        this.itemPosition = itemPosition;
    }

    public DictItem getDiItemPosition() {
        return diItemPosition;
    }

    public void setDiItemPosition(DictItem diItemPosition) {
        this.diItemPosition = diItemPosition;
    }
}
