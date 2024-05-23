package com.ibm.services;

import com.ibm.model.InitiatePaymentExecutionProcedureRequest;
import com.ibm.model.InitiatePaymentExecutionProcedureResponse;
import com.ibm.model.UpdatePaymentExecutionProcedureResponse;
import com.ibm.model.UpdatePaymentExecutionProcedureRequest;
import com.ibm.model.RetrievePaymentExecutionProcedureResponse;

public interface CrPaymentExecutionProcedureApiServiceI {

    InitiatePaymentExecutionProcedureResponse initiate(InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest);

    UpdatePaymentExecutionProcedureResponse update(String paymentexecutionid,UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest);

    RetrievePaymentExecutionProcedureResponse retrieve(String paymentexecutionid);


}
