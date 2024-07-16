package br.com.alura.forumhubone.domain.topic.dto;

import br.com.alura.forumhubone.domain.topic.Status;

public record UpdateTopicDTO(
        String title,
        String text,
        Status status
) {
}
