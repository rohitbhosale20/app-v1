package app.vectordbv1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.vectordbv1.model.DataModel;
@Repository
public interface DataModelRepository extends JpaRepository<DataModel, Long> {

}
