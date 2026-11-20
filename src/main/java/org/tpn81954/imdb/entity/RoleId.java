package org.tpn81954.imdb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class RoleId implements Serializable {

    @Column(name = "actor_id")
    private Integer actorId;

    @Column(name = "movie_id")
    private Integer movieId;
}