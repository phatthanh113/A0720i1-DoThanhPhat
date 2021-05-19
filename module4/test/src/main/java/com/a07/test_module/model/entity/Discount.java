package com.a07.test_module.model.entity;

import com.a07.test_module.validator.DateValid;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@DateValid(checkOut = "endDate",checkIn = "startDate")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @NotNull
    @NotBlank
    private String title ;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate startDate ;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate endDate ;
    @NotNull
    @Range(min = 10000l, message = "Mức khuyển mãi phải hơn 10000")
    private Long level ;
    @NotNull
    @NotBlank
    private String description ;
}
