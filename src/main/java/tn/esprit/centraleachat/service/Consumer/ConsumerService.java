package tn.esprit.centraleachat.service.Consumer;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Admin;
import tn.esprit.centraleachat.entity.Consumer;
import tn.esprit.centraleachat.repository.ConsumerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ConsumerService implements IConsumerService {
    @Autowired
    ConsumerRepository consumerRepository;


    @Override
    public Consumer addConsumer (Consumer consumer){

        return consumerRepository.save(consumer);
    }

    @Override
    public Consumer UpdateConsumer(Consumer consumer) {

        return consumerRepository.save(consumer);
    }

    @Override
    public void deleteConsumer(int idConsumer) {

        consumerRepository.deleteById(idConsumer);
    }

    @Override
    public List<Consumer> findAllConsumer() {

        return consumerRepository.findAll() ;

    }

    @Override
    public Consumer findByIdConsumer(int idConsumer) throws  Exception {
        return consumerRepository.findById(idConsumer).orElseThrow(()-> new Exception("Consumer n'existe pas"))  ;
    }
    @Override
    public Consumer findByEmail(String email){
        return consumerRepository.findByEmail(email) ;
    }
    @Override
    public Consumer findByPassword( String password) {
        return consumerRepository.findByPassword(password) ;
    }

    @Override
    public Consumer findByName(String nom) {
        return consumerRepository.findByName(nom);
    }

    @Override
    public Consumer findByCin(String cin) {
        return consumerRepository.findByCin(cin);
    }

}
