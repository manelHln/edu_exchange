package org.project.backapi.controller;

import lombok.RequiredArgsConstructor;
import org.project.backapi.domain.User;
import org.project.backapi.dto.modelsDto.MessageDto;
import org.project.backapi.repository.UserRepository;
import org.project.backapi.service.MessageService;
import org.project.backapi.utils.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {

}
