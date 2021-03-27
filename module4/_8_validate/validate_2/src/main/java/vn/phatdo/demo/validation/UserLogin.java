package vn.phatdo.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UserLoginValidation.class)
public @interface UserLogin {
    String message() default "password not unmatch";
    Class<?>[] groups() default {};
    public abstract Class<? extends Payload>[] payload() default {} ;
}
