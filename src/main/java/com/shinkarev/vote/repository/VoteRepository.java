package com.shinkarev.vote.repository;

import com.shinkarev.vote.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Смена on 08.05.2018.
 */
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Vote getVoteById(Long id);
}
