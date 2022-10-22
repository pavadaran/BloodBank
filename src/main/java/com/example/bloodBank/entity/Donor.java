package com.example.bloodBank.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name="donor")
@Entity
public class Donor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "donor_id")
    private Integer donor_id;

    @Column(name = "NIC")
    private String NIC;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "gender")
    private Character gender;

    @Column(name = "address")
    private String address;

    @Column(name = "district")
    private String district;

    @Column(name = "telephone_number")
    private String telephone_number;

    @Column(name = "blood_group")
    private String blood_group;

    @Column(name = "last_donation_date")
    private Date last_donation_date;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "hemoglobin_level")
    private Float hemoglobin_level;

    public Donor(Integer donor_id, String NIC, String name, Date dob, Character gender, String address, String district, String telephone_number, String blood_group, Date last_donation_date, Float weight, Float hemoglobin_level) {
        this.donor_id = donor_id;
        this.NIC = NIC;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        this.district = district;
        this.telephone_number = telephone_number;
        this.blood_group = blood_group;
        this.last_donation_date = last_donation_date;
        this.weight = weight;
        this.hemoglobin_level = hemoglobin_level;
    }

    public Donor(){ }

    public Integer getDonor_id() {
        return donor_id;
    }

    public String getNIC() {
        return NIC;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public Character getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public Date getLast_donation_date() {
        return last_donation_date;
    }

    public Float getWeight() {
        return weight;
    }

    public Float getHemoglobin_level() {
        return hemoglobin_level;
    }

    public void setDonor_id(Integer donor_id) {
        this.donor_id = donor_id;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public void setLast_donation_date(Date last_donation_date) {
        this.last_donation_date = last_donation_date;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setHemoglobin_level(Float hemoglobin_level) {
        this.hemoglobin_level = hemoglobin_level;
    }
}
