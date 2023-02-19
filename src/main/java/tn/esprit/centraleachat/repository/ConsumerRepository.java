package tn.esprit.centraleachat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.centraleachat.entity.Consumer;

public interface ConsumerRepository extends JpaRepository<Consumer,Integer> {

   public Consumer findByEmail( String email);
    public Consumer findByPassword( String password);
    public Consumer findByName( String nom);
    public Consumer findByCin( String cin);

}
