package com.decify.swaggerapp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(description = "Contact details")
public class Contact {
    @ApiModelProperty(notes = "contact id")
    private String id;
    @ApiModelProperty(notes = "contact name")
    private String name;
    @ApiModelProperty(notes = "contact number")
    private String phoneNumber;
}
