package com.logistic_warehouse.application.handleerror;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class ErrorSimple {

    private Integer code;

    private String status;

    private String message;

}
