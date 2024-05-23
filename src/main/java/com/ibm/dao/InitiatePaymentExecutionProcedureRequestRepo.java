package com.ibm.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;
import org.springframework.stereotype.Repository;
import com.ibm.model.InitiatePaymentExecutionProcedureRequest;

@Repository
public interface InitiatePaymentExecutionProcedureRequestRepo extends MongoRepository<InitiatePaymentExecutionProcedureRequest,String>{

}
