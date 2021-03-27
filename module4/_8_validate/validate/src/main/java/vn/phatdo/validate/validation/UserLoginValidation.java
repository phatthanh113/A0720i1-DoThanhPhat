package vn.phatdo.validate.validation;

import vn.phatdo.validate.models.dto.UserDTO;
import vn.phatdo.validate.models.entity.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserLoginValidation implements ConstraintValidator<UserLogin, UserDTO> {

    @Override
    public void initialize(UserLogin constraintAnnotation) {

    }

    @Override
    public boolean isValid(UserDTO user, ConstraintValidatorContext constraintValidatorContext) {
        return user.getPassword().equals(user.getPasswordConfirm());
    }
}
