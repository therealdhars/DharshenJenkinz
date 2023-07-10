package demo.TspApi.Repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import demo.TspApi.Entity.TspSubscriberNo;


public interface TspSubscriberNoRepo extends JpaRepository <TspSubscriberNo,Long> {
   
	List<TspSubscriberNo>findByphoneNo(Long phoneNo);
  
	List<TspSubscriberNo> findByprovider(String provider);
	
   @Transactional
   @Modifying
   @Query(value="update tsp_phone_subscriber set is_success =?1",nativeQuery = true)

   void updateSuccess(Boolean isSuccess);
   
   @Query(value="select * from tsp_phone_subscriber",nativeQuery = true)
   List<TspSubscriberNo> getallsubs();
}