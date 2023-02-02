package com.xadmin.SpringBootCrud.controller;

import com.xadmin.SpringBootCrud.entity.Wfod;
import com.xadmin.SpringBootCrud.service.WFOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WFOController {
    @Autowired
    private WFOService WfoService;
    @RequestMapping("/data")
    public List<Wfod> getAllWFOdata()
    {
        return WfoService.getAllWfod();
    }

    @RequestMapping(method = RequestMethod.POST, value="/data")
    public void addWfod(@RequestBody Wfod wfod)
    {
        WfoService.addWfod(wfod);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/data/{id}")
    public void updateSubject(@PathVariable String id, @RequestBody Wfod wfod)
    {
        WfoService.updateWfod(id, wfod);
    }
}
