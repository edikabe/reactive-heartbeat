package com.github.julglotain.labs;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * Created by jug on 29/03/2017.
 */
@Data
@AllArgsConstructor
public class Event {

    public long id;
    public Date when;

}
