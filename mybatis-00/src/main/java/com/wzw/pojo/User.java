package com.wzw.pojo;

import java.util.List;

public class User {
    private int uid;
    private String type;
    private String identifier;
    private String id_type;
    private String user_name;
    private String driver_license_id;
    private String state;
    private String FICO;
    private String reg_type;
    private String insuranceID;
    private String contract_valid_date;
    private String contract_type;
    private String contract_status;
    private String account;
    private String password;
    private String travel_distance;
    private String reg_area;
    private boolean isBanned;

    public User() {
    }

    public User(String type, String identifier, String id_type, String user_name, String driver_license_id, String state, String FICO,
                String reg_type, String insuranceID, String contract_valid_date, String contract_type, String contract_status, String account,
                String password, String travel_distance, String reg_area, boolean isBanned) {
        this.uid = (int)(Math.random() * 1000000);
        this.type = type;
        this.identifier = identifier;
        this.id_type = id_type;
        this.user_name = user_name;
        this.driver_license_id = driver_license_id;
        this.state = state;
        this.FICO = FICO;
        this.reg_type = reg_type;
        this.insuranceID = insuranceID;
        this.contract_valid_date = contract_valid_date;
        this.contract_type = contract_type;
        this.contract_status = contract_status;
        this.account = account;
        this.password = password;
        this.travel_distance = travel_distance;
        this.reg_area = reg_area;
        this.isBanned = isBanned;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getId_type() {
        return id_type;
    }

    public void setId_type(String id_type) {
        this.id_type = id_type;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDriver_license_id() {
        return driver_license_id;
    }

    public void setDriver_license_id(String driver_license_id) {
        this.driver_license_id = driver_license_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFICO() {
        return FICO;
    }

    public void setFICO(String FICO) {
        this.FICO = FICO;
    }

    public String getReg_type() {
        return reg_type;
    }

    public void setReg_type(String reg_type) {
        this.reg_type = reg_type;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getContract_valid_date() {
        return contract_valid_date;
    }

    public void setContract_valid_date(String contract_valid_date) {
        this.contract_valid_date = contract_valid_date;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public String getContract_status() {
        return contract_status;
    }

    public void setContract_status(String contract_status) {
        this.contract_status = contract_status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTravel_distance() {
        return travel_distance;
    }

    public void setTravel_distance(String travel_distance) {
        this.travel_distance = travel_distance;
    }

    public String getReg_area() {
        return reg_area;
    }

    public void setReg_area(String reg_area) {
        this.reg_area = reg_area;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", type='" + type + '\'' +
                ", identifier='" + identifier + '\'' +
                ", id_type='" + id_type + '\'' +
                ", user_name='" + user_name + '\'' +
                ", driver_license_id='" + driver_license_id + '\'' +
                ", state='" + state + '\'' +
                ", FICO='" + FICO + '\'' +
                ", reg_type='" + reg_type + '\'' +
                ", insuranceID='" + insuranceID + '\'' +
                ", contract_valid_date='" + contract_valid_date + '\'' +
                ", contract_type='" + contract_type + '\'' +
                ", contract_status='" + contract_status + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", travel_distance='" + travel_distance + '\'' +
                ", reg_area='" + reg_area + '\'' +
                ", isBanned=" + isBanned +
                '}';
    }
}
