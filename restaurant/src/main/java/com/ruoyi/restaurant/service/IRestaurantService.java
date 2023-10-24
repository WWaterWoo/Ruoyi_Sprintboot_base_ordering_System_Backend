package com.ruoyi.restaurant.service;

import java.util.List;
import com.ruoyi.restaurant.domain.Restaurant;

/**
 * restaurantService接口
 * 
 * @author group14
 * @date 2023-10-23
 */
public interface IRestaurantService 
{
    /**
     * 查询restaurant
     * 
     * @param restaurantId restaurant主键
     * @return restaurant
     */
    public Restaurant selectRestaurantByRestaurantId(Long restaurantId);

    /**
     * 查询restaurant列表
     * 
     * @param restaurant restaurant
     * @return restaurant集合
     */
    public List<Restaurant> selectRestaurantList(Restaurant restaurant);

    /**
     * 新增restaurant
     * 
     * @param restaurant restaurant
     * @return 结果
     */
    public int insertRestaurant(Restaurant restaurant);

    /**
     * 修改restaurant
     * 
     * @param restaurant restaurant
     * @return 结果
     */
    public int updateRestaurant(Restaurant restaurant);

    /**
     * 批量删除restaurant
     * 
     * @param restaurantIds 需要删除的restaurant主键集合
     * @return 结果
     */
    public int deleteRestaurantByRestaurantIds(Long[] restaurantIds);

    /**
     * 删除restaurant信息
     * 
     * @param restaurantId restaurant主键
     * @return 结果
     */
    public int deleteRestaurantByRestaurantId(Long restaurantId);
}
