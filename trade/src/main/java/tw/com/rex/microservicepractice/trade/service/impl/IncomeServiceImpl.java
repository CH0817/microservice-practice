package tw.com.rex.microservicepractice.trade.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.rex.microservicepractice.trade.service.IncomeService;
import tw.com.rex.microservicepractice.trade.service.TradeService;
import tw.com.rex.microservicepractice.trade.web.controller.request.IncomeRequest;

@AllArgsConstructor
@Service
@Transactional
public class IncomeServiceImpl implements IncomeService {

    private final TradeService tradeService;

    @Override
    public boolean save(IncomeRequest income) {
        return true;
    }

}
