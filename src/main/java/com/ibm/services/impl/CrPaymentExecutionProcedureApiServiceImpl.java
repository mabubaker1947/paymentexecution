package com.ibm.services.impl;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.ibm.model.InitiatePaymentExecutionProcedureRequest;
import com.ibm.model.InitiatePaymentExecutionProcedureResponse;
import com.ibm.model.UpdatePaymentExecutionProcedureResponse;
import com.ibm.model.UpdatePaymentExecutionProcedureRequest;
import com.ibm.model.RetrievePaymentExecutionProcedureResponse;
import com.ibm.services.CrPaymentExecutionProcedureApiServiceI;

@Service
public class CrPaymentExecutionProcedureApiServiceImpl implements CrPaymentExecutionProcedureApiServiceI {

private static final Logger logger = LoggerFactory.getLogger(CrPaymentExecutionProcedureApiServiceImpl.class);

@Override
public InitiatePaymentExecutionProcedureResponse initiate(InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest) {
    //TODO: Implement Business logic
    return null;
}

@Override
public UpdatePaymentExecutionProcedureResponse update(String paymentexecutionid,UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest) {
    //TODO: Implement Business logic
    return null;
}

@Override
public RetrievePaymentExecutionProcedureResponse retrieve(String paymentexecutionid) {
    //TODO: Implement Business logic
    return null;
}


}
