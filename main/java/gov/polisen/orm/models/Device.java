package gov.polisen.orm.models;

import java.util.Date;

public class Device {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devices.id
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devices.lastseen
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    private Date lastseen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devices.battery
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    private Short battery;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devices.longitude
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    private Float longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column devices.latitude
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    private Float latitude;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table devices
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    public Device(Integer id, Date lastseen, Short battery, Float longitude, Float latitude) {
        this.id = id;
        this.lastseen = lastseen;
        this.battery = battery;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devices.id
     *
     * @return the value of devices.id
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devices.lastseen
     *
     * @return the value of devices.lastseen
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    public Date getLastseen() {
        return lastseen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devices.battery
     *
     * @return the value of devices.battery
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    public Short getBattery() {
        return battery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devices.longitude
     *
     * @return the value of devices.longitude
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column devices.latitude
     *
     * @return the value of devices.latitude
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    public Float getLatitude() {
        return latitude;
    }
}