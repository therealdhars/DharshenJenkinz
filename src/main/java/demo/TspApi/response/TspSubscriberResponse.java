package demo.TspApi.response;

import java.util.List;

import org.springframework.data.domain.Page;

import demo.TspApi.Entity.TspSubscriberNo;

public class TspSubscriberResponse {

	 private final List<TspSubscriberNo> tspsub;

	  public TspSubscriberResponse(Page<TspSubscriberNo> page) {
	    super();
	    this.tspsub = page.getContent();
	  }

	public List<TspSubscriberNo> getTspsub() {
		return tspsub;
	}
	  
}
