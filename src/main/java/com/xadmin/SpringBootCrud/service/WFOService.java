package com.xadmin.SpringBootCrud.service;

import com.xadmin.SpringBootCrud.entity.Wfod;
import com.xadmin.SpringBootCrud.repository.WFOReository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class WFOService {
    @Autowired
    public WFOReository wfoRepo;

    public List<Wfod> getAllWfod()
    {
        List<Wfod> wfod = new ArrayList<>();

        wfoRepo.findAll().forEach(wfod::add);
        return wfod;
    }

    public Wfod addWfod(Wfod wfod) {
        return wfoRepo.save(wfod);
    }

    public void updateWfod(String id, Wfod wfod) {
        wfoRepo.save(wfod);

    }
}
