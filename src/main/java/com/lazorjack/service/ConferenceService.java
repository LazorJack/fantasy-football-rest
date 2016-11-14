package com.lazorjack.service;

import com.lazorjack.football.entity.Conference;
import com.lazorjack.repository.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jacklazorchak on 11/6/16.
 */
@Service
public class ConferenceService {

    private ConferenceRepository conferenceRepository;

    @Autowired
    public ConferenceService(ConferenceRepository conferenceRepository){
        this.conferenceRepository = conferenceRepository;
    }

    public Conference create(Conference conference){
        return conferenceRepository.save(conference);
    }

    public Conference getById(Long id){
        return conferenceRepository.findOne(id);
    }

    public Conference getByAbbreviation(String abbreviation){
        return conferenceRepository.findByAbbreviation(abbreviation);
    }

    public Conference update(Conference conference){
        if(conference.getId() == null){
            throw new RuntimeException("Id cannot be null");
        }
        if(getById(conference.getId()) == null){
            throw new RuntimeException("Conference does not exist with id: " + conference.getId());
        }
        return conferenceRepository.save(conference);
    }


}
