package com.ericsson.mapper;

import com.ericsson.domain.PaymentOrderVO;

import java.util.List;
import java.util.Map;

/**
 * Created by edoaxio on 6/15/2017.
 */
public interface PaymentOrderMapper {

    public List<PaymentOrderVO> queryPaymentOrder(Map<String,String> params);
}
