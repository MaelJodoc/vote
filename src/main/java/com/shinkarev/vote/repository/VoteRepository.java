package com.shinkarev.vote.repository;

import com.shinkarev.vote.model.Vote;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Смена on 08.05.2018.
 */
public interface VoteRepository extends CrudRepository<Vote, Long> {
    Vote getVoteById(Long id);
}
