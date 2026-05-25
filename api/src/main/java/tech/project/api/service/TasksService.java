package tech.project.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import tech.project.api.entity.Tasks;
import tech.project.api.repository.TasksRepository;

import java.util.List;

@Service
public class TasksService {

    @Autowired
    private TasksRepository repository;

    public List<Tasks> findAll() {
        Sort sort = Sort.by("prioridade").descending()
                .and(Sort.by("nome").ascending());

        return repository.findAll(sort);
    }

    public Tasks create(Tasks tasks){
        return repository.save(tasks);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Tasks update(Long id, Tasks tasksAtualizada){
        if(repository.existsById(id)){
            tasksAtualizada.setId(id);
            return repository.save(tasksAtualizada);
        }
        throw new RuntimeException("tarefa não encontrada");
    }

}
