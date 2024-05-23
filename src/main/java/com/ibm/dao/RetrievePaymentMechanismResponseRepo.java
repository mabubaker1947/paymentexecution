package com.ibm.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;
import org.springframework.stereotype.Repository;
import com.ibm.model.RetrievePaymentMechanismResponse;

@Repository
public interface RetrievePaymentMechanismResponseRepo extends MongoRepository<RetrievePaymentMechanismResponse,String>{

}
