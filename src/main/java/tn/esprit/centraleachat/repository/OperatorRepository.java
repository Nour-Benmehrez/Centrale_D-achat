package tn.esprit.centraleachat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.centraleachat.entity.Operator;

public interface OperatorRepository extends JpaRepository<Operator,Integer> {

public Operator findByEmailOp(String email);
    public Operator findByNameOp(String nom);
    public Operator findByPassword(String password);
    public Operator findByCinOp(String cin);

}
