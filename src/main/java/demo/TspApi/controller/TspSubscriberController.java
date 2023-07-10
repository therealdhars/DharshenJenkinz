package demo.TspApi.controller;

import java.lang.reflect.Field;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.TspApi.Entity.TspMobileNoPlan;
import demo.TspApi.Entity.TspSubscriberNo;
import demo.TspApi.Repo.TspMobilePlanRepo;
import demo.TspApi.Repo.TspSubscriberNoRepo;
import demo.TspApi.response.TspSubscriberResponse;

@RestController
public class TspSubscriberController {
 
	
    @Autowired
	private TspSubscriberNoRepo subrepo;
	
	@Autowired
	private TspMobilePlanRepo tspmobilerepo;
	
//--------------------------------------------------------------------------------------------------------------	
	@GetMapping(value ="/list-tsp-subs/all")
	 public ResponseEntity<TspSubscriberResponse> getTspsubPageResponse(@RequestParam int starts, @RequestParam int counts) {

		    Pageable pageable = PageRequest.of(starts, counts);
		    Page<TspSubscriberNo> tspPage = subrepo.findAll(pageable);
		    TspSubscriberResponse tspResponse = new TspSubscriberResponse(tspPage);

		    return ResponseEntity.ok(tspResponse);
	}
	
//-------------------------------------------------------------------------------------------------------------
	
	@GetMapping(value = "/sub/{phoneNo}")
	public @ResponseBody List<TspSubscriberNo>findByPhoneNo(@PathVariable("phoneNo")Long phoneNo){
	return subrepo.findByphoneNo(phoneNo);
	
	}
	
//--------------------------------------------------------------------------------------------------------------	

	@GetMapping(value = "/view/providers/")
	public @ResponseBody List<TspMobileNoPlan> searchprovider(@RequestParam String provider ) {
     
		return tspmobilerepo.findByprovider(provider);
		
}
//-------------------------------------------------------------------------------------------------------------

	@GetMapping(value = "/view-sub/providers/")
	public @ResponseBody List <TspSubscriberNo> searchprovidersub(@RequestParam String provider) {
     
		return subrepo.findByprovider(provider);
		
}

//--------------------------------------------------------------------------------------------------------------	

	@GetMapping("/")
	public List<TspMobileNoPlan> getallplans() {
	
		
		
		
		return (List<TspMobileNoPlan>) tspmobilerepo.getallplans(6000);
		
		
	}

	
//------------------------------------------------------------------------------------------------------------
   @GetMapping("/test")
   TspSubscriberNo printall() throws IllegalArgumentException, IllegalAccessException{
	   TspSubscriberNo abc = new TspSubscriberNo();
	   for (Field field : abc.getClass().getDeclaredFields()) {
	       field.setAccessible(true);
	       String name = field.getName();
	       Object value = field.get(abc);
	       System.out.printf("%s: %s%n", name, value);
	 }
	 return abc;
}
}


