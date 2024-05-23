package com.ibm.services.impl;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ibm.model.RetrievePaymentExecutionWorkstepResponse;
import com.ibm.services.BqPaymentExecutionWorkstepApiServiceI;

@Service
public class BqPaymentExecutionWorkstepApiServiceImpl implements BqPaymentExecutionWorkstepApiServiceI {

private static final Logger logger = LoggerFactory.getLogger(BqPaymentExecutionWorkstepApiServiceImpl.class);

@Override
public RetrievePaymentExecutionWorkstepResponse retrievePaymentExecutionWorkstep(String paymentexecutionid,String paymentexecutionworkstepid) {
    //TODO: Implement Business logic
    return null;
}


}
