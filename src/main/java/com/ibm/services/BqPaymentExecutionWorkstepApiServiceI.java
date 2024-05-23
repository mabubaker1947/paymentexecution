package com.ibm.services;

import com.ibm.model.RetrievePaymentExecutionWorkstepResponse;

public interface BqPaymentExecutionWorkstepApiServiceI {

    RetrievePaymentExecutionWorkstepResponse retrievePaymentExecutionWorkstep(String paymentexecutionid,String paymentexecutionworkstepid);


}
