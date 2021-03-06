package cn.com.gps169.db.model;

import java.util.Date;

public class Vehicle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.vehicle_id
     *
     * @mbggenerated
     */
    private Integer vehicleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.terminal_id
     *
     * @mbggenerated
     */
    private Integer terminalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.license_plate
     *
     * @mbggenerated
     */
    private String licensePlate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.vin
     *
     * @mbggenerated
     */
    private String vin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.ein
     *
     * @mbggenerated
     */
    private String ein;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.style_id
     *
     * @mbggenerated
     */
    private Integer styleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.style_name
     *
     * @mbggenerated
     */
    private String styleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.model_id
     *
     * @mbggenerated
     */
    private Integer modelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.model_name
     *
     * @mbggenerated
     */
    private String modelName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.brand_id
     *
     * @mbggenerated
     */
    private Integer brandId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.brand_name
     *
     * @mbggenerated
     */
    private String brandName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.img_url
     *
     * @mbggenerated
     */
    private String imgUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.created
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gps_vehicle.updated
     *
     * @mbggenerated
     */
    private Date updated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.vehicle_id
     *
     * @return the value of gps_vehicle.vehicle_id
     *
     * @mbggenerated
     */
    public Integer getVehicleId() {
        return vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.vehicle_id
     *
     * @param vehicleId the value for gps_vehicle.vehicle_id
     *
     * @mbggenerated
     */
    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.terminal_id
     *
     * @return the value of gps_vehicle.terminal_id
     *
     * @mbggenerated
     */
    public Integer getTerminalId() {
        return terminalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.terminal_id
     *
     * @param terminalId the value for gps_vehicle.terminal_id
     *
     * @mbggenerated
     */
    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.license_plate
     *
     * @return the value of gps_vehicle.license_plate
     *
     * @mbggenerated
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.license_plate
     *
     * @param licensePlate the value for gps_vehicle.license_plate
     *
     * @mbggenerated
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate == null ? null : licensePlate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.vin
     *
     * @return the value of gps_vehicle.vin
     *
     * @mbggenerated
     */
    public String getVin() {
        return vin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.vin
     *
     * @param vin the value for gps_vehicle.vin
     *
     * @mbggenerated
     */
    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.ein
     *
     * @return the value of gps_vehicle.ein
     *
     * @mbggenerated
     */
    public String getEin() {
        return ein;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.ein
     *
     * @param ein the value for gps_vehicle.ein
     *
     * @mbggenerated
     */
    public void setEin(String ein) {
        this.ein = ein == null ? null : ein.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.style_id
     *
     * @return the value of gps_vehicle.style_id
     *
     * @mbggenerated
     */
    public Integer getStyleId() {
        return styleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.style_id
     *
     * @param styleId the value for gps_vehicle.style_id
     *
     * @mbggenerated
     */
    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.style_name
     *
     * @return the value of gps_vehicle.style_name
     *
     * @mbggenerated
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.style_name
     *
     * @param styleName the value for gps_vehicle.style_name
     *
     * @mbggenerated
     */
    public void setStyleName(String styleName) {
        this.styleName = styleName == null ? null : styleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.model_id
     *
     * @return the value of gps_vehicle.model_id
     *
     * @mbggenerated
     */
    public Integer getModelId() {
        return modelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.model_id
     *
     * @param modelId the value for gps_vehicle.model_id
     *
     * @mbggenerated
     */
    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.model_name
     *
     * @return the value of gps_vehicle.model_name
     *
     * @mbggenerated
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.model_name
     *
     * @param modelName the value for gps_vehicle.model_name
     *
     * @mbggenerated
     */
    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.brand_id
     *
     * @return the value of gps_vehicle.brand_id
     *
     * @mbggenerated
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.brand_id
     *
     * @param brandId the value for gps_vehicle.brand_id
     *
     * @mbggenerated
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.brand_name
     *
     * @return the value of gps_vehicle.brand_name
     *
     * @mbggenerated
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.brand_name
     *
     * @param brandName the value for gps_vehicle.brand_name
     *
     * @mbggenerated
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.img_url
     *
     * @return the value of gps_vehicle.img_url
     *
     * @mbggenerated
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.img_url
     *
     * @param imgUrl the value for gps_vehicle.img_url
     *
     * @mbggenerated
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.status
     *
     * @return the value of gps_vehicle.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.status
     *
     * @param status the value for gps_vehicle.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.type
     *
     * @return the value of gps_vehicle.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.type
     *
     * @param type the value for gps_vehicle.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.created
     *
     * @return the value of gps_vehicle.created
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.created
     *
     * @param created the value for gps_vehicle.created
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gps_vehicle.updated
     *
     * @return the value of gps_vehicle.updated
     *
     * @mbggenerated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gps_vehicle.updated
     *
     * @param updated the value for gps_vehicle.updated
     *
     * @mbggenerated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_vehicle
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Vehicle other = (Vehicle) that;
        return (this.getVehicleId() == null ? other.getVehicleId() == null : this.getVehicleId().equals(other.getVehicleId()))
            && (this.getTerminalId() == null ? other.getTerminalId() == null : this.getTerminalId().equals(other.getTerminalId()))
            && (this.getLicensePlate() == null ? other.getLicensePlate() == null : this.getLicensePlate().equals(other.getLicensePlate()))
            && (this.getVin() == null ? other.getVin() == null : this.getVin().equals(other.getVin()))
            && (this.getEin() == null ? other.getEin() == null : this.getEin().equals(other.getEin()))
            && (this.getStyleId() == null ? other.getStyleId() == null : this.getStyleId().equals(other.getStyleId()))
            && (this.getStyleName() == null ? other.getStyleName() == null : this.getStyleName().equals(other.getStyleName()))
            && (this.getModelId() == null ? other.getModelId() == null : this.getModelId().equals(other.getModelId()))
            && (this.getModelName() == null ? other.getModelName() == null : this.getModelName().equals(other.getModelName()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getBrandName() == null ? other.getBrandName() == null : this.getBrandName().equals(other.getBrandName()))
            && (this.getImgUrl() == null ? other.getImgUrl() == null : this.getImgUrl().equals(other.getImgUrl()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gps_vehicle
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVehicleId() == null) ? 0 : getVehicleId().hashCode());
        result = prime * result + ((getTerminalId() == null) ? 0 : getTerminalId().hashCode());
        result = prime * result + ((getLicensePlate() == null) ? 0 : getLicensePlate().hashCode());
        result = prime * result + ((getVin() == null) ? 0 : getVin().hashCode());
        result = prime * result + ((getEin() == null) ? 0 : getEin().hashCode());
        result = prime * result + ((getStyleId() == null) ? 0 : getStyleId().hashCode());
        result = prime * result + ((getStyleName() == null) ? 0 : getStyleName().hashCode());
        result = prime * result + ((getModelId() == null) ? 0 : getModelId().hashCode());
        result = prime * result + ((getModelName() == null) ? 0 : getModelName().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        result = prime * result + ((getImgUrl() == null) ? 0 : getImgUrl().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        return result;
    }
}