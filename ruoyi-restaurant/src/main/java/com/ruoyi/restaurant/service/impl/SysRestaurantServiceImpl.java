package com.ruoyi.restaurant.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.restaurant.mapper.SysRestaurantMapper;
import com.ruoyi.restaurant.domain.SysRestaurant;
import com.ruoyi.restaurant.service.ISysRestaurantService;

/**
 * 餐厅信息Service业务层处理
 * 
 * @author ww
 * @date 2023-10-21
 */
@Service
public class SysRestaurantServiceImpl implements ISysRestaurantService 
{
    @Autowired
    private SysRestaurantMapper sysRestaurantMapper;

    /**
     * 查询餐厅信息
     * 
     * @param restaurantId 餐厅信息主键
     * @return 餐厅信息
     */
    @Override
    public SysRestaurant selectSysRestaurantByRestaurantId(Long restaurantId)
    {
        return sysRestaurantMapper.selectSysRestaurantByRestaurantId(restaurantId);
    }

    /**
     * 查询餐厅信息列表
     * 
     * @param sysRestaurant 餐厅信息
     * @return 餐厅信息
     */
    @Override
    public List<SysRestaurant> selectSysRestaurantList(SysRestaurant sysRestaurant)
    {
        return sysRestaurantMapper.selectSysRestaurantList(sysRestaurant);
    }

    /**
     * 新增餐厅信息
     * 
     * @param sysRestaurant 餐厅信息
     * @return 结果
     */
    @Override
    public int insertSysRestaurant(SysRestaurant sysRestaurant)
    {
        sysRestaurant.setCreateTime(DateUtils.getNowDate());
        return sysRestaurantMapper.insertSysRestaurant(sysRestaurant);
    }

    /**
     * 修改餐厅信息
     * 
     * @param sysRestaurant 餐厅信息
     * @return 结果
     */
    @Override
    public int updateSysRestaurant(SysRestaurant sysRestaurant)
    {
        sysRestaurant.setUpdateTime(DateUtils.getNowDate());
        return sysRestaurantMapper.updateSysRestaurant(sysRestaurant);
    }

    /**
     * 批量删除餐厅信息
     * 
     * @param restaurantIds 需要删除的餐厅信息主键
     * @return 结果
     */
    @Override
    public int deleteSysRestaurantByRestaurantIds(Long[] restaurantIds)
    {
        return sysRestaurantMapper.deleteSysRestaurantByRestaurantIds(restaurantIds);
    }

    /**
     * 删除餐厅信息信息
     * 
     * @param restaurantId 餐厅信息主键
     * @return 结果
     */
    @Override
    public int deleteSysRestaurantByRestaurantId(Long restaurantId)
    {
        return sysRestaurantMapper.deleteSysRestaurantByRestaurantId(restaurantId);
    }
}
