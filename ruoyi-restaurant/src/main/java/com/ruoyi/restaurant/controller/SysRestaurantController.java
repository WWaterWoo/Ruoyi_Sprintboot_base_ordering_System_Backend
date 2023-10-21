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
import com.ruoyi.restaurant.domain.SysRestaurant;
import com.ruoyi.restaurant.service.ISysRestaurantService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 餐厅信息Controller
 * 
 * @author ww
 * @date 2023-10-21
 */
@RestController
@RequestMapping("/ruoyi-restaurant/restaurant")
public class SysRestaurantController extends BaseController
{
    @Autowired
    private ISysRestaurantService sysRestaurantService;

    /**
     * 查询餐厅信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-restaurant:restaurant:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysRestaurant sysRestaurant)
    {
        startPage();
        List<SysRestaurant> list = sysRestaurantService.selectSysRestaurantList(sysRestaurant);
        return getDataTable(list);
    }

    /**
     * 导出餐厅信息列表
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-restaurant:restaurant:export')")
    @Log(title = "餐厅信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysRestaurant sysRestaurant)
    {
        List<SysRestaurant> list = sysRestaurantService.selectSysRestaurantList(sysRestaurant);
        ExcelUtil<SysRestaurant> util = new ExcelUtil<SysRestaurant>(SysRestaurant.class);
        util.exportExcel(response, list, "餐厅信息数据");
    }

    /**
     * 获取餐厅信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-restaurant:restaurant:query')")
    @GetMapping(value = "/{restaurantId}")
    public AjaxResult getInfo(@PathVariable("restaurantId") Long restaurantId)
    {
        return success(sysRestaurantService.selectSysRestaurantByRestaurantId(restaurantId));
    }

    /**
     * 新增餐厅信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-restaurant:restaurant:add')")
    @Log(title = "餐厅信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysRestaurant sysRestaurant)
    {
        return toAjax(sysRestaurantService.insertSysRestaurant(sysRestaurant));
    }

    /**
     * 修改餐厅信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-restaurant:restaurant:edit')")
    @Log(title = "餐厅信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysRestaurant sysRestaurant)
    {
        return toAjax(sysRestaurantService.updateSysRestaurant(sysRestaurant));
    }

    /**
     * 删除餐厅信息
     */
    @PreAuthorize("@ss.hasPermi('ruoyi-restaurant:restaurant:remove')")
    @Log(title = "餐厅信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{restaurantIds}")
    public AjaxResult remove(@PathVariable Long[] restaurantIds)
    {
        return toAjax(sysRestaurantService.deleteSysRestaurantByRestaurantIds(restaurantIds));
    }
}
