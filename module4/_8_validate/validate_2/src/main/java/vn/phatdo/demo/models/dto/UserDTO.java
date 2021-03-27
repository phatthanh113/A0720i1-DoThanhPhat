package vn.phatdo.demo.models.dto;

import lombok.Data;
import vn.phatdo.demo.models.entity.User;
import vn.phatdo.demo.services.IUserService;
import vn.phatdo.demo.validation.UserLogin;
import vn.phatdo.demo.validation.UserLoginValidation;

import javax.validation.Constraint;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Data
@UserLogin(message = "Mat khau va xac nhan mat khau phai khop nhau")
public class UserDTO {
    @Valid
    private User user ;
    @NotNull
    private String passwordConfirm ;
}
