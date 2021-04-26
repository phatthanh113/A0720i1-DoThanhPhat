package vn.phatdo.demo.models.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    @NotBlank(message = "user name ko duoc de trong")
    @NotNull(message = "ten khong duoc de trong")
    private String username ;
    @NotBlank
    @NotNull
    private String password ;

    private String firstName ;

    private String lastName ;

    private String phoneNumber ;

    private int age ;

    private String email ;
}
