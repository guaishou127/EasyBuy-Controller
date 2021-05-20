package com.ykl.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * easybuy_product_category
 * @author 
 */
@Entity
@Table(name="easybuy_product_category")
public class EasybuyProductCategory implements Serializable {
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
     * 父级目录id
     */
    @NotEmpty
    private Integer parentid;

    /**
     * 级别(1:一级 2：二级 3：三级)
     */
    private Integer type;

    /**
     * 图标
     */
    private String iconclass;

    @Transient
    private List<EasybuyProductCategory>zilei;
    @Transient
    private List<EasybuyProduct>lian;

    public List<EasybuyProduct> getLian() {
        return lian;
    }

    public void setLian(List<EasybuyProduct> lian) {
        this.lian = lian;
    }

    public List<EasybuyProductCategory> getZilei() {
        return zilei;
    }

    public void setZilei(List<EasybuyProductCategory> zilei) {
        this.zilei = zilei;
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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIconclass() {
        return iconclass;
    }

    public void setIconclass(String iconclass) {
        this.iconclass = iconclass;
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
        EasybuyProductCategory other = (EasybuyProductCategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getIconclass() == null ? other.getIconclass() == null : this.getIconclass().equals(other.getIconclass()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getIconclass() == null) ? 0 : getIconclass().hashCode());
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
        sb.append(", parentid=").append(parentid);
        sb.append(", type=").append(type);
        sb.append(", iconclass=").append(iconclass);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}