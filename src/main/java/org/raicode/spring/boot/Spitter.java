package org.raicode.spring.boot;

import java.time.ZonedDateTime;

public class Spitter {

    private Integer id;
    
    private String name;
    private ZonedDateTime date;
    private Boolean active;

    public Spitter() {}

    public Spitter(String name) {
        this.name = name;
        this.date = ZonedDateTime.now();
        this.active = true;
    }

    @Override
    public String toString() {
        return String.format(
                "Spitter[id=%s, name='%s']", id, name);
    }
	
}
