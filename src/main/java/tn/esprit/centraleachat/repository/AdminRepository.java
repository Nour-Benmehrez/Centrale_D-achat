package tn.esprit.centraleachat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.centraleachat.entity.Admin;
import tn.esprit.centraleachat.entity.Consumer;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

    public Admin findByEmailAndPassword(String email,String password);
}
