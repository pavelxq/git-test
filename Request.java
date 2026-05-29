package com.yanqu.feishu.cmb;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Request {
    private RequestData request;
    private Map<String, Object> signature = new HashMap<>();
}
