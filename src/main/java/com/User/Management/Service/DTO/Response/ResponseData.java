package com.User.Management.Service.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ResponseData {

  private Object data;
  private String message;
  private  String txnId;



}
