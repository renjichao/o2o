package com.myo2o.service;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.myo2o.dto.AreaExecution;
import com.myo2o.entity.Area;
import com.myo2o.dto.AreaExecution;
import com.myo2o.entity.Area;

public interface AreaService {
	/**
	 * 
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	List<Area> getAreaList() throws JsonParseException, JsonMappingException,
			IOException;

	/**
	 * 
	 * @param area
	 * @return
	 */
	AreaExecution addArea(Area area);

	/**
	 * 
	 * @param area
	 * @return
	 */
	AreaExecution modifyArea(Area area);

	/**
	 * 
	 * @param areaId
	 * @return
	 */
	AreaExecution removeArea(long areaId);

	/**
	 * 
	 * @param areaIdList
	 * @return
	 */
	AreaExecution removeAreaList(List<Long> areaIdList);

}
