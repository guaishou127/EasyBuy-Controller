package com.ykl.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * easybuy_product
 * @author 
 */
@Entity
@Table(name="easybuy_product")
public class EasybuyProduct implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 名称
     */
    @NotEmpty
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 价格
     */
    @NotEmpty
    private Float price;

    /**
     * 库存
     */
    @NotEmpty
    private Integer stock;

    /**
     * 分类1
     */
    private Integer categorylevel1id;

    /**
     * 分类2
     */
    private Integer categorylevel2id;

    /**
     * 分类3
     */
    private Integer categorylevel3id;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * 是否删除(1：删除 0：未删除)
     */
    private Integer isdelete;

    @Transient
    private List<EasybuyProductCategory> zi;

    public List<EasybuyProductCategory> getZi() {
        return zi;
    }

    public void setZi(List<EasybuyProductCategory> zi) {
        this.zi = zi;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategorylevel1id() {
        return categorylevel1id;
    }

    public void setCategorylevel1id(Integer categorylevel1id) {
        this.categorylevel1id = categorylevel1id;
    }

    public Integer getCategorylevel2id() {
        return categorylevel2id;
    }

    public void setCategorylevel2id(Integer categorylevel2id) {
        this.categorylevel2id = categorylevel2id;
    }

    public Integer getCategorylevel3id() {
        return categorylevel3id;
    }

    public void setCategorylevel3id(Integer categorylevel3id) {
        this.categorylevel3id = categorylevel3id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        EasybuyProduct other = (EasybuyProduct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getCategorylevel1id() == null ? other.getCategorylevel1id() == null : this.getCategorylevel1id().equals(other.getCategorylevel1id()))
            && (this.getCategorylevel2id() == null ? other.getCategorylevel2id() == null : this.getCategorylevel2id().equals(other.getCategorylevel2id()))
            && (this.getCategorylevel3id() == null ? other.getCategorylevel3id() == null : this.getCategorylevel3id().equals(other.getCategorylevel3id()))
            && (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()))
            && (this.getIsdelete() == null ? other.getIsdelete() == null : this.getIsdelete().equals(other.getIsdelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getCategorylevel1id() == null) ? 0 : getCategorylevel1id().hashCode());
        result = prime * result + ((getCategorylevel2id() == null) ? 0 : getCategorylevel2id().hashCode());
        result = prime * result + ((getCategorylevel3id() == null) ? 0 : getCategorylevel3id().hashCode());
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
        result = prime * result + ((getIsdelete() == null) ? 0 : getIsdelete().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", categorylevel1id=").append(categorylevel1id);
        sb.append(", categorylevel2id=").append(categorylevel2id);
        sb.append(", categorylevel3id=").append(categorylevel3id);
        sb.append(", filename=").append(filename);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}