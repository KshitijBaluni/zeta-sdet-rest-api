package com.example.demo.domain;

import lombok.*;

/**
 * User Domain Object Class.
 *
 * @author kshitijbaluni
 * @since 25 June 2023
 */
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Builder
public class User {
    private long id;
    private String email;
    private String name;
    private String gender;
    private String status;
}
