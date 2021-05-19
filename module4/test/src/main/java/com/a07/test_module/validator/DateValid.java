package com.a07.test_module.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.time.LocalDate;

@Documented
@Constraint(validatedBy = DateInOutValid.class)
@Target({ ElementType.TYPE, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DateValid {
    String message() default "Invalid Date";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String checkIn();
    String checkOut();
}
