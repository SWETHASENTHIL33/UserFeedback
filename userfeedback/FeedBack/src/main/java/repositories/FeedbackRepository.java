package repositories;



import org.springframework.data.repository.CrudRepository;

import entities.Feedback;



public interface FeedbackRepository extends CrudRepository<Feedback, Integer>{

}
