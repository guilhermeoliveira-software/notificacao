package com.costadev.notificacao.controller;

import com.costadev.notificacao.business.dto.TarefasDTO;
import com.costadev.notificacao.business.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/emails")
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/enviar")
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefasDTO tarefaDTO) {
        emailService.enviarEmail(tarefaDTO);
        return ResponseEntity.ok().build();
    }
}
