package tw.com.rex.microservicepractice.trade.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import tw.com.rex.microservicepractice.trade.web.controller.request.IncomeRequest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


@ExtendWith(MockitoExtension.class)
public class IncomeServiceImplTest {

    @InjectMocks
    private IncomeServiceImpl service;
    private IncomeRequest income;

    @BeforeEach
    public void setUp() {
        income = new IncomeRequest();
    }

    @DisplayName("保存收入")
    @Test
    public void save() {
        boolean result = service.save(income);
        assertThat(result, is(equalTo(true)));
    }

}
