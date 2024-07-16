package br.com.alura.forumhubone.domain.comment.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateCommentDTO(@NotBlank String text) {
}
