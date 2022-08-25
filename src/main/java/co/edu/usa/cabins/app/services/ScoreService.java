package co.edu.usa.cabins.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usa.cabins.app.models.Score;
import co.edu.usa.cabins.app.repository.ScoreRepository;

@Service
public class ScoreService {
    
    @Autowired
    private ScoreRepository repository;

    public List<Score> getAll() {
        return repository.findAll();
    }

    public Score getById(Integer id) {
        return repository.findById(id);
    }

    /* public Score save(Score score) {
        if (score.getIdS() == null) {
            return repository.save(score);
        } else {
            if (repository.findById(score.getId()) == null) {
                return repository.save(score);
            } else {
                return score;
            }
        }
    }

    public Score update(Score score){
        if(score.getId() != null){
            Score newScore = repository.findById(score.getId());
            if(newScore != null){
                if(score.getName() != null) {
                    newScore.setName(score.getName());
                }
                if(score.getDescription() != null){
                    newScore.setDescription(score.getDescription());
                }
                return repository.save(newScore);
            }else{
                return score;
            }
        }else{
            return score;
        }
    } */
    
    public void delete(Score score) {
        repository.delete(score);
    }
}
