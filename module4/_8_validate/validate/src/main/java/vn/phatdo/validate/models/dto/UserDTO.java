package vn.phatdo.validate.models.dto;

import lombok.Data;
import vn.phatdo.validate.validation.UserLogin;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@UserLogin(message = "Mat khau va xac nhan mat khau phai khop nhau")
public class UserDTO {

    @NotBlank(message = "User khong duoc de trong")
    @NotNull
    private String username ;

    @NotBlank(message = "Password khong duoc de trong")
    @NotNull
    private String password ;

    @NotNull
    private String passwordConfirm ;
}
