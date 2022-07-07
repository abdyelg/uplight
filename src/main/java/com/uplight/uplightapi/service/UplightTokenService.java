package com.uplight.uplightapi.service;

import java.util.Map;

public interface UplightTokenService {

    String permanent(Map<String, String> attributes);

    String expiring(Map<String, String> attributes);

    /**
     * Checks the validity of the given credentials.
     *
     * @param token
     * @return attributes if verified
     */
    Map<String, String> trusted(String token);
}
