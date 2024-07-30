package pack.info.paymentmodule.Repository;


import org.springframework.stereotype.Repository;
import pack.info.paymentmodule.DTO.PaymentRequest;
import pack.info.paymentmodule.Entity.PaymentEntity;
@Repository
public class  PaymentRepository {
    public PaymentEntity getPaymentById(PaymentRequest request){
        PaymentEntity paymentModel=executeQuery(request);
        return paymentModel;
    }

    private PaymentEntity executeQuery(PaymentRequest request) {

        PaymentEntity payment=new PaymentEntity();
        payment.setId(request.getPaymentId());
        payment.setPaymentCurrency("INR");
        payment.setPaymentAmount(1000.00);
        return payment;
    }
}
