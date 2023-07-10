package demo.TspApi.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tsp_mobile_num_plan",schema="public")
public class TspMobileNoPlan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	@Id
	@Column (name="num_series", nullable=false)
    private Integer numSeries;
	
    @Column(name = "provider")
    private String provider;
    
    @Column(name = "circle")
    private String circle;
    
    @Column(name = "is_enabled")
    private Boolean isEnabled;

	public Integer getNumSeries() {
		return numSeries;
	}

	public void setNumSeries(Integer numSeries) {
		this.numSeries = numSeries;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	@Override
	public String toString() {
		return "TspMobileNoPlan [numSeries=" + numSeries + ", provider=" + provider + ", circle=" + circle
				+ ", isEnabled=" + isEnabled + "]";
	}

	public TspMobileNoPlan(Integer numSeries, String provider, String circle, Boolean isEnabled) {
		super();
		this.numSeries = numSeries;
		this.provider = provider;
		this.circle = circle;
		this.isEnabled = isEnabled;
	}

    
}