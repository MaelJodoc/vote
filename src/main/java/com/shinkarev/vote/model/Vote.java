package com.shinkarev.vote.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by Смена on 07.05.2018.
 */
@Entity
public class Vote extends BaseModel {
    @OneToMany
    private List<VoteItem> voteItems;

    @Column
    private String name = "Were we will eat?";
}
