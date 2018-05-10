package com.shinkarev.vote;

import com.shinkarev.vote.model.Dish;
import com.shinkarev.vote.model.Vote;
import com.shinkarev.vote.model.VoteItem;
import com.shinkarev.vote.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class VoteApplication {
    private static VoteRepository voteRepository;

    @Autowired
    public VoteApplication(VoteRepository voteRepository) {
        VoteApplication.voteRepository = voteRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(VoteApplication.class, args);
        Vote vote = new Vote("Vote", Arrays.asList(
                new VoteItem("BurgerKing", Arrays.asList(
                        new Dish("Hamburger", 100_00),
                        new Dish("Coffee", 70_00),
                        new Dish("Coca-cola", 50_00))),
                new VoteItem("Avenu", Arrays.asList(
                        new Dish("Salad", 110_00),
                        new Dish("Meat", 220_00),
                        new Dish("Tea", 60_00)
                ))));

 /*       Vote vote = new Vote();
        vote.setName("Were we will eat?");
        vote.setVoteItems(Arrays.asList(
                new VoteItem(vote, "BurgerKing", Arrays.asList(
                        new Dish("Hamburger", 100_00),
                        new Dish("Coffee", 70_00),
                        new Dish("Coca-cola", 50_00))),
                new VoteItem(vote, "Avenu", Arrays.asList(
                        new Dish("Salad", 110_00),
                        new Dish("Meat", 220_00),
                        new Dish("Tea", 60_00)
                ))));*/


        voteRepository.save(vote);
        vote = voteRepository.findAll().get(0);
        System.out.println(vote);
        System.out.println('\n' + "cache in work");
        vote = voteRepository.findAll().get(0);
        System.out.println(vote);
        vote = voteRepository.findAll().get(0);
        System.out.println(vote);
        vote = voteRepository.findAll().get(0);
        System.out.println(vote);
    }
}
