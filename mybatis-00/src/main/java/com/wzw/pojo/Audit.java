package com.wzw.pojo;

public class Audit {
    private int aid;
    private int driver_id;
    private String settlement_date;
    private float basic_salary;
    private float travel_salary;
    private float complaint_penalty;
    private float other_penalty;
    private float insurance_payment;
    private float tax_payment;
    private float summary;
    private String settlement_status;

    public Audit() {
    }

    public Audit(int driver_id, String settlement_date, float basic_salary, float travel_salary, float complaint_penalty, float other_penalty, float insurance_payment, float tax_payment, float summary, String settlement_status) {
        this.aid = (int)(Math.random() * 1000000);
        this.driver_id = driver_id;
        this.settlement_date = settlement_date;
        this.basic_salary = basic_salary;
        this.travel_salary = travel_salary;
        this.complaint_penalty = complaint_penalty;
        this.other_penalty = other_penalty;
        this.insurance_payment = insurance_payment;
        this.tax_payment = tax_payment;
        this.summary = summary;
        this.settlement_status = settlement_status;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public String getSettlement_date() {
        return settlement_date;
    }

    public void setSettlement_date(String settlement_date) {
        this.settlement_date = settlement_date;
    }

    public float getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(float basic_salary) {
        this.basic_salary = basic_salary;
    }

    public float getTravel_salary() {
        return travel_salary;
    }

    public void setTravel_salary(float travel_salary) {
        this.travel_salary = travel_salary;
    }

    public float getComplaint_penalty() {
        return complaint_penalty;
    }

    public void setComplaint_penalty(float complaint_penalty) {
        this.complaint_penalty = complaint_penalty;
    }

    public float getOther_penalty() {
        return other_penalty;
    }

    public void setOther_penalty(float other_penalty) {
        this.other_penalty = other_penalty;
    }

    public float getInsurance_payment() {
        return insurance_payment;
    }

    public void setInsurance_payment(float insurance_payment) {
        this.insurance_payment = insurance_payment;
    }

    public float getTax_payment() {
        return tax_payment;
    }

    public void setTax_payment(float tax_payment) {
        this.tax_payment = tax_payment;
    }

    public float getSummary() {
        return summary;
    }

    public void setSummary(float summary) {
        this.summary = summary;
    }

    public String getSettlement_status() {
        return settlement_status;
    }

    public void setSettlement_status(String settlement_status) {
        this.settlement_status = settlement_status;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "aid=" + aid +
                ", driver_id=" + driver_id +
                ", settlement_date='" + settlement_date + '\'' +
                ", basic_salary=" + basic_salary +
                ", travel_salary=" + travel_salary +
                ", complaint_penalty=" + complaint_penalty +
                ", other_penalty=" + other_penalty +
                ", insurance_payment=" + insurance_payment +
                ", tax_payment=" + tax_payment +
                ", summary=" + summary +
                ", settlement_status='" + settlement_status + '\'' +
                '}';
    }
}
