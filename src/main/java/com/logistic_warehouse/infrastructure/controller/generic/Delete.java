package com.logistic_warehouse.infrastructure.controller.generic;

import org.springframework.http.ResponseEntity;

public interface Delete<ID,Entity>{
    ResponseEntity<?> delete(ID id);
}
