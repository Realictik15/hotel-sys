package com.vsu.project.dto;

import com.vsu.project.transfer.Existing;
import com.vsu.project.transfer.New;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    @Null(groups = {New.class}, message = "The field must be empty")
    @NotNull(groups = {Existing.class})
    private Long id;

    @NotNull(groups = {New.class, Existing.class})
    private String firstName;

    @NotNull(groups = {New.class, Existing.class})
    private String lastName;

    @NotNull(groups = {New.class, Existing.class})
    private String DocInfo;

    @NotNull(groups = {New.class})
    @Null(groups = {Existing.class})
    private String login;

    @NotNull(groups = {New.class})
    @Null(groups = {Existing.class})
    private String pass;
}
