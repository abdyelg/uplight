package com.uplight.uplightapi.controller;

import com.uplight.uplightapi.service.UplightTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UplightController {

    @NonNull
    @Autowired
    UplightTokenService tokenService;

    @PostMapping("generate-token")
    @ResponseBody
    public String createToken(
            @NotNull @RequestParam("message") final String data) {
        final Map<String, String> map = new HashMap<>();
        map.put("message", data);
        return tokenService.expiring(map);
    }

    @PostMapping("validate-token")
    @ResponseBody
    public Map<String, String> validateToken(
            @NotNull @RequestParam("token") final String token) {
        return tokenService.trusted(token);
    }
}
