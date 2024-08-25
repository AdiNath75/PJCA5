package org.idrice2.repositories;

public interface EmailSender {
    void send(String to, String email);
}
