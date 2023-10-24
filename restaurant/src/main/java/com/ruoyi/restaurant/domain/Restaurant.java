package com.ruoyi.restaurant.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * restaurant对象 restaurant
 * 
 * @author group14
 * @date 2023-10-23
 */
public class Restaurant extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** restaurant id */
    private Long restaurantId;

    /** food type */
    @Excel(name = "food type")
    private String foodType;

    /** restaurant picture */
    @Excel(name = "restaurant picture")
    private String restaurantPic;

    /** restaurant name */
    @Excel(name = "restaurant name")
    private String restaurantName;

    /** order number */
    @Excel(name = "order number")
    private Integer orderNum;

    /** contact */
    @Excel(name = "contact")
    private String contact;

    /** restaurant status (0 is open 1 is closed.) */
    @Excel(name = "restaurant status (0 is open 1 is closed.)")
    private String status;

    public void setRestaurantId(Long restaurantId) 
    {
        this.restaurantId = restaurantId;
    }

    public Long getRestaurantId() 
    {
        return restaurantId;
    }
    public void setFoodType(String foodType) 
    {
        this.foodType = foodType;
    }

    public String getFoodType() 
    {
        return foodType;
    }
    public void setRestaurantPic(String restaurantPic) 
    {
        this.restaurantPic = restaurantPic;
    }

    public String getRestaurantPic() 
    {
        return restaurantPic;
    }
    public void setRestaurantName(String restaurantName) 
    {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName() 
    {
        return restaurantName;
    }
    public void setOrderNum(Integer orderNum) 
    {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum() 
    {
        return orderNum;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
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
            .append("restaurantId", getRestaurantId())
            .append("foodType", getFoodType())
            .append("restaurantPic", getRestaurantPic())
            .append("restaurantName", getRestaurantName())
            .append("orderNum", getOrderNum())
            .append("contact", getContact())
            .append("status", getStatus())
            .toString();
    }
}
