package compname.admin.service.assembler;

import compname.admin.service.dto.AdminDTO;
import compname.admin.service.entity.AdminEntity;

public class AdminAssembler {

	
	public AdminDTO entityToDTO(AdminEntity adminEntity)
	{
		
		
		AdminDTO adminDTO = new AdminDTO();
		adminDTO.setAdminFirstName(adminEntity.getAdminFirstName());
		adminDTO.setAdminLastName(adminEntity.getAdminLastName());
		adminDTO.setAdminContactNo(adminEntity.getAdminContactNo());
		adminDTO.setPendingRequestFromBuilder(adminEntity.getPendingRequestFromBuilder());
		adminDTO.setCompletedRequestforBuilder(adminEntity.getCompletedRequestforBuilder());
		adminDTO.setPendingRequestFromOwnerr(adminEntity.getPendingRequestFromOwnerr());
		adminDTO.setPendingRequestFromVendor(adminEntity.getPendingRequestFromVendor());
		adminDTO.setCompletedRequestforVendor(adminEntity.getCompletedRequestforVendor());
		return adminDTO ;
	}
	
	public AdminEntity dtoToEntity(AdminDTO adminDTO)
	{
		AdminEntity adminEntity = new AdminEntity();
		adminEntity.setAdminFirstName(adminDTO.getAdminFirstName());
		adminEntity.setAdminLastName(adminDTO.getAdminLastName());
		adminEntity.setAdminContactNo(adminDTO.getAdminContactNo());
		adminEntity.setPendingRequestFromBuilder(adminDTO.getPendingRequestFromBuilder());
		adminEntity.setCompletedRequestforBuilder(adminDTO.getCompletedRequestforBuilder());
		adminEntity.setPendingRequestFromOwnerr(adminDTO.getPendingRequestFromOwnerr());
		adminEntity.setPendingRequestFromVendor(adminDTO.getPendingRequestFromVendor());
		adminEntity.setCompletedRequestforVendor(adminDTO.getCompletedRequestforVendor());
		return adminEntity;
	}
}
