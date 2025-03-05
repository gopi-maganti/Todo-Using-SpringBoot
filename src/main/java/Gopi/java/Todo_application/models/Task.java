package Gopi.java.Todo_application.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, name = "ID")
    private Long id;
    
    @Column(nullable = false, name = "TITLE")
    private String title;
    
    @Column(nullable = false, name = "DESCRIPTION")
    private String description;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "STATUS")
    private TaskStatus status;
}
