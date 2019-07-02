package com.example.lin.pay.alipay;


import com.alipay.api.AlipayApiException;

/**
 * @program: pay
 * @description: 支付宝支付接口
 * @author: lin
 * @throws AlipayApiException
 * @create: 2019-07-02 15:55
 */
public class Alipay {

    public String pay(AlipayBean alipayBean) throws AlipayApiException{
        String serverUrl = AlipayProperties.getGatewayUrl();

    }
}
