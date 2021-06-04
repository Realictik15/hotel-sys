package com.vsu.project.dto;

import com.vsu.project.models.RoomType;
import com.vsu.project.transfer.Existing;
import com.vsu.project.transfer.New;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ApartamentDto {
    @Null(groups = {New.class}, message = "The field must be empty")
    @NotNull(groups = {Existing.class})
    private Long idRoom;

    @NotNull(groups = {New.class, Existing.class})
    private Integer counOfRooms;

    @NotNull(groups = {New.class, Existing.class})
    private Integer floor;

    @NotNull(groups = {New.class, Existing.class})
    private RoomType type;

    @NotNull(groups = {New.class, Existing.class})
    private Integer price;

    @NotNull(groups = {New.class, Existing.class})
    private String information;

}
