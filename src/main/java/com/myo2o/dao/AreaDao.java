package com.myo2o.dao;

import java.util.List;

import com.myo2o.entity.Area;
import com.myo2o.entity.Area;

public interface AreaDao {
	/**
	 * 列出地域列表
	 * 
	 * @param
	 * @return
	 */
	List<Area> queryArea();

	/**
	 * 
	 * @param area
	 * @return
	 */
	int insertArea(Area area);

	/**
	 * 
	 * @param area
	 * @return
	 */
	int updateArea(Area area);

	/**
	 * 
	 * @param areaId
	 * @return
	 */
	int deleteArea(long areaId);

	/**
	 * 
	 * @param areaIdList
	 * @return
	 */
	int batchDeleteArea(List<Long> areaIdList);
}
