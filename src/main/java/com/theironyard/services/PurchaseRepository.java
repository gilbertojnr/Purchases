package com.theironyard.services;
import com.theironyard.entities.Purchase;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * Created by gilbertakpan on 1/14/17.
 */
public interface PurchaseRepository extends CrudRepository<Purchase, Integer>{
List<Purchase> findByCategory(String category);
}
