package compname.admin.service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Admins")
public class AdminEntity {

	@Id
	int adminId;
	
	double adminContactNo; 
	String adminFirstName;
	String adminLastName;
	double pendingRequestFromBuilder;
	double completedRequestforBuilder;
	double pendingRequestFromVendor;
	double completedRequestforVendor;
	double pendingRequestFromOwnerr;
	double completedRequestforOwner;
	
	
	public AdminEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AdminEntity(int adminId, double adminContactNo, String adminFirstName, String adminLastName,
			double pendingRequestFromBuilder, double completedRequestforBuilder, double pendingRequestFromVendor,
			double completedRequestforVendor, double pendingRequestFromOwnerr, double completedRequestforOwner) {
		super();
		this.adminId = adminId;
		this.adminContactNo = adminContactNo;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.pendingRequestFromBuilder = pendingRequestFromBuilder;
		this.completedRequestforBuilder = completedRequestforBuilder;
		this.pendingRequestFromVendor = pendingRequestFromVendor;
		this.completedRequestforVendor = completedRequestforVendor;
		this.pendingRequestFromOwnerr = pendingRequestFromOwnerr;
		this.completedRequestforOwner = completedRequestforOwner;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public double getAdminContactNo() {
		return adminContactNo;
	}


	public void setAdminContactNo(double adminContactNo) {
		this.adminContactNo = adminContactNo;
	}


	public String getAdminFirstName() {
		return adminFirstName;
	}


	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}


	public String getAdminLastName() {
		return adminLastName;
	}


	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}


	public double getPendingRequestFromBuilder() {
		return pendingRequestFromBuilder;
	}


	public void setPendingRequestFromBuilder(double pendingRequestFromBuilder) {
		this.pendingRequestFromBuilder = pendingRequestFromBuilder;
	}


	public double getCompletedRequestforBuilder() {
		return completedRequestforBuilder;
	}


	public void setCompletedRequestforBuilder(double completedRequestforBuilder) {
		this.completedRequestforBuilder = completedRequestforBuilder;
	}


	public double getPendingRequestFromVendor() {
		return pendingRequestFromVendor;
	}


	public void setPendingRequestFromVendor(double pendingRequestFromVendor) {
		this.pendingRequestFromVendor = pendingRequestFromVendor;
	}


	public double getCompletedRequestforVendor() {
		return completedRequestforVendor;
	}


	public void setCompletedRequestforVendor(double completedRequestforVendor) {
		this.completedRequestforVendor = completedRequestforVendor;
	}


	public double getPendingRequestFromOwnerr() {
		return pendingRequestFromOwnerr;
	}


	public void setPendingRequestFromOwnerr(double pendingRequestFromOwnerr) {
		this.pendingRequestFromOwnerr = pendingRequestFromOwnerr;
	}


	public double getCompletedRequestforOwner() {
		return completedRequestforOwner;
	}


	public void setCompletedRequestforOwner(double completedRequestforOwner) {
		this.completedRequestforOwner = completedRequestforOwner;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdminEntity [adminId=");
		builder.append(adminId);
		builder.append(", adminContactNo=");
		builder.append(adminContactNo);
		builder.append(", adminFirstName=");
		builder.append(adminFirstName);
		builder.append(", adminLastName=");
		builder.append(adminLastName);
		builder.append(", pendingRequestFromBuilder=");
		builder.append(pendingRequestFromBuilder);
		builder.append(", completedRequestforBuilder=");
		builder.append(completedRequestforBuilder);
		builder.append(", pendingRequestFromVendor=");
		builder.append(pendingRequestFromVendor);
		builder.append(", completedRequestforVendor=");
		builder.append(completedRequestforVendor);
		builder.append(", pendingRequestFromOwnerr=");
		builder.append(pendingRequestFromOwnerr);
		builder.append(", completedRequestforOwner=");
		builder.append(completedRequestforOwner);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
