package com.lazorjack.repository;

import com.lazorjack.football.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jacklazorchak on 11/6/16.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
