package com.wzw.pojo;

public class Ride {
    private int rid;
    private String time;
    private int passenger_id;
    private int driver_id;
    private String MQTT_chanel;
    private String ride_type;
    private String start_coordinate;
    private String start_address;
    private String end_coordinate;
    private String end_address;
    private String ride_status;
    private String ride_accept_time;
    private String pick_up_time;
    private String arrive_time;
    private String ride_cancel_time;
    private String ride_distance;
    private String ride_order_id;
    private String ride_alarm_status;
    private String warranty_status;
    private int ride_stars;
    private String ride_comment;
    private String formed_order_id;
    private float total_price;
    private float start_price;
    private float ride_gas_price;
    private float time_price;
    private float special_location_price;
    private float dynamic_price;
    private String order_status;
    private String payment_platform;
    private String payment_id;
    private String payment_result;
    private String ride_trace_id;
    private String time_form;
    private String GPS_trace;
    private float speed_trace;
    private float altitude_trace;

    public Ride() {
    }

    public Ride(String time, int passenger_id, int driver_id, String MQTT_chanel, String ride_type, String start_coordinate, String start_address, String end_coordinate, String end_address, String ride_status, String ride_accept_time, String pick_up_time, String arrive_time, String ride_cancel_time, String ride_distance, String ride_order_id, String ride_alarm_status, String warranty_status, int ride_stars, String ride_comment, String formed_order_id, float total_price, float start_price, float ride_gas_price, float time_price, float special_location_price, float dynamic_price, String order_status, String payment_platform, String payment_id, String payment_result, String ride_trace_id, String time_form, String GPS_trace, float speed_trace, float altitude_trace) {
        this.rid = (int)(Math.random() * 1000000);
        this.time = time;
        this.passenger_id = passenger_id;
        this.driver_id = driver_id;
        this.MQTT_chanel = MQTT_chanel;
        this.ride_type = ride_type;
        this.start_coordinate = start_coordinate;
        this.start_address = start_address;
        this.end_coordinate = end_coordinate;
        this.end_address = end_address;
        this.ride_status = ride_status;
        this.ride_accept_time = ride_accept_time;
        this.pick_up_time = pick_up_time;
        this.arrive_time = arrive_time;
        this.ride_cancel_time = ride_cancel_time;
        this.ride_distance = ride_distance;
        this.ride_order_id = ride_order_id;
        this.ride_alarm_status = ride_alarm_status;
        this.warranty_status = warranty_status;
        this.ride_stars = ride_stars;
        this.ride_comment = ride_comment;
        this.formed_order_id = formed_order_id;
        this.total_price = total_price;
        this.start_price = start_price;
        this.ride_gas_price = ride_gas_price;
        this.time_price = time_price;
        this.special_location_price = special_location_price;
        this.dynamic_price = dynamic_price;
        this.order_status = order_status;
        this.payment_platform = payment_platform;
        this.payment_id = payment_id;
        this.payment_result = payment_result;
        this.ride_trace_id = ride_trace_id;
        this.time_form = time_form;
        this.GPS_trace = GPS_trace;
        this.speed_trace = speed_trace;
        this.altitude_trace = altitude_trace;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public String getMQTT_chanel() {
        return MQTT_chanel;
    }

    public void setMQTT_chanel(String MQTT_chanel) {
        this.MQTT_chanel = MQTT_chanel;
    }

    public String getRide_type() {
        return ride_type;
    }

    public void setRide_type(String ride_type) {
        this.ride_type = ride_type;
    }

    public String getStart_coordinate() {
        return start_coordinate;
    }

    public void setStart_coordinate(String start_coordinate) {
        this.start_coordinate = start_coordinate;
    }

    public String getStart_address() {
        return start_address;
    }

    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }

    public String getEnd_coordinate() {
        return end_coordinate;
    }

    public void setEnd_coordinate(String end_coordinate) {
        this.end_coordinate = end_coordinate;
    }

    public String getEnd_address() {
        return end_address;
    }

    public void setEnd_address(String end_address) {
        this.end_address = end_address;
    }

    public String getRide_status() {
        return ride_status;
    }

    public void setRide_status(String ride_status) {
        this.ride_status = ride_status;
    }

    public String getRide_accept_time() {
        return ride_accept_time;
    }

    public void setRide_accept_time(String ride_accept_time) {
        this.ride_accept_time = ride_accept_time;
    }

    public String getPick_up_time() {
        return pick_up_time;
    }

    public void setPick_up_time(String pick_up_time) {
        this.pick_up_time = pick_up_time;
    }

    public String getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(String arrive_time) {
        this.arrive_time = arrive_time;
    }

    public String getRide_cancel_time() {
        return ride_cancel_time;
    }

    public void setRide_cancel_time(String ride_cancel_time) {
        this.ride_cancel_time = ride_cancel_time;
    }

    public String getRide_distance() {
        return ride_distance;
    }

    public void setRide_distance(String ride_distance) {
        this.ride_distance = ride_distance;
    }

