package com.ruoyi.restaurant.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.restaurant.mapper.RestaurantMapper;
import com.ruoyi.restaurant.domain.Restaurant;
import com.ruoyi.restaurant.service.IRestaurantService;

/**
 * restaurantService业务层处理
 * 
 * @author group14
 * @date 2023-10-23
 */
@Service
public class RestaurantServiceImpl implements IRestaurantService 
{
    @Autowired
    private RestaurantMapper restaurantMapper;

    /**
     * 查询restaurant
     * 
     * @param restaurantId restaurant主键
     * @return restaurant
     */
    @Override
    public Restaurant selectRestaurantByRestaurantId(Long restaurantId)
    {
        return restaurantMapper.selectRestaurantByRestaurantId(restaurantId);
    }

    /**
     * 查询restaurant列表
     * 
     * @param restaurant restaurant
     * @return restaurant
     */
    @Override
    public List<Restaurant> selectRestaurantList(Restaurant restaurant)
    {
        return restaurantMapper.selectRestaurantList(restaurant);
    }

    /**
     * 新增restaurant
     * 
     * @param restaurant restaurant
     * @return 结果
     */
    @Override
    public int insertRestaurant(Restaurant restaurant)
    {
        return restaurantMapper.insertRestaurant(restaurant);
    }

    /**
     * 修改restaurant
     * 
     * @param restaurant restaurant
     * @return 结果
     */
    @Override
    public int updateRestaurant(Restaurant restaurant)
    {
        return restaurantMapper.updateRestaurant(restaurant);
    }

    /**
     * 批量删除restaurant
     * 
     * @param restaurantIds 需要删除的restaurant主键
     * @return 结果
     */
    @Override
    public int deleteRestaurantByRestaurantIds(Long[] restaurantIds)
    {
        return restaurantMapper.deleteRestaurantByRestaurantIds(restaurantIds);
    }

    /**
     * 删除restaurant信息
     * 
     * @param restaurantId restaurant主键
     * @return 结果
     */
    @Override
    public int deleteRestaurantByRestaurantId(Long restaurantId)
    {
        return restaurantMapper.deleteRestaurantByRestaurantId(restaurantId);
    }
}
