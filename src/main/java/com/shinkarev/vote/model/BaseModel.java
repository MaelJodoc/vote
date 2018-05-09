package com.shinkarev.vote.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Смена on 07.05.2018.
 */
@MappedSuperclass
public abstract class BaseModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long id;

}
