package br.com.alura.forumhubone.domain.topic;

import br.com.alura.forumhubone.domain.course.Course;
import br.com.alura.forumhubone.domain.topic.dto.CreateTopicDTO;
import br.com.alura.forumhubone.domain.topic.dto.UpdateTopicDTO;
import jakarta.persistence.*;
import br.com.alura.forumhubone.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String text;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    public Topic(CreateTopicDTO createDTO, User user, Course course) {

        this.title = createDTO.title();
        this.text = createDTO.text();
        this.createdAt = LocalDateTime.now();
        this.status = Status.ABERTO;
        this.author = user;
        this.course = course;
    }

    public void update(UpdateTopicDTO updateDTO) {
        if (updateDTO.title() != null) {
            this.title = updateDTO.title();
        }
        if (updateDTO.text() != null) {
            this.text = updateDTO.text();
        }
        if (updateDTO.status() != null) {
            this.status = updateDTO.status();
        }
    }

    public void solved() {
        this.status = Status.SOLUCIONADO;
    }
}
