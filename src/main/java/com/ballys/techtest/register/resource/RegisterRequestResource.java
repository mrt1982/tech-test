package com.ballys.techtest.register.resource;

import com.ballys.techtest.register.model.RegisterRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class RegisterRequestResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegisterRequestResource.class);

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void register(@RequestBody RegisterRequest registerRequest) {
        LOGGER.info("NEW USER: {}", registerRequest);
    }
}
