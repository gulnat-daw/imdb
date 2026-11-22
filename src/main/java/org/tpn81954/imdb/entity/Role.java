package org.tpn81954.imdb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles",
        uniqueConstraints = @UniqueConstraint(columnNames = {"actor_id", "movie_id", "role"}))
@Getter
@Setter
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role", nullable = false)   // empty is allowed, null is not
    private String characterName;

    @ManyToOne(optional = false)
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
