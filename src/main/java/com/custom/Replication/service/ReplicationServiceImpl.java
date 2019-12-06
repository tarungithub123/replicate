package com.custom.Replication.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.custom.Replication.DTO.CoreCustomerCollection;
import com.custom.Replication.DTO.CoreCustomerDTO;
import com.custom.Replication.DTO.ModListKeyDto;
import com.custom.Replication.DTO.ResponseDtoWrapper;
import com.custom.Replication.entity.CmcTmCoreCustomer;
import com.custom.Replication.entity.ReplicationDetails;

@Repository
@Transactional
public class ReplicationServiceImpl implements ReplicationService {

	private static final int TIMEOUT = 10000;
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<ReplicationDetails> getkeyvalues() {
		
	System.out.println("Inside the service");
	
	postcustomer("9090008");
	
	//querycustomer("9090005"); //("a3964cf3-6942-4021-b783-3ae4a6b88169");
	
	List<Integer> Id = new ArrayList<Integer>(); 
    
	Id.add(1);
	//approvecustomer(Id); 
	
		Query query = entityManager.createNamedQuery("query_find_all_key", ReplicationDetails.class);

		System.out.println("Calling query customer");

		return query.getResultList();

	}

	public void postcustomer(String customerno) {

		System.out.println("Inside the service");

		Query query = entityManager.createNamedQuery("QueryByCustomerNo", CmcTmCoreCustomer.class)
				.setParameter("customerNo", customerno);

		List<CmcTmCoreCustomer> corecustomer = query.getResultList();
		String responseMessage = null ; 

		// CmcTmCoreCustomer corecustomer = new CmcTmCoreCustomer();

		for (CmcTmCoreCustomer customer : corecustomer) {
			final String uri = "http://10.40.81.185:8017/cmc-customer-services/corecustomers";
			Map<String, String> map = null;
			System.out.println("customer " + customer.toString());
			System.out.println("Calling the template");

			RestTemplate restTemplate = new RestTemplate();

			HttpHeaders httpHeaders = getHttpHeader(map);
			HttpEntity<CmcTmCoreCustomer> request = new HttpEntity<>(customer, httpHeaders);

			// ResponseEntity<CmcTmCoreCustomer> result = restTemplate.postForEntity(uri,
			// request, CmcTmCoreCustomer.class);

			ResponseEntity<ResponseDtoWrapper> result = restTemplate.exchange(uri, HttpMethod.POST, request, ResponseDtoWrapper.class);

			if (result.getStatusCodeValue() == 201) {
				responseMessage = result.getBody().getMessages().toString();
				//responseMessage = result.getBody().getMessages().toString();
			}
			// ResponseEntity result = restTemplate.exchange(uri, HttpMethod.POST,
			// entity,corecustomer, CmcTmCoreCustomer.class);
			System.out.println(" response after post call" + result.getStatusCode() + result.getStatusCodeValue());
			System.out.println("Trying to print the body" + result.getBody().getMessages().toString() );
			System.out.println("Trying to print the body" + result.getBody().getMessages().getKeyId().toString() );
		}

	}

	public ResponseEntity querycustomer(String customerno) {

		final String uri = "http://10.40.81.185:8017/cmc-customer-services/corecustomers?includecloseandunauth=true&customerNo=9090005";
		
		Map<String, String> map = null;
		 System.out.println("inside query customer ");
		 System.out.println("inside query Calling the template");

		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders httpHeaders = getHttpHeader(map);

		HttpEntity<CmcTmCoreCustomer> request = new HttpEntity<>(httpHeaders);

		Map<String, String> params = new HashMap<String, String>();
		params.put("includecloseandunauth", "true");
		params.put("customerNo", customerno);
		
		ResponseEntity<CoreCustomerCollection> corecustomer = restTemplate.exchange(uri, HttpMethod.GET, request, CoreCustomerCollection.class);
		System.out.println("inside query header customer after >> " + corecustomer.getStatusCode());
		System.out.println("inside query customer after >> " + corecustomer.getBody().getData().toString());
		List<CoreCustomerDTO> coreCustomerDtoList = corecustomer.getBody().getData(); 
		
		for (CoreCustomerDTO customerDTO : coreCustomerDtoList ) {
			System.out.println("Values fetched are " + customerDTO.getCustomerNo());
		}
		 
		return corecustomer;

	}

	
	public void  approvecustomer(List<Integer> Id) {
			
final String uri = "http://10.40.81.185:8017/cmc-customer-services/corecustomers/{id}/approve";
		
		Map<String, String> map = null;
		 System.out.println("inside query customer ");
		 System.out.println("inside query Calling the template");


		HttpHeaders httpHeaders = getHttpHeader(map);

		
		ModListKeyDto modkeylist = new ModListKeyDto();
		modkeylist.setModNos(Id);
		
		HttpEntity<ModListKeyDto> request = new HttpEntity<>(modkeylist, httpHeaders);
		
		RestTemplate restTemplate = new RestTemplate();
		String params = "9966ab4c-3582-462c-b574-a2616a5f6a6c";

		
		 HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		 requestFactory.setConnectTimeout(TIMEOUT); 
		 requestFactory.setReadTimeout(TIMEOUT);  
		 restTemplate.setRequestFactory(requestFactory);
		
		
		ResponseEntity<ResponseDtoWrapper> keylist = restTemplate.exchange(uri, HttpMethod.PATCH, request, ResponseDtoWrapper.class,params);
		System.out.println("inside query header customer after >> " + keylist.getBody().getMessages());
		//System.out.println("inside query customer after >> " + corecustomer.getBody().getData().toString());
		//List<CoreCustomerDTO> coreCustomerDtoList = corecustomer.getBody().getData(); 
		
		
	}
	private HttpHeaders getHttpHeader(Map<String, String> map) {

		HttpHeaders header = new HttpHeaders();
		header.add("userId", "OBMOADMIN1");
		header.add("branchCode", "001");
		header.add("appId", "CMNCORE");
		header.add("sourceCode", "EXTSYS");
		header.add("source", "EXTSYS");
		header.add("Content-Type", "application/json");
		header.add("Accept", "application/json");
		return header;
	}
	

}
