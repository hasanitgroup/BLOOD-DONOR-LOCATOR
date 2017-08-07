package com.shamim.Controller;

import com.shamim.Entity.Donor;
import com.shamim.Service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/donors")

public class DonorController {

    private DonorService donorService;

    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @RequestMapping(method = RequestMethod.GET)

    public Collection<Donor> getAllDonors() {
        return donorService.getAllDonors();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)

    public Donor getDonorById(@PathVariable("id") int id) {
        return donorService.getDonorById(id);
    }

    @RequestMapping(value = "/search/{group}/{location}", method = RequestMethod.GET)

    public Collection<Donor> getDonorByGroupAndLocation(@PathVariable("group") String group, @PathVariable("location") String location) {
        if(group.equals("all")) group = "";
        if(location.equals("all")) location = "";
        return donorService.getDonorByGroupAndLocation(group, location);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)

    public void deleteDonorById(@PathVariable("id") int id) {
        donorService.deleteDonorById(id);
    }

    @RequestMapping(value="/add" , method = RequestMethod.PUT , consumes = MediaType.APPLICATION_JSON_VALUE)

    public void addDonor(@RequestBody Donor donor) {
        donorService.addDonor(donor);
    }
}
