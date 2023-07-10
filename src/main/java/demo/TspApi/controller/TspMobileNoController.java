package demo.TspApi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.TspApi.Entity.TspMobileNoPlan;
import demo.TspApi.Repo.TspMobilePlanRepo;
import demo.TspApi.utils.PhoneNoUtils;

@RestController
public class TspMobileNoController {


	@Autowired
	private TspMobilePlanRepo tspmobilerepo;
	
	
//------------------------------------------------------------------------------------------------------------	
	@GetMapping(value ="/list-tsp-num/all")
	public ResponseEntity <List<TspMobileNoPlan>> findAllplans(){
		return ResponseEntity.ok(tspmobilerepo.findAll());
	}
	
//------------------------------------------------------------------------------------------------------------	

	@GetMapping(value = "/plan/{numSeries}")
	public @ResponseBody List<TspMobileNoPlan> findBynumSeries(@PathVariable("numSeries")Integer numSeries) {
    return tspmobilerepo.findBynumSeries(numSeries);
	}
	
//------------------------------------------------------------------------------------------------------------   
	
	@GetMapping(value = "/provider-details/{phoneNo}")
	public ResponseEntity<List<TspMobileNoPlan>> getProvider(@PathVariable("phoneNo") Long phoneNo ) {
		
        long trimPhoneNo =PhoneNoUtils.trimPhoneNumber(phoneNo);
		Integer numSeries = (int) trimPhoneNo;
		
			
		return ResponseEntity.ok(tspmobilerepo.searchSeries(numSeries));
		
		}
		
//------------------------------------------------------------------------------------------------------------
}


