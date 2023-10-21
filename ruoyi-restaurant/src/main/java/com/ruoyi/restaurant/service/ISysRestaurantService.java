package com.ruoyi.restaurant.service;

import java.util.List;
import com.ruoyi.restaurant.domain.SysRestaurant;

/**
 * 餐厅信息Service接口
 * 
 * @author ww
 * @date 2023-10-21
 */
public interface ISysRestaurantService 
{
    /**
     * 查询餐厅信息
     * 
     * @param restaurantId 餐厅信息主键
     * @return 餐厅信息
     */
    public SysRestaurant selectSysRestaurantByRestaurantId(Long restaurantId);

    /**
     * 查询餐厅信息列表
     * 
     * @param sysRestaurant 餐厅信息
     * @return 餐厅信息集合
     */
    public List<SysRestaurant> selectSysRestaurantList(SysRestaurant sysRestaurant);

    /**
     * 新增餐厅信息
     * 
     * @param sysRestaurant 餐厅信息
     * @return 结果
     */
    public int insertSysRestaurant(SysRestaurant sysRestaurant);

    /**
     * 修改餐厅信息
     * 
     * @param sysRestaurant 餐厅信息
     * @return 结果
     */
    public int updateSysRestaurant(SysRestaurant sysRestaurant);

    /**
     * 批量删除餐厅信息
     * 
     * @param restaurantIds 需要删除的餐厅信息主键集合
     * @return 结果
     */
    public int deleteSysRestaurantByRestaurantIds(Long[] restaurantIds);

    /**
     * 删除餐厅信息信息
     * 
     * @param restaurantId 餐厅信息主键
     * @return 结果
     */
    public int deleteSysRestaurantByRestaurantId(Long restaurantId);
}
