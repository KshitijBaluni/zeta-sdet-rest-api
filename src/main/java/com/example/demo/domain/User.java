package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;

/**
 * User Domain Object Class.
 *
 * @author kshitijbaluni
 * @since 25 June 2023
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column(columnDefinition = "TEXT")
    private String email;
    @Column(columnDefinition = "TEXT")
    private String name;
    @Column(columnDefinition = "TEXT")
    private String gender;
    @Column(columnDefinition = "TEXT")
    private String status;
}
