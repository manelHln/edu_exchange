package org.project.backapi.controller;

import org.project.backapi.domain.User;
import org.project.backapi.dto.modelsDto.ConversationDto;
import org.project.backapi.dto.modelsDto.MessageDto;
import org.project.backapi.dto.response.PagedResponse;
import org.project.backapi.repository.UserRepository;
import org.project.backapi.service.MessageService;
import org.project.backapi.utils.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conversations")
public class ConversationController {

}
