package vn.phatdo.demo.validation;

import vn.phatdo.demo.models.dto.UserDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserLoginValidation implements ConstraintValidator<UserLogin, UserDTO> {

    @Override
    public void initialize(UserLogin constraintAnnotation) {

    }

    @Override
    public boolean isValid(UserDTO userDTO, ConstraintValidatorContext constraintValidatorContext) {
        return userDTO.getUser().getPassword().equals(userDTO.getPasswordConfirm());
    }
}
