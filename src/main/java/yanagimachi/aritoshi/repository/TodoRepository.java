package yanagimachi.aritoshi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import yanagimachi.aritoshi.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
