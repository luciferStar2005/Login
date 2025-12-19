package org.caletortiz.authlogin.user.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Builder
@Getter
@Table(name="users")
public class User {
    @Id
    private UUID id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name="password_hash", nullable = false)
    private String passwordHash;

    private boolean active;

    @Column(name="created_at")
    private OffsetDateTime createdAt;

    protected User(){
    }

    @PrePersist
    private void onCreate() {
        this.createdAt = OffsetDateTime.now();
    }
}
