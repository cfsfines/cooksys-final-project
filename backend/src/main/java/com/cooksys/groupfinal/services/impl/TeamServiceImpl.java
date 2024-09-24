package com.cooksys.groupfinal.services.impl;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.cooksys.groupfinal.dtos.ProjectDto;
import com.cooksys.groupfinal.entities.Team;
import com.cooksys.groupfinal.mappers.ProjectMapper;
import com.cooksys.groupfinal.mappers.TeamMapper;
import com.cooksys.groupfinal.repositories.TeamRepository;
import com.cooksys.groupfinal.services.TeamService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {
	
	private final TeamRepository teamRepository;
	private final TeamMapper teamMapper;
	private final ProjectMapper projectMapper; 
	
	@Override
	public int getNumOfTeamProjects(Long id) {
		Team team = teamRepository.getReferenceById(id);
		return team.getProjects().size();
	}

}
