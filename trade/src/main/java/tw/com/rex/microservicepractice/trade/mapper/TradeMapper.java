package tw.com.rex.microservicepractice.trade.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import tw.com.rex.microservicepractice.trade.mapper.model.Trade;

@Mapper
public interface TradeMapper extends BaseMapper<Trade> {
}
