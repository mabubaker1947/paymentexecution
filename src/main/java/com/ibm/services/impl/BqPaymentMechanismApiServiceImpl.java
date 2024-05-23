package com.ibm.services.impl;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ibm.model.RetrievePaymentMechanismResponse;
import com.ibm.services.BqPaymentMechanismApiServiceI;

@Service
public class BqPaymentMechanismApiServiceImpl implements BqPaymentMechanismApiServiceI {

private static final Logger logger = LoggerFactory.getLogger(BqPaymentMechanismApiServiceImpl.class);

@Override
public RetrievePaymentMechanismResponse retrievePaymentMechanism(String paymentexecutionid,String paymentmechanismid) {
    //TODO: Implement Business logic
    return null;
}


}
