package com.ericsson.mapper;

import com.ericsson.domain.MerchantVO;
import com.ericsson.request.MerchantQueryParam;

import java.util.List;
import java.util.Map;

/**
 * Created by edoaxio on 6/15/2017.
 */
public interface MerchantMapper {

    List<MerchantVO> queryMerchant(MerchantQueryParam param);
}
