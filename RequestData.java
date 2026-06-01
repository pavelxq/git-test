package com.yanqu.feishu.cmb;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class RequestData {
    private Map<String, Object> body = new HashMap<>();
    private Map<String, Object> head = new HashMap<>();
}
