package com.ruoyi.restaurant.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.restaurant.domain.Restaurant;
import com.ruoyi.restaurant.service.IRestaurantService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * restaurantController
 * 
 * @author group14
 * @date 2023-10-23
 */
@RestController
@RequestMapping("/restaurant/restaurant")
public class RestaurantController extends BaseController
{
    @Autowired
    private IRestaurantService restaurantService;

    /**
     * 查询restaurant列表
     */
    @PreAuthorize("@ss.hasPermi('restaurant:restaurant:list')")
    @GetMapping("/list")
    public TableDataInfo list(Restaurant restaurant)
    {
        startPage();
        List<Restaurant> list = restaurantService.selectRestaurantList(restaurant);
        return getDataTable(list);
    }

    /**
     * 导出restaurant列表
     */
    @PreAuthorize("@ss.hasPermi('restaurant:restaurant:export')")
    @Log(title = "restaurant", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Restaurant restaurant)
    {
        List<Restaurant> list = restaurantService.selectRestaurantList(restaurant);
        ExcelUtil<Restaurant> util = new ExcelUtil<Restaurant>(Restaurant.class);
        util.exportExcel(response, list, "restaurant数据");
    }

    /**
     * 获取restaurant详细信息
     */
    @PreAuthorize("@ss.hasPermi('restaurant:restaurant:query')")
    @GetMapping(value = "/{restaurantId}")
    public AjaxResult getInfo(@PathVariable("restaurantId") Long restaurantId)
    {
        return success(restaurantService.selectRestaurantByRestaurantId(restaurantId));
    }

    /**
     * 新增restaurant
     */
    @PreAuthorize("@ss.hasPermi('restaurant:restaurant:add')")
    @Log(title = "restaurant", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Restaurant restaurant)
    {
        return toAjax(restaurantService.insertRestaurant(restaurant));
    }

    /**
     * 修改restaurant
     */
    @PreAuthorize("@ss.hasPermi('restaurant:restaurant:edit')")
    @Log(title = "restaurant", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Restaurant restaurant)
    {
        return toAjax(restaurantService.updateRestaurant(restaurant));
    }

    /**
     * 删除restaurant
     */
    @PreAuthorize("@ss.hasPermi('restaurant:restaurant:remove')")
    @Log(title = "restaurant", businessType = BusinessType.DELETE)
	@DeleteMapping("/{restaurantIds}")
    public AjaxResult remove(@PathVariable Long[] restaurantIds)
    {
        return toAjax(restaurantService.deleteRestaurantByRestaurantIds(restaurantIds));
    }
}
