package com.ibm.services;

import com.ibm.model.RetrievePaymentMechanismResponse;

public interface BqPaymentMechanismApiServiceI {

    RetrievePaymentMechanismResponse retrievePaymentMechanism(String paymentexecutionid,String paymentmechanismid);


}
