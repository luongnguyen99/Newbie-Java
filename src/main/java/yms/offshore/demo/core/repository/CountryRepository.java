/**
 * 
 */
package yms.offshore.demo.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import yms.offshore.demo.core.model.Country;

/**
 * @author LUONG
 *
 */

@Repository
public interface CountryRepository extends CrudRepository<Country, Long>{
	@Query("SELECT e FROM Country e WHERE e.id = :id")
	List<Country> findByIdCustom(@Param("id") Long id);
	
}	
