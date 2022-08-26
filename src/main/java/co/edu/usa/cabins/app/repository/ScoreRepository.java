package co.edu.usa.cabins.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.usa.cabins.app.models.Score;
import co.edu.usa.cabins.app.repository.crud.ScoreCrudRepository;

@Repository
public class ScoreRepository {
    @Autowired
    private ScoreCrudRepository repository;

    /**
     * @return
     */
    public List<Score> findAll() {
        return (List<Score>) repository.findAll();
    }

    /**
     * @param id
     * @return
     * 
     */
    public Score findById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    
    public Score save(Score score) {
        return repository.save(score);
    }

    public void delete(Score score) {
        repository.delete(score);
    }
}
