package demo.TspApi.response;

import java.io.Serializable;


public class SuccessResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String successProvider;
	
	public String getSuccessProvider() {
		return successProvider;
	}
	public void setSuccessProvider(String successProvider) {
		this.successProvider = successProvider;
	}
	
	public SuccessResponse(String successProvider) {
		super();
		this.successProvider = successProvider;
	}
	
}
