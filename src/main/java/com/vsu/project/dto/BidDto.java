package com.vsu.project.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vsu.project.models.Apartment;
import com.vsu.project.models.BidType;
import com.vsu.project.models.Client;
import com.vsu.project.transfer.Existing;
import com.vsu.project.transfer.New;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BidDto {
    @Null(groups = {New.class}, message = "The field must be empty")
    @NotNull(groups = {Existing.class})
    private Long id;

    @NotNull(groups = {New.class, Existing.class})
    private BidType type;

    @NotNull(groups = {New.class, Existing.class})
    private ApartamentDto apartmentDto;

    @NotNull(groups = {New.class, Existing.class})
    private ClientDto clientDto;

    @NotNull(groups = {New.class, Existing.class})
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Europe/Moscow")
    private Date startDay;

    @NotNull(groups = {New.class, Existing.class})
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Europe/Moscow")
    private Date endDay;

    @NotNull(groups = {New.class, Existing.class})
    private String information;

}
