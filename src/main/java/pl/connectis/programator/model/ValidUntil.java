package pl.connectis.programator.model;

import java.time.LocalDateTime;

public enum ValidUntil {

    _20M(LocalDateTime.now().plus()),
    _24H,
    _30D;

    private LocalDateTime validUntil;

    ValidUntil(LocalDateTime validUntil) {
        this.validUntil = validUntil;
    }
}
