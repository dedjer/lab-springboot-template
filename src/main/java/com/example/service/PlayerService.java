package com.example.service;

import com.example.dto.PlayerProfile;
import com.example.model.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService
{
    Player addPlayer(Player player);

    List<Player> getPlayers();

    void deletePlayer(int id);

    Optional<Player> getPlayer(int id);

    PlayerProfile getPlayerProfile(int id);
}

