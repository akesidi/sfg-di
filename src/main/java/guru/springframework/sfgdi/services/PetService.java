package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Service
public interface PetService {

    String getPetType();
}
