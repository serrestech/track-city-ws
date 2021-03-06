package code.injectors.track.city.ws.mapper.user;

import code.injectors.track.city.ws.domain.entity.user.Role;
import code.injectors.track.city.ws.dto.user.RoleDTO;
import code.injectors.track.city.ws.mapper.PageMapper;
import org.mapstruct.Mapper;

/**
 * @author Chatzakis Nikolaos
 */
@Mapper
public interface RoleMapper extends PageMapper<Role, RoleDTO> {
}
