package com.internship.tmontica.user.model.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;

@Getter
@Setter
public class UserSignUpReqDTO{

    @Pattern(regexp="^[a-z0-9]{6,19}$")
    @NotNull
    private String id;
    @NotNull
    private String name;
    @Pattern(regexp = "^[_a-zA-Z0-9-\\\\.]+@[\\\\.a-zA-Z0-9-]+\\\\.[a-zA-Z]+$")
    @NotNull
    private String email;
    @NotNull
    private Date birthDate;
    @Pattern(regexp="^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{6,19}")
    @NotNull
    private String password;
    @Pattern(regexp="^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{6,19}")
    @NotNull
    private String passwordCheck;
    private String role;
}
