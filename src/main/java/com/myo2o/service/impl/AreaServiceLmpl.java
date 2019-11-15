package com.myo2o.service.impl;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.myo2o.dao.AreaDao;
import com.myo2o.dto.AreaExecution;
import com.myo2o.entity.Area;
import com.myo2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public class AreaServiceLmpl implements AreaService {
@Autowired
private AreaDao areaDao;


    @Override
    public List<Area> getAreaList() throws JsonParseException, JsonMappingException, IOException {
        return null;
    }

    @Override
    public AreaExecution addArea(Area area) {
        return null;
    }

    @Override
    public AreaExecution modifyArea(Area area) {
        return null;
    }

    @Override
    public AreaExecution removeArea(long areaId) {
        return null;
    }

    @Override
    public AreaExecution removeAreaList(List<Long> areaIdList) {
        return null;
    }
}
