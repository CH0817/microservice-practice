package tw.com.rex.microservicepractice.trade.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.rex.microservicepractice.trade.mapper.TradeMapper;
import tw.com.rex.microservicepractice.trade.mapper.model.Trade;
import tw.com.rex.microservicepractice.trade.service.TradeService;

@Service
@Transactional
public class TradeServiceImpl extends ServiceImpl<TradeMapper, Trade> implements TradeService {
}
