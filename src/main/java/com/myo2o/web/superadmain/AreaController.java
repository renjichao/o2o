package com.myo2o.web.superadmain;

import com.myo2o.entity.Area;
import com.myo2o.service.AreaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("/superadmain")
public class AreaController {


@Autowired
private AreaService areaService;
    @RequestMapping(value = "/listArea",method = RequestMethod.GET)
    @ResponseBody

    private Map<String,Object> listArea(){

        Map<String,Object>modelMap=new HashMap<String,Object>();
        List<Area>list=new ArrayList<Area>();
        try{
        list=areaService.getAreaList();
        modelMap.put("rows",list);
        modelMap.put("total",list.size());





        }catch (Exception e){
            e.printStackTrace();
            modelMap.put("success",false);
            modelMap.put("errMsg",e.toString());



        }

        return modelMap;




    }


}
