package vn.phatdo.demo.models.dto;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import vn.phatdo.demo.models.entity.User;

import javax.validation.Valid;

@Component
public class UserDTOValid implements Validator {
    @Valid
    private User user ;
    private String confirmPassword ;
    @Override
    public boolean supports(Class<?> clazz) {
        return UserDTOValid.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDTOValid userDTOValid = (UserDTOValid) target;

    }
}
