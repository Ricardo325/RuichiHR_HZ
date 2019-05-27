package com.hengzhi.config;

public class AlipayConfig {
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数
    public static String return_url = "http://localhost:8080/success.jsp";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/notify";
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092900624909";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgl4rG0hVnuzCSzEnTcpC+BQLt1WMNSOvTEK6S/n2pgrCShmDswj789V0jG2kHJT3N0rBnm5EHLUGrbeI4HjGsFSULMf0/z7FuuQEYS2ddvnT6YILpDqcMmXq43K+F59PS313RP5g9jm4PUENSAneqB7qnD8ds/MngmkDXyOKz3pRBBPl6JoVV00318P2hdpMLjqhcBZ1uxnmRIOIem9QcN4mkgYEcgIkdPcdq45yLHueA8O6uPYd1wah+eIZ7uJykPQN//M8tL9K/joKoGrrrsZDER9STXc1rK6DOXlF++gm+IrkevoO6XrEI7w9BCH/rUnhVRaHj+ZMAbsp+YFqCQIDAQAB";
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCCXisbSFWe7MJLMSdNykL4FAu3VYw1I69MQrpL+famCsJKGYOzCPvz1XSMbaQclPc3SsGebkQctQatt4jgeMawVJQsx/T/PsW65ARhLZ12+dPpggukOpwyZerjcr4Xn09LfXdE/mD2Obg9QQ1ICd6oHuqcPx2z8yeCaQNfI4rPelEEE+XomhVXTTfXw/aF2kwuOqFwFnW7GeZEg4h6b1Bw3iaSBgRyAiR09x2rjnIse54Dw7q49h3XBqH54hnu4nKQ9A3/8zy0v0r+OgqgauuuxkMRH1JNdzWsroM5eUX76Cb4iuR6+g7pesQjvD0EIf+tSeFVFoeP5kwBuyn5gWoJAgMBAAECggEADEoYQjAlch/biP8PN3QTsBMjr5qu5uuAQO4hZbwgljJ5ckbJdX0pUykSHZLQX6ljTKENc4Ptg89E2+drTc3U3RZ8CWSoIc+nECEikI6eQ3L1mRObSVYFF3MoG1zbsppf/TvMnIJmXY+/YHbba6kShkKz1xrUD/yiAtcnbDaLhVdd95x1BDPhe10EkFi6E7mL0qkwpx/SwQlhDkFi3Jr0LJnltsd2HsET49XBcB4VW/NK+eCxZ7V5rMm/JtemsypYLylNnqc+Zb/ZFG96yLUIiOoBI9klT67x5l5wAoop89HRLWSc22yRcCya9CWdn2VwGrv/GixvxiDMd9sJ0n+QqQKBgQDERt/KSSXeAaISFlUXtEVjfUsXVWgpASkLEeE8i/fexAkm/Q2g8S0v3KAs3vQ/U/BFlbkUe+HFeJGYjeFtFhDsbrZytvr6yTY0u+PUI8b/fyZPUtY3PEpH9jWdQXFqr1r0xR7G6J2vQqCjzF1fBAXN40LoA8h+L1F3K8DK5n3dFwKBgQCqCUPT/eTbIFwBUSrQDFr/jlXAn20qTDWOOOoFEvBoqQROiJK/PJOKZQ4KfuK8VWjUxrszxZ7auFE8x6D5TnUQDslNDZh+YKCWyTvO4r/h/p+eTjoj5nwCIN6R5Lazr4N1XLPf6VH6g4uuG9fKe6HkYIYHEVg7fjoPEdWBZ1Kl3wKBgQCVTIAQRCHcxIs+jOQ/Oq4JZpYG8r1fa3WH6RrWTnXGaoG3uYdzY+EGZiEk4JcT0MqUc7YsAauT5QmC7HGL49wNrI11pwA0YXetFzrO9EP7twEyF4XA0EiEgqD3tH8MMsTSKVsm3GyNkvXUgrCHhOzRVsxe5fnNGjsylgJ5lGgrEwKBgBvcHML1TLQinzCQDgW8oIRS2/YNqSNPDU9aP+3I5p8fYldDxVeUI1B/skdB9wCItf52+WFINfj8TkM5KkTu9/tDkPQREDVUu7s5CZWiTXJH9/tGMfyD3Tm0DQO2h8D1NwLZx5cecZIsT4ydf0Pr8eCreApcayqEShsB/wuO1FndAoGBAMQ3bqE8d9t0H1nFcbAy6JS4chljAB5XGVJL2gM3a1bWkPikQAw2VWogieHK6HdO2n7FLNzKjFNv7YPgeefDgdT518vFRVIXwUR8S/ISOAAoA4F00BCtLuPFwiKLPKzb0ixJWEuu53AADcbHgLcyZh+VD4dK9QmCzsoH2YIQBDj+";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}