package com.shamim.Service;

import com.shamim.Dao.DonorDao;
import com.shamim.Entity.Donor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DonorService {

    @Autowired
    private DonorDao donorDao;

    public Collection<Donor> getAllDonors() {
        return donorDao.getAllDonors();
    }

    public Donor getDonorById(int id) {
        return this.donorDao.getDonorById(id);
    }


    public Collection<Donor> getDonorByGroupAndLocation(String group, String location) {

        return this.donorDao.getDonorByGroupAndLocation(group, location);

    }


    public void deleteDonorById(int id) {
        this.donorDao.removeDonorById(id);
    }

    public void addDonor(Donor donor) {
        this.donorDao.addDonor(donor);
    }
}
