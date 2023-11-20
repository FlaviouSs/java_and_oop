package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		Double basicQuota = contract.getTotalValue() / months;
		
		
		for(int k = 1; k <= months; k++) {
			LocalDate dueDate = contract.getDate().plusMonths(k);
			Double interest = onlinePaymentService.interest(basicQuota, k);
			Double fee = onlinePaymentService.paymentFee(basicQuota);
			Double quota = basicQuota + interest + fee;
			contract.getInstallmentList().add(new Installment(dueDate, quota));
		}
	}
}
