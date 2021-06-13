package compname.admin.service.entity;

public class AdminLabourRequest {
	
	
	private int labourRequestId;
	String statusOfRequest ;
	
	
	public AdminLabourRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public AdminLabourRequest(int labourRequestId, String statusOfRequest) {
		super();
		this.labourRequestId = labourRequestId;
		this.statusOfRequest = statusOfRequest;
	}
	
	
	public int getLabourRequestId() {
		return labourRequestId;
	}
	public void setLabourRequestId(int labourRequestId) {
		this.labourRequestId = labourRequestId;
	}
	public String getStatusOfRequest() {
		return statusOfRequest;
	}
	public void setStatusOfRequest(String statusOfRequest) {
		this.statusOfRequest = statusOfRequest;
	}




	
	
}
