package org.raicode.spring.boot;

import java.time.ZonedDateTime;
import org.springframework.data.annotation.Id;

public class Spittle {
	
	@Id
    private Integer id;

    private Integer userId;
    private String spittle;
    private ZonedDateTime date;
    private Boolean active;

    public Spittle() {}

    public Spittle(Integer userId, String spittle) {
        this.userId = userId;
        this.spittle = spittle;
        this.date = ZonedDateTime.now();
        this.active = true;
    }

    @Override
    public String toString() {
        return String.format(
                "Spittle[id=%s, userId='%d', spittle='%s']",
                id, userId, spittle);
    }

}
