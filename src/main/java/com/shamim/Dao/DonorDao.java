package com.shamim.Dao;

import com.shamim.Entity.Donor;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DonorDao {

    private static Map<Integer, Donor> Donors;

    private static int index = 1;

    static {


        Donors = new HashMap<Integer, Donor>() {

            {
                put(index, new Donor(index++, "Arif Azad", "Kazla, Rajshahi", "A+", "rajshahi", "0182293939393", true));
                put(index, new Donor(index++, "Mizan Ahmed", "Talaimari, Rajshahi", "A-", "rajshahi", "0182293939393", true));
                put(index, new Donor(index++, "Nazrul Islam", "Sopura, Rajshahi", "B+", "rajshahi", "0182293939393", true));
                put(index, new Donor(index++, "Salman Hossain", "SagorPara, Rajshahi", "B-", "rajshahi", "0182293939393", true));
                put(index, new Donor(index++, "Badsha Hossain", "Zero Point, Rajshahi", "AB+", "rajshahi", "0182293939393", true));
                put(index, new Donor(index++, "Fm Azad", "Kadirgong, Rajshahi", "AB-", "rajshahi", "0182293939393", true));
                put(index, new Donor(index++, "Mustofa Kamal", "New Market, Rajshahi", "O+", "rajshahi", "0182292919323", true));
                put(index, new Donor(index++, "Nuruzzaman", "Court Station, Rajshahi", "O-", "rajshahi", "0182292919323", true));
				
                put(index, new Donor(index++, "Iftikar Jahan", "Uttara , Dhaka: ", "A+", "dhaka", "0172313134353", true));
                put(index, new Donor(index++, "Abdul Rashid", "Gulshan, Dhaka: ", "A-", "dhaka", "0172313134353", true));
                put(index, new Donor(index++, "Faisal Kabir", "Panthapath, Dhaka: ", "B+", "dhaka", "0172313134353", true));
                put(index, new Donor(index++, "Sohel Rana", "Dhanmondi, Dhaka: ", "B-", "dhaka", "0172313134353", true));
                put(index, new Donor(index++, "Imran Azad", "New Elephant Road, Dhaka: ", "AB+", "dhaka", "0172313134353", true));
                put(index, new Donor(index++, "Onkur Rahman", "Dilkusha, Dhaka: ", "AB-", "dhaka", "0172313134353", true));
                put(index, new Donor(index++, "Sourav Kumar", "Mirpur-10, Dhaka: ", "AB+", "dhaka", "0172313134353", true));
                put(index, new Donor(index++, "Biton Kumar Das", "Mirpur-2, Dhaka: ", "O+", "dhaka", "0172313134353", true));
                put(index, new Donor(index++, "Joty Mumur", "Mirpur-5, Dhaka: ", "O-", "dhaka", "0172313134353", true));
            }


        };


    }


    public Collection<Donor> getAllDonors() {
        return Donors.values();
    }

    public Donor getDonorById(int id) {
        return Donors.get(id);
    }

    public void removeDonorById(int id) {
        Donors.remove(id);
    }

    public Collection<Donor> getDonorByGroupAndLocation(String group, String location) {


        if (group.isEmpty() && location.isEmpty()) {

            return getAllDonors();
        }

        Map<Integer, Donor> resultSet = new HashMap<Integer, Donor>();
        int index = 0;
        // alt. #2
        if (group.isEmpty()) {


            for (Map.Entry<Integer, Donor> entry : Donors.entrySet()) {

                Donor value = entry.getValue();
                if (value.getLocation().equals(location)) {
                    resultSet.put(index++, value);
                }

                // use key and value
            }
            return resultSet.values();
        }


        if (location.isEmpty()) {

            // alt. #2
            for (Map.Entry<Integer, Donor> entry : Donors.entrySet()) {

                Donor value = entry.getValue();
                if (value.getBloodGroup().equals(group)) {
                    resultSet.put(index++, value);
                }

                // use key and value
            }

            return resultSet.values();
        }


        for (Map.Entry<Integer, Donor> entry : Donors.entrySet()) {

            Donor value = entry.getValue();
            if (value.getBloodGroup().equals(group) && value.getLocation().equals(location)) {
                resultSet.put(index++, value);
            }

            // use key and value
        }

        return resultSet.values();


    }


    public void addDonor(Donor donor) {
        donor.setDonorId(index++);
        Donors.put(index, donor);
    }


}
