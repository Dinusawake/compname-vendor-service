package compname.admin.service.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Labour_request")
public class LabourRequestEntity {

	@Id
	private int labourRequestId;
	
	@Column(name = "statusOfRequest")
	String statusOfRequest ;
	
	@Column(name = "requestFromBuilder")
	String requestFromBuilder ;
	
	@Column(name = "noOfLaborRequired")
	int noOfLaborRequired;
	
	@Column(name = "fromDate")
	Date fromDate;
	
	@Column(name = "toDate")
	Date toDate;
	
	@Column(name = "noOfWorkingHours")
	int noOfWorkingHours;
	
	@Column(name = "commentFormBuilder")
	String commentFromBuilder;

	public LabourRequestEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LabourRequestEntity(int labouRequestId, String statusOfRequest, String requestFromBuilder,
			int noOfLaborRequired, Date fromDate, Date toDate, int noOfWorkingHours, String commentFromBuilder) {
		super();
		this.labourRequestId = labouRequestId;
		this.statusOfRequest = statusOfRequest;
		this.requestFromBuilder = requestFromBuilder;
		this.noOfLaborRequired = noOfLaborRequired;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.noOfWorkingHours = noOfWorkingHours;
		this.commentFromBuilder = commentFromBuilder;
	}

	public int getLabouRequestId() {
		return labourRequestId;
	}

	public void setLabouRequestId(int labouRequestId) {
		this.labourRequestId = labouRequestId;
	}

	public String getStatusOfRequest() {
		return statusOfRequest;
	}

	public void setStatusOfRequest(String statusOfRequest) {
		this.statusOfRequest = statusOfRequest;
	}

	public String getRequestFromBuilder() {
		return requestFromBuilder;
	}

	public void setRequestFromBuilder(String requestFromBuilder) {
		this.requestFromBuilder = requestFromBuilder;
	}

	public int getNoOfLaborRequired() {
		return noOfLaborRequired;
	}

	public void setNoOfLaborRequired(int noOfLaborRequired) {
		this.noOfLaborRequired = noOfLaborRequired;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getNoOfWorkingHours() {
		return noOfWorkingHours;
	}

	public void setNoOfWorkingHours(int noOfWorkingHours) {
		this.noOfWorkingHours = noOfWorkingHours;
	}

	public String getCommentFromBuilder() {
		return commentFromBuilder;
	}

	public void setCommentFromBuilder(String commentFromBuilder) {
		this.commentFromBuilder = commentFromBuilder;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LabourRequestEntity [labouRequestId=");
		builder.append(labourRequestId);
		builder.append(", statusOfRequest=");
		builder.append(statusOfRequest);
		builder.append(", requestFromBuilder=");
		builder.append(requestFromBuilder);
		builder.append(", noOfLaborRequired=");
		builder.append(noOfLaborRequired);
		builder.append(", fromDate=");
		builder.append(fromDate);
		builder.append(", toDate=");
		builder.append(toDate);
		builder.append(", noOfWorkingHours=");
		builder.append(noOfWorkingHours);
		builder.append(", commentFromBuilder=");
		builder.append(commentFromBuilder);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}