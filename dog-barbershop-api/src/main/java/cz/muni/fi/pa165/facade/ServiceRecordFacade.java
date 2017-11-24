package cz.muni.fi.pa165.facade;

import cz.muni.fi.pa165.dto.servicerecord.ServiceRecordCreateDTO;
import cz.muni.fi.pa165.dto.servicerecord.ServiceRecordDTO;

import java.util.List;

/**
 * @author Jan Kalfus
 */
public interface ServiceRecordFacade {
    Long createServiceRecord(ServiceRecordCreateDTO dto);
    List<ServiceRecordDTO> getServiceRecordsByDog(Long dogId);
}