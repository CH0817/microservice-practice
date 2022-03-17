package tw.com.rex.microservicepractice.trade.service;

import tw.com.rex.microservicepractice.trade.web.controller.request.IncomeRequest;

public interface IncomeService {

    boolean save(IncomeRequest income);

}
