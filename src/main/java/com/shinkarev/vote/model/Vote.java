package com.shinkarev.vote.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Смена on 07.05.2018.
 */
@Entity
public class Vote extends AbstractPersistable<Long> {
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "vote_id")
    @Fetch(FetchMode.SUBSELECT)
    private List<VoteItem> voteItems;

    @Column
    private String name = "Were we will eat?";

    public Vote(List<VoteItem> voteItems) {
        this.voteItems = voteItems;
    }

    public Vote(String name, List<VoteItem> voteItems) {
        this.name = name;
        this.voteItems = voteItems;
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

    @Override
    public String toString() {
        return "Vote{" +
                "voteItems=" + voteItems +
                ", name='" + name + '\'' +
                ", id=" + getId() +
                '}';
    }
}
