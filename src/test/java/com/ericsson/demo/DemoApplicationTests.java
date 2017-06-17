package com.ericsson.demo;

import com.ericsson.domain.MerchantVO;
import com.ericsson.domain.PaymentOrderVO;
import com.ericsson.mapper.MerchantMapper;
import com.ericsson.mapper.PaymentOrderMapper;
import com.ericsson.mapper.UserMapper;

import com.ericsson.request.MerchantQueryParam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private PaymentOrderMapper paymentOrderMapper;

	@Autowired
	MerchantMapper merchantMapper;

	@Test
	public void contextLoads() {

		Map<String,String> params = new HashMap<>();
		params.put("orderId", "48067822");
		long startTime = new Date().getTime();
		System.out.println( " startTime: " + startTime);
		List<PaymentOrderVO> results = paymentOrderMapper.queryPaymentOrder(params);
		long endTime = new Date().getTime();
		System.out.println(" endTime : " + endTime);

		System.out.println( "usedTime: " + (endTime - startTime));

		for (PaymentOrderVO vo : results) {
			System.out.println( vo.getPaymentOrderId());
		}
	}

	@Test
	public void testMearchant() {
		Map<String,String> params = new HashMap<>();
		long startTime = new Date().getTime();
		PageHelper.startPage(1,20);
		MerchantQueryParam mqt = new MerchantQueryParam();
		mqt.setMerchantName("潮州");
		List<MerchantVO> merLists = merchantMapper.queryMerchant(mqt);
		PageInfo<MerchantVO> pageInfo = new PageInfo(merLists);

		System.out.println( "Total: " + pageInfo.getTotal());
		long endTime = new Date().getTime();

		System.out.println( "query time: " + (endTime -startTime));

		System.out.println( merLists.size());

		for (MerchantVO vo : pageInfo.getList()) {
			System.out.println( vo.getMerchantName());
		}
	}

}
