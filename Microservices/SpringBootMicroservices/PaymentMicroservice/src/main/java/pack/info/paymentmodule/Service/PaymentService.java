package pack.info.paymentmodule.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.info.paymentmodule.DTO.PaymentRequest;
import pack.info.paymentmodule.DTO.PaymentResponse;
import pack.info.paymentmodule.Entity.PaymentEntity;
import pack.info.paymentmodule.Repository.PaymentRepository;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public PaymentResponse getPaymentDetailsById(PaymentRequest internalRequestObj){
        PaymentEntity paymentModel=paymentRepository.getPaymentById(internalRequestObj);
        PaymentResponse paymentResponse=mapModelToResponseDTO(paymentModel);
        return  paymentResponse;
    }

    private PaymentResponse mapModelToResponseDTO(PaymentEntity paymentEntity) {

        PaymentResponse response=new PaymentResponse();
        response.setPaymentId(paymentEntity.getId());
        response.setAmount(paymentEntity.getPaymentAmount());
        response.setCurrency(paymentEntity.getPaymentCurrency());
        return  response;


    }

}
