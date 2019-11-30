package com.michael.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.michael.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
