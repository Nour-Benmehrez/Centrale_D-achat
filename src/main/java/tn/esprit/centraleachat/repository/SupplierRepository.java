package tn.esprit.centraleachat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.centraleachat.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier,Integer> {

    public Supplier findByEmailSup( String email);
    public Supplier findByPassword( String password);
    public Supplier findByNameSup( String nom);
    public Supplier findByCinSup( String cin);

}
