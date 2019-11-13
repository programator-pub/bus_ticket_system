package pl.connectis.programator.model;

import java.time.LocalDateTime;

public enum ValidUntil {

    _20M(LocalDateTime.now().plusMinutes(20)),
    _24H(LocalDateTime.now().plusHours(24)),
    _30D(LocalDateTime.now().plusDays(30));

    private LocalDateTime validUntil;

    ValidUntil(LocalDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public LocalDateTime getValidUntil() {
        return validUntil;
    }
}
