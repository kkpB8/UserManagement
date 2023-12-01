package com.User.Management.Service.DTO.Request;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class RequestData<T> {


    private String txnId= UUID.randomUUID().toString();
    private List<T> requestList;
    private T request;

}
