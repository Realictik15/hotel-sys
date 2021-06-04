package com.vsu.project.dto;

import com.vsu.project.models.Bid;
import com.vsu.project.transfer.Existing;
import com.vsu.project.transfer.New;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BillDto {

    @Null(groups = {New.class}, message = "The field must be empty")
    @NotNull(groups = {Existing.class})
    private Long id;

    @NotNull(groups = {New.class, Existing.class})
    private BidDto bidDto;

    @NotNull(groups = {New.class, Existing.class})
    private Long price;

    @NotNull(groups = {New.class, Existing.class})
    private String info;
}
