package com.compname.compnamevendorservice.assembler;

import com.compname.compnamevendorservice.dto.VendorDTO;
import com.compname.compnamevendorservice.entity.VendorEntity;

public class VendorAssembler {




		public VendorDTO entityToDTO(VendorEntity VendorEntity)
		{
			VendorDTO VendorDTO = new VendorDTO();
			VendorDTO.setFirstName(VendorDTO.getFirstName());
			VendorDTO.setLastName(VendorDTO.getLastName());
			VendorDTO.setMobileNumber(VendorDTO.getMobileNumber());
			VendorDTO.setCurrentAddress(VendorDTO.getCurrentAddress());
			VendorDTO.setPermaInateAddress(VendorDTO.getPermaInateAddress());
			VendorDTO.setBloodgroup(VendorDTO.getBloodgroup());
			
			return VendorDTO;
		}
		
		public VendorEntity DTOToentity(VendorDTO VendorDTO)
		{
			VendorEntity VendorEntity = new VendorEntity();
			VendorEntity.setFirstName(VendorDTO.getFirstName());
			VendorEntity.setLastName(VendorDTO.getLastName());
			VendorEntity.setMobileNumber(VendorDTO.getMobileNumber());
			VendorEntity.setCurrentAddress(VendorDTO.getCurrentAddress());
			VendorEntity.setPermaInateAddress(VendorDTO.getPermaInateAddress());
			VendorEntity.setBloodgroup(VendorDTO.getBloodgroup());
			
			return VendorEntity;
		}
		
		}

	

