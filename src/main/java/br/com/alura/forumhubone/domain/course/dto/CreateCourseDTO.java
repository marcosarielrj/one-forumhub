package br.com.alura.forumhubone.domain.course.dto;

import br.com.alura.forumhubone.domain.course.Categories;
import jakarta.validation.constraints.NotBlank;

public record CreateCourseDTO(@NotBlank String name, Categories category) {

}
