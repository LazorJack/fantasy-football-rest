package com.lazorjack.service;

import com.lazorjack.repository.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jacklazorchak on 11/6/16.
 */
@Service
public class LeagueService {

    private LeagueRepository leagueRepository;

    @Autowired
    public LeagueService(LeagueRepository leagueRepository){
        this.leagueRepository = leagueRepository;
    }


}
