package demo.TspApi.Repo;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import demo.TspApi.Entity.TspMobileNoPlan;



public interface TspMobilePlanRepo extends JpaRepository <TspMobileNoPlan,Integer> {


	List<TspMobileNoPlan> findBynumSeries(Integer numSeries);
     
	@Query(value = "SELECT * FROM tsp_mobile_num_plan WHERE num_series =?1", nativeQuery = true)
	List<TspMobileNoPlan> searchSeries(@Param("num_series")Integer num_series);

	List<TspMobileNoPlan> findByprovider(String provider);
	
	@Query(value="select * from tsp_mobile_num_plan where num_series=?1",nativeQuery = true)
	List<TspMobileNoPlan> getallplans(Integer num_series);
    }

