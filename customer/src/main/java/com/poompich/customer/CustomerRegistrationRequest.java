package com.poompich.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
