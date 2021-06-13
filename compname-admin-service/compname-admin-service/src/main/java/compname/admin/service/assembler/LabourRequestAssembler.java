package compname.admin.service.assembler;

import compname.admin.service.dto.LabourRequestDTO;
import compname.admin.service.entity.LabourRequestEntity;

public class LabourRequestAssembler {

	public LabourRequestDTO entityToDTO(LabourRequestEntity labourRequestEntity)
	{
			
		LabourRequestDTO labourRequestDTO = new LabourRequestDTO();
		labourRequestDTO.setRequestFromBuilder(labourRequestEntity.getRequestFromBuilder());
		labourRequestDTO.setNoOfLaborRequired(labourRequestEntity.getNoOfLaborRequired());
		labourRequestDTO.setFromDate(labourRequestEntity.getFromDate());
		labourRequestDTO.setToDate(labourRequestEntity.getToDate());
		labourRequestDTO.setNoOfWorkingHours(labourRequestEntity.getNoOfWorkingHours());
		labourRequestDTO.setCommentFromBuilder(labourRequestEntity.getCommentFromBuilder());
		
		return labourRequestDTO;
	}
	
	public LabourRequestEntity dtoToEntity(LabourRequestDTO labourRequestDTO)
	{
		LabourRequestEntity labourRequestEntity = new LabourRequestEntity();
		labourRequestEntity.setCommentFromBuilder(labourRequestDTO.getCommentFromBuilder());
		labourRequestEntity.setNoOfLaborRequired(labourRequestDTO.getNoOfLaborRequired());
		labourRequestEntity.setFromDate(labourRequestDTO.getFromDate());
		labourRequestEntity.setToDate(labourRequestDTO.getToDate());
		labourRequestEntity.setNoOfWorkingHours(labourRequestDTO.getNoOfWorkingHours());
		labourRequestEntity.setCommentFromBuilder(labourRequestDTO.getCommentFromBuilder());
		
		return labourRequestEntity;
	}
}
