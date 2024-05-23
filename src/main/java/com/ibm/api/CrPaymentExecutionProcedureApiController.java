package com.ibm.api;

import com.ibm.model.HTTPError;
import com.ibm.model.InitiatePaymentExecutionProcedureRequest;
import com.ibm.model.InitiatePaymentExecutionProcedureResponse;
import com.ibm.model.RetrievePaymentExecutionProcedureResponse;
import com.ibm.model.UpdatePaymentExecutionProcedureRequest;
import com.ibm.model.UpdatePaymentExecutionProcedureResponse;
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
import com.ibm.services.CrPaymentExecutionProcedureApiServiceI;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CrPaymentExecutionProcedureApiController implements CrPaymentExecutionProcedureApi {

	@Autowired
	CrPaymentExecutionProcedureApiServiceI crPaymentExecutionProcedureApiServiceI;


public ResponseEntity<InitiatePaymentExecutionProcedureResponse> initiate(@Parameter(name = "InitiatePaymentExecutionProcedureRequest", description = "", required = true) @Valid @RequestBody InitiatePaymentExecutionProcedureRequest initiatePaymentExecutionProcedureRequest){
        InitiatePaymentExecutionProcedureResponse res  = crPaymentExecutionProcedureApiServiceI.initiate(initiatePaymentExecutionProcedureRequest);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

public ResponseEntity<RetrievePaymentExecutionProcedureResponse> retrieve(@Parameter(name = "paymentexecutionid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("paymentexecutionid") String paymentexecutionid){
        RetrievePaymentExecutionProcedureResponse res  = crPaymentExecutionProcedureApiServiceI.retrieve(paymentexecutionid);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

public ResponseEntity<UpdatePaymentExecutionProcedureResponse> update(@Parameter(name = "paymentexecutionid", description = "", required = true, in = ParameterIn.PATH) @PathVariable("paymentexecutionid") String paymentexecutionid,@Parameter(name = "UpdatePaymentExecutionProcedureRequest", description = "", required = true) @Valid @RequestBody UpdatePaymentExecutionProcedureRequest updatePaymentExecutionProcedureRequest){
        UpdatePaymentExecutionProcedureResponse res  = crPaymentExecutionProcedureApiServiceI.update(paymentexecutionid,updatePaymentExecutionProcedureRequest);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
    

}
