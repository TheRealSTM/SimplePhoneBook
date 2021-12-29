package org.stm.simplephonebook.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Contact {
    @NotBlank(message = "First name is required.")
    String firstName;

    @NotBlank(message = "Last name is required.")
    String lastName;

    @NotBlank(message = "Email is required.")
    String email;
}
