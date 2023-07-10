package demo.TspApi.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tsp_phone_subscriber",schema="public")
public class TspSubscriberNo  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="phone_no")
	private Long phoneNo;
	
	@Column(name="subscriber_name")
	private String subscriberName;
	
	@Column(name="building_name")
	private String buildingName;
	
	@Column(name="door_no")
	private String doorNo;
	
	@Column(name="street_name")
	private String streetName;
	
	@Column(name="place")
	private String place;
	
	@Column(name="district")
	private String district;
	
	@Column(name="pincode")
	private String pinCode;
	
	@Column(name="latitude")
	private Double latitude;
	
	@Column(name="longitude")
	private Double longitude;
	
	@Column(name="provider")
	private String provider;
	
	@Column(name="partition_key")
	private Integer partitionKey;

	@Column(name = "is_success")
	private Boolean isSuccess;
	

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getSubscriberName() {
		return subscriberName;
	}

	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
	    this.provider = provider;
	}

	public Integer getPartitionKey() {
		return partitionKey;
	}

	public void setPartitionKey(Integer partitionKey) {
		this.partitionKey = partitionKey;
	}

	public TspSubscriberNo(Long phoneNo, String subscriberName, String buildingName, String doorNo, String streetName,
			String place, String district, String pinCode, Double latitude, Double longitude, String provider,
			Integer partitionKey, Boolean isSuccess) {
		super();
		this.phoneNo = phoneNo;
		this.subscriberName = subscriberName;
		this.buildingName = buildingName;
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.place = place;
		this.district = district;
		this.pinCode = pinCode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.provider = provider;
		this.partitionKey = partitionKey;
		this.isSuccess=isSuccess;
		
		
		
	}

	public TspSubscriberNo() {
		
	}

	
	
	
}
