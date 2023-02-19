package tn.esprit.centraleachat.service.Supplier;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Consumer;
import tn.esprit.centraleachat.entity.Supplier;
import tn.esprit.centraleachat.repository.ConsumerRepository;
import tn.esprit.centraleachat.repository.SupplierRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SupplierService implements ISupplierService {
    @Autowired
    SupplierRepository supplierRepository;


    @Override
    public Supplier addSupplier (Supplier supplier){

        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier UpdateSupplier(Supplier supplier) {

        return supplierRepository.save(supplier);
    }

    @Override
    public void deleteSupplier(int idSupplier) {

        supplierRepository.deleteById(idSupplier);
    }

    @Override
    public List<Supplier> findAllSupplier() {

        return supplierRepository.findAll() ;

    }

    @Override
    public Supplier findByIdSupplier(int idSupplier) throws  Exception {
        return supplierRepository.findById(idSupplier).orElseThrow(()-> new Exception("Supplier n'existe pas"))  ;
    }

    @Override
    public Supplier findByEmailSup(String email) {
        return supplierRepository.findByEmailSup(email);

    }

    @Override
    public Supplier findByPassword(String password) {
        return supplierRepository.findByPassword(password);

    }

    @Override
    public Supplier findByNameSup(String nom) {
        return supplierRepository.findByNameSup(nom);    }


    @Override
    public Supplier findByCinSup(String cin) {
        return supplierRepository.findByCinSup(cin);

    }
}
