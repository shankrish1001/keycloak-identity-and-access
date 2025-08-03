package com.shankrish.keycloakidentityandaccess;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/keycloak")
public class KeycloakController {
    @GetMapping
    @PreAuthorize("hasRole('client_user_2')")
    public String helloFromUser() {
        return "Hello from user-keycloak";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('client_admin_2')")
    public String helloFromAdmin() {
        return "Hello from admin-keycloak";
    }

}