    public String getRide_order_id() {
        return ride_order_id;
    }

    public void setRide_order_id(String ride_order_id) {
        this.ride_order_id = ride_order_id;
    }

    public String getRide_alarm_status() {
        return ride_alarm_status;
    }

    public void setRide_alarm_status(String ride_alarm_status) {
        this.ride_alarm_status = ride_alarm_status;
    }

    public String getWarranty_status() {
        return warranty_status;
    }

    public void setWarranty_status(String warranty_status) {
        this.warranty_status = warranty_status;
    }

    public int getRide_stars() {
        return ride_stars;
    }

    public void setRide_stars(int ride_stars) {
        this.ride_stars = ride_stars;
    }

    public String getRide_comment() {
        return ride_comment;
    }

    public void setRide_comment(String ride_comment) {
        this.ride_comment = ride_comment;
    }

    public String getFormed_order_id() {
        return formed_order_id;
    }

    public void setFormed_order_id(String formed_order_id) {
        this.formed_order_id = formed_order_id;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public float getStart_price() {
        return start_price;
    }

    public void setStart_price(float start_price) {
        this.start_price = start_price;
    }

    public float getRide_gas_price() {
        return ride_gas_price;
    }

    public void setRide_gas_price(float ride_gas_price) {
        this.ride_gas_price = ride_gas_price;
    }

    public float getTime_price() {
        return time_price;
    }

    public void setTime_price(float time_price) {
        this.time_price = time_price;
    }

    public float getSpecial_location_price() {
        return special_location_price;
    }

    public void setSpecial_location_price(float special_location_price) {
        this.special_location_price = special_location_price;
    }

    public float getDynamic_price() {
        return dynamic_price;
    }

    public void setDynamic_price(float dynamic_price) {
        this.dynamic_price = dynamic_price;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getPayment_platform() {
        return payment_platform;
    }

    public void setPayment_platform(String payment_platform) {
        this.payment_platform = payment_platform;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(String payment_id) {
        this.payment_id = payment_id;
    }

    public String getPayment_result() {
        return payment_result;
    }

    public void setPayment_result(String payment_result) {
        this.payment_result = payment_result;
    }

    public String getRide_trace_id() {
        return ride_trace_id;
    }

    public void setRide_trace_id(String ride_trace_id) {
        this.ride_trace_id = ride_trace_id;
    }

    public String getTime_form() {
        return time_form;
    }

    public void setTime_form(String time_form) {
        this.time_form = time_form;
    }

    public String getGPS_trace() {
        return GPS_trace;
    }

    public void setGPS_trace(String GPS_trace) {
        this.GPS_trace = GPS_trace;
    }

    public float getSpeed_trace() {
        return speed_trace;
    }

    public void setSpeed_trace(float speed_trace) {
        this.speed_trace = speed_trace;
    }

    public float getAltitude_trace() {
        return altitude_trace;
    }

    public void setAltitude_trace(float altitude_trace) {
        this.altitude_trace = altitude_trace;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "rid=" + rid +
                ", time='" + time + '\'' +
                ", passenger_id=" + passenger_id +
                ", driver_id=" + driver_id +
                ", MQTT_chanel='" + MQTT_chanel + '\'' +
                ", ride_type='" + ride_type + '\'' +
                ", start_coordinate='" + start_coordinate + '\'' +
                ", start_address='" + start_address + '\'' +
                ", end_coordinate='" + end_coordinate + '\'' +
                ", end_address='" + end_address + '\'' +
                ", ride_status='" + ride_status + '\'' +
                ", ride_accept_time='" + ride_accept_time + '\'' +
                ", pick_up_time='" + pick_up_time + '\'' +
                ", arrive_time='" + arrive_time + '\'' +
                ", ride_cancel_time='" + ride_cancel_time + '\'' +
                ", ride_distance='" + ride_distance + '\'' +
                ", ride_order_id='" + ride_order_id + '\'' +
                ", ride_alarm_status='" + ride_alarm_status + '\'' +
                ", warranty_status='" + warranty_status + '\'' +
                ", ride_stars=" + ride_stars +
                ", ride_comment='" + ride_comment + '\'' +
                ", formed_order_id='" + formed_order_id + '\'' +
                ", total_price=" + total_price +
                ", start_price=" + start_price +
                ", ride_gas_price=" + ride_gas_price +
                ", time_price=" + time_price +
                ", special_location_price=" + special_location_price +
                ", dynamic_price=" + dynamic_price +
                ", order_status='" + order_status + '\'' +
                ", payment_platform='" + payment_platform + '\'' +
                ", payment_id='" + payment_id + '\'' +
                ", payment_result='" + payment_result + '\'' +
                ", ride_trace_id='" + ride_trace_id + '\'' +
                ", time_form='" + time_form + '\'' +
                ", GPS_trace='" + GPS_trace + '\'' +
                ", speed_trace=" + speed_trace +
                ", altitude_trace=" + altitude_trace +
                '}';
    }
}

