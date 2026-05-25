package tech.project.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.project.api.entity.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Long> {
}
