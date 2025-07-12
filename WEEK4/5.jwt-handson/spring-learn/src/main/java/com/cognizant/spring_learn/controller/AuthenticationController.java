package com.cognizant.spring_learn.controller;

import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.Jwts;

import java.util.Base64;
import java.util.Date;

@RestController
public class AuthenticationController {

    private final Logger  LOGGER = LoggerFactory.getLogger(AuthenticationController.class);
    private static final String SECRET_KEY = "monkeydluffy";

    @RequestMapping(value ="/authenticate", method = RequestMethod.GET)
    public TokenResponse authenticate(HttpServletRequest request) {

        LOGGER.info("statsdtd");
        String authHeader = request.getHeader("Authorization");


        if (authHeader == null || !authHeader.startsWith("Basic ")){
            throw  new RuntimeException("Missing or invalid headers");
        }

        String base64creds = authHeader.substring("Basic ".length());
        byte[] credDecoded = Base64.getDecoder().decode(base64creds);
        String creds = new String(credDecoded);

        String[] values = creds.split(":", 2);

        String username = values[0];
        String password = values[1];


        if (!"user".equals(username) || !"pwd".equals(password)) {
            throw new RuntimeException("Invalid creds!");
        }

        String token = Jwts.builder().setSubject(username).setIssuedAt(new Date(System.currentTimeMillis())).setExpiration(new Date(System.currentTimeMillis()+ 10*60*1000)).signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();

        return new TokenResponse(token);


    }

    static class TokenResponse{
        private String token;

        public TokenResponse(){}

        public TokenResponse(String token){
            this.token = token;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
