package com.ruoyi.item.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * item对象 item
 * 
 * @author group14
 * @date 2023-10-23
 */
public class Item extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** item id */
    @Excel(name = "item id")
    private Long itemId;

    /** restaurant id */
    @Excel(name = "restaurant id")
    private Long restaurantId;

    /** item picture */
    @Excel(name = "item picture")
    private String itemPic;

    /** item name */
    @Excel(name = "item name")
    private String itemName;

    /** order number */
    @Excel(name = "order number")
    private Integer orderNum;

    /** item status (0 is on sale 1 is sold out.) */
    @Excel(name = "item status (0 is on sale 1 is sold out.)")
    private String status;

    public void setItemId(Long itemId) 
    {
        this.itemId = itemId;
    }

    public Long getItemId() 
    {
        return itemId;
    }
    public void setRestaurantId(Long restaurantId) 
    {
        this.restaurantId = restaurantId;
    }

    public Long getRestaurantId() 
    {
        return restaurantId;
    }
    public void setItemPic(String itemPic) 
    {
        this.itemPic = itemPic;
    }

    public String getItemPic() 
    {
        return itemPic;
    }
    public void setItemName(String itemName) 
    {
        this.itemName = itemName;
    }

    public String getItemName() 
    {
        return itemName;
    }
    public void setOrderNum(Integer orderNum) 
    {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum() 
    {
        return orderNum;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("itemId", getItemId())
            .append("restaurantId", getRestaurantId())
            .append("itemPic", getItemPic())
            .append("itemName", getItemName())
            .append("orderNum", getOrderNum())
            .append("status", getStatus())
            .toString();
    }
}
