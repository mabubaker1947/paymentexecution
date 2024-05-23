package com.ibm.api;

import com.ibm.model.HTTPError;
import com.ibm.model.RetrievePaymentMechanismResponse;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.ibm.services.BqPaymentMechanismApiServiceI;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class BqPaymentMechanismApiController implements BqPaymentMechanismApi {

	@Autowired
	BqPaymentMechanismApiServiceI bqPaymentMechanismApiServiceI;


public ResponseEntity<RetrievePaymentMechanismResponse> retrievePaymentMechanism(@Parameter(name = "paymentexecutionid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("paymentexecutionid") String paymentexecutionid,@Parameter(name = "paymentmechanismid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("paymentmechanismid") String paymentmechanismid){
        RetrievePaymentMechanismResponse res  = bqPaymentMechanismApiServiceI.retrievePaymentMechanism(paymentexecutionid,paymentmechanismid);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

}
