package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.DishFlavor;
import com.sky.vo.DishVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
    /**
     * 根据菜品id删除口味
     */
    @Delete("delete from dish_flavor where dish_id =#{dishId}")
void deleteByDishId(Long dishId);


    //根据菜品Id查询对应口味
    @Select("select * from dish_flavor where dish_id =#{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
