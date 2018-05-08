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

    public Vote(List<VoteItem> voteItems) {
        this.voteItems = voteItems;
    }

    public Vote(List<VoteItem> voteItems, String name) {
        this.voteItems = voteItems;
        this.name = name;
    }

    public Vote() {
    }

    public List<VoteItem> getVoteItems() {
        return voteItems;
    }

    public void setVoteItems(List<VoteItem> voteItems) {
        this.voteItems = voteItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
