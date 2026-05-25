package tech.project.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.project.api.entity.Tasks;
import tech.project.api.service.TasksService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TasksService service;

    @GetMapping
    public ResponseEntity<List<Tasks>> findAll(){
        List<Tasks> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Tasks> create(@RequestBody Tasks task){
        Tasks tasks = service.create(task);
        return ResponseEntity.ok().body(tasks);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Tasks> update(@RequestBody Long id, @PathVariable Tasks task){
        Tasks tasks = service.update(id, task);
        return ResponseEntity.ok().body(tasks);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Tasks> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }



}
