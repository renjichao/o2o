package com.myo2o.service;

import com.myo2o.BaseTest;
import com.myo2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList() throws IOException {

        List<Area>areaList=areaService.getAreaList();
        assertEquals("西苑",areaList.get(0).getAreaNme());





    }



}
