package com.musanli;

import java.net.URLEncoder;

/**
 * @author: li_bin .
 * @description: .
 * @create: 2018-10-26 14:39 .
 */
public class TestOther {
    public static void main(String[] args) {
        System.out.println(base);
        String str = URLEncoder.encode("https://wxstag.abchinalife.cn:8443/login/edor/survivalsurvey/afterfacecheck.html?orderno=51t17n318hj70mnnwc28314561i71ri8");
        System.out.println(str);
        System.out.println("\u968FE\u884C\u901A\u7528\u627F\u4FDD\u5730\u5740 \uFF08\u6B64\u53D8\u91CF\u4EC5\u5728 uw \u5FAE\u670D\u52A1\u4E0B\u4F7F\u7528  ----  pay \u5FAE\u670D\u52A1\u4E0B\u7528\u5230\uFF0C\u4F46\u662F\u5176\u65B9\u6CD5\u4ECE\u672A\u88AB\u4F7F\u7528---\u52FE\u6C5F\u6D77\u8FC1\u79FB\u8FC7\u6765\u7684\uFF09");
        System.out.println("\u501F\u610F\u9669  \u76F8\u5173");
        System.out.println(pro);
    }
    private static String pro = "#\u5FC3\u8DF3\u65F6\u95F4\uFF0C\u5373\u670D\u52A1\u7EED\u7EA6\u95F4\u9694\u65F6\u95F4\uFF08\u7F3A\u7701\u4E3A30s\uFF09\n" +
            "eureka.instance.lease-renewal-interval-in-seconds=@eureka.instance.lease-renewal-interval-in-seconds@\n" +
            "#\u53D1\u5446\u65F6\u95F4\uFF0C\u5373\u670D\u52A1\u7EED\u7EA6\u5230\u671F\u65F6\u95F4\uFF08\u7F3A\u7701\u4E3A90s\uFF09\n" +
            "eureka.instance.lease-expiration-duration-in-seconds=@eureka.instance.lease-expiration-duration-in-seconds@\n" +
            "# \u5F00\u542F\u5065\u5EB7\u68C0\u67E5\uFF08\u4F9D\u8D56spring-boot-starter-actuator\uFF09\n" +
            "eureka.client.healthcheck.enabled=@eureka.client.healthcheck.enabled@\n" +
            "#\u7F13\u5B58\u6240\u6709\u5B9E\u4F8B\u6CE8\u518C\u4FE1\u606F\u5B9A\u65F6\uFF08\u503C\u7531eureka.client.registry-fetch-interval-seconds\u5B9A\u4E49\uFF0C\u9ED8\u8BA4\u503C\u4E3A30s\uFF09\u5411\u6CE8\u518C\u4E2D\u5FC3\u66F4\u65B0\u5B9E\u4F8B\n" +
            "eureka.client.fetchRegistry=@eureka.client.fetchRegistry@\n" +
            "eureka.client.registry-fetch-interval-seconds=@eureka.client.registry-fetch-interval-seconds@\n" +
            "management.security.enabled=false\n" +
            "endpoints.restart.enabled=true\n" +
            "\n" +
            "#Hystrix\u7194\u65AD\u5668\u8D85\u65F6\u65F6\u95F4\n" +
            "hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds=10000\n" +
            "\n" +
            "#\u5B57\u7B26\u96C6\u8BBE\u7F6E\n" +
            "spring.http.encoding.charset=UTF-8\n" +
            "spring.http.encoding.force=true\n" +
            "spring.http.encoding.enabled=true\n" +
            "\n" +
            "#\u670D\u52A1\u5668\u7684\u7AEF\u53E3\u53F7\n" +
            "server.port=9007\n" +
            "eureka.instance.preferIpAddress=true\n" +
            "eureka.instance.instance-id=${spring.cloud.client.ipAddress}:${spring.application.name}:${server.port}\n" +
            "\n" +
            "#\u670D\u52A1\u5668\u5927\uFFFD?\n" +
            "server.max-http-header-size=10000000\n" +
            "\n" +
            "#Feign\u4E2D\u4F7F\u7528\u65AD\u8DEF\u5668   \u6253\u5F00\u65AD\u8DEF\u5668\n" +
            "feign.hystrix.enabled=false\n" +
            "\n" +
            "#\u542F\u7528http\u4E0A\u4F20\n" +
            "spring.http.multipart.enabled=true\n" +
            "#\u8BBE\u7F6E\u5355\u4E2A\u6587\u4EF6\u7684\u6700\u5927\u957F\u5EA6\n" +
            "spring.http.multipart.max-file-size=5MB\n" +
            "#\u8BBE\u7F6E\u6700\u5927\u7684\u8BF7\u6C42\u6587\u4EF6\u7684\u5927\u5C0F\n" +
            "spring.http.multipart.max-request-size=5MB\n" +
            "#\u6587\u4EF6\u4E0A\u4F20\u4E34\u65F6\u76EE\u5F55\n" +
            "#spring.http.multipart.location=/\n" +
            "\n" +
            "#druid\u7684\u4E00\u4E9B\u914D \u5236\n" +
            "spring.datasource.type=com.alibaba.druid.pool.DruidDataSource\n" +
            "# \u4E0B\u9762\u4E3A\u8FDE\u63A5\u6C60\u7684\u8865\u5145\u8BBE\u7F6E\uFF0C\u5E94\u7528\u5230\u4E0A\u9762\u6240\u6709\u6570\u636E\u6E90\u4E2D\n" +
            "# \u521D\u59CB\u5316\u5927\u5C0F\uFF0C\u6700\u5C0F\uFF0C\u6700\u5927\n" +
            "spring.datasource.initialSize=@spring.datasource.initialSize@\n" +
            "spring.datasource.minIdle=@spring.datasource.minIdle@\n" +
            "spring.datasource.maxActive=@spring.datasource.maxActive@\n" +
            "# \u914D\u7F6E\u83B7\u53D6\u8FDE\u63A5\u7B49\u5F85\u8D85\u65F6\u7684\u65F6\u95F4\n" +
            "spring.datasource.maxWait=60000\n" +
            "# \u914D\u7F6E\u95F4\u9694\u591A\u4E45\u624D\u8FDB\u884C\u4E00\u6B21\u68C0\u6D4B\uFF0C\u68C0\u6D4B\u9700\u8981\u5173\u95ED\u7684\u7A7A\u95F2\u8FDE\u63A5\uFF0C\u5355\u4F4D\u662F\u6BEB\u79D2 \n" +
            "spring.datasource.timeBetweenEvictionRunsMillis=60000\n" +
            "# \u914D\u7F6E\u4E00\u4E2A\u8FDE\u63A5\u5728\u6C60\u4E2D\u6700\u5C0F\u751F\u5B58\u7684\u65F6\u95F4\uFF0C\u5355\u4F4D\u662F\u6BEB\u79D2 \n" +
            "spring.datasource.minEvictableIdleTimeMillis=300000\n" +
            "spring.datasource.validationQuery=SELECT 1\n" +
            "spring.datasource.testWhileIdle=true\n" +
            "spring.datasource.testOnBorrow=false\n" +
            "spring.datasource.testOnReturn=false\n" +
            "# \u6253\u5F00PSCache\uFF0C\u5E76\u4E14\u6307\u5B9A\u6BCF\u4E2A\u8FDE\u63A5\u4E0APSCache\u7684\u5927\u5C0F \n" +
            "spring.datasource.poolPreparedStatements=true\n" +
            "spring.datasource.maxPoolPreparedStatementPerConnectionSize=20\n" +
            "# \u914D\u7F6E\u76D1\u63A7\u7EDF\u8BA1\u62E6\u622A\u7684filters\uFF0C\u53BB\u6389\u540E\u76D1\u63A7\u754C\u9762sql\u65E0\u6CD5\u7EDF\u8BA1\uFF0C'wall'\u7528\u4E8E\u9632\u706B\u5899 \n" +
            "spring.datasource.filters=@spring.datasource.filters@\n" +
            "# \u901A\u8FC7connectProperties\u5C5E\u6027\u6765\u6253\u5F00mergeSql\u529F\u80FD\uFF1B\u6162SQL\u8BB0\u5F55\n" +
            "spring.datasource.connectionProperties=config.decrypt=true;druid.stat.mergeSql=true;druid.stat.slowSqlMillis=5000\n" +
            "# \u5408\u5E76\u591A\u4E2ADruidDataSource\u7684\u76D1\u63A7\u6570\u636E\n" +
            "#spring.datasource.useGlobalDataSourceStat=true\n" +
            "\n" +
            "#\u6570\u636E\u5E93\u6570\u636E\u6E90\n" +
            "spring.datasource.driverClassName = oracle.jdbc.driver.OracleDriver\n" +
            "spring.datasource.url = jdbc:oracle:thin:@10.0.56.34:1521:dsptdev\n" +
            "spring.datasource.username = dsptdev\n" +
            "spring.datasource.password = dsptdev\n" +
            "#mybatis\u914D\u5236\n" +
            "mybatis.config-locations=classpath:mybatis/mybatis-config.xml\n" +
            "mybatis.mapper-locations=classpath*:cn/abchinalife/**.xml\n" +
            "mybatis.type-aliases-package=cn.abchinalife\n" +
            "\n" +
            "logging.config=classpath:logback.xml\n" +
            "\n" +
            "#\u8BBE\u7F6E\u8FDE\u63A5\u8D85\u65F6\u95EE\u9898ReadTimeout\n" +
            "ribbon.ReadTimeout=60000\n" +
            "ribbon.ConnectTimeout=60000\n" +
            "ribbon.MaxAutoRetries=0\n" +
            "ribbon.MaxAutoRetriesNextServer=1\n" +
            "\n" +
            "#\u7248\u672C\u53F7\n" +
            "project.version=1.0\n" +
            "\n" +
            "#\u662F\u5426\u53D1\u9001\u77ED\u4FE1\n" +
            "isSMSSend=@isSMSSend@\n" +
            "devMode=@devMode@\n" +
            "\n" +
            "########## ---------- add by songss 20180812 start ----------  #########\n" +
            "#\u6838\u5FC3\u5F00\u5173\u914D\u7F6E\uFF08\u53EA\u5728 weichat \u3001pc\u3001uw \u548C pay \u4E2D\u4F7F\u7528\uFF0C\u5404\u4E2A\u73AF\u5883\u76F8\u540C\uFF09\n" +
            "isCoreServiceFunctional = @isCoreServiceFunctional@\n" +
            "#\u968FE\u884C\u901A\u7528\u6838\u4FDD\u5730\u5740 \uFF08\u6B64\u53D8\u91CF\u4EC5\u5728 uw \u5FAE\u670D\u52A1\u4E0B\u4F7F\u7528\uFF09\n" +
            "随意行核保地址\n" +
            "newPolicyCountURL=http://10.0.65.32:7001/axis/abcwx.do\n" +
            "#\u968FE\u884C\u901A\u7528\u627F\u4FDD\u5730\u5740 \uFF08\u6B64\u53D8\u91CF\u4EC5\u5728 uw \u5FAE\u670D\u52A1\u4E0B\u4F7F\u7528  ----  pay \u5FAE\u670D\u52A1\u4E0B\u7528\u5230\uFF0C\u4F46\u662F\u5176\u65B9\u6CD5\u4ECE\u672A\u88AB\u4F7F\u7528---\u52FE\u6C5F\u6D77\u8FC1\u79FB\u8FC7\u6765\u7684\uFF09\n" +
            "随E行通用承保地址\n" +
            "newBillPayUrl=http://10.0.65.32:7001/axis/abcwx.do\n" +
            "\n" +
            "#\u652F\u4ED8\u65B9\u5F0F \uFF08\u6B64\u53D8\u91CF\u4EC5\u5728 uw \u5FAE\u670D\u52A1\u4E0B\u4F7F\u7528\uFF0C\u5404\u4E2A\u73AF\u5883\u53D8\u91CF\u76F8\u540C\uFF09\n" +
            "payMode=B\n" +
            "#\u4FDD\u9669\u671F\u9650 \uFF08\u6B64\u53D8\u91CF\u4EC5\u5728 uw \u5FAE\u670D\u52A1\u4E0B\u4F7F\u7528\uFF0C\u5404\u4E2A\u73AF\u5883\u53D8\u91CF\u76F8\u540C\uFF09\n" +
            "insPeriod=6\n" +
            "#\u94F6\u884C\u4EA7\u54C1ID \uFF08\u6B64\u53D8\u91CF\u4EC5\u5728 uw \u5FAE\u670D\u52A1\u4E0B\u4F7F\u7528\uFF0C\u5404\u4E2A\u73AF\u5883\u53D8\u91CF\u76F8\u540C\uFF09\n" +
            "itemId=17920311673\n" +
            "\n" +
            "# \u4FDD\u5355\u4E0B\u8F7D\u8DEF\u5F84\uFF08 \u53EA\u5728 system \u3001 edor \u3001uw  \uFF0C3\u4E2A\u5FAE\u670D\u52A1\u4E0B\u4F7F\u7528\uFF09\n" +
            "econtract.reg.url=@econtract.reg.url@\n" +
            "\n" +
            "\n" +
            "#o2o\u7B2C\u4E09\u65B9\u62BD\u5956 (\u6B64\u53D8\u91CF\u4EC5\u5728 uw \u5FAE\u670D\u52A1\u4E0B\u4F7F\u7528\uFF0C\u5404\u4E2A\u73AF\u5883\u53D8\u91CF\u76F8\u540C\uFF09\n" +
            "o2ourl=https://h5.rrxiu.net/v/mljzeq\n" +
            "\n" +
            "\n" +
            "\n" +
            "# \u501F\u610F\u9669  \u76F8\u5173  ---   start ---- #\n" +
            "BorrowedRisk_JWLP_WS=http://10.10.68.57:7101/aipcorews/services/SearchHistoryCLMRecSrvAdapter?wsdl\n" +
            "BorrowedRisk_JWHB_WS=http://10.10.68.57:7101/aipcorews/services/SearchHistoryUWInfoSrvAdapter?wsdl\n" +
            "BorrowedRisk_TSJY_WS=http://10.10.68.57:7101/aipcorews/services/GetSpecialCheckRuleSerAdapter?wsdl\n" +
            "\n" +
            "BorrowedRisk_SavePolicy_WS=http://10.10.68.57:7101/aipcorews/services/SaveTBSrvAdapter?wsdl\n" +
            "BorrowedRisk_Cover_WS=http://10.10.68.57:7101/aipcorews/services/SignPolicyAdapter?wsdl\n" +
            "BorrowedRisk_ShouldPay_WS=http://10.10.68.57:7101/aipcorews/services/CreateSPaySrvAdapter?wsdl\n" +
            "BorrowedRisk_RealPay_WS=http://10.10.68.57:7101/aipcorews/services/TurnToAPaySrvAdapter?wsdl\n" +
            "TempPay_WS=http://10.10.68.57:7101/aipcorews/services/CreateTempPaySrvAdapter?wsdl\n" +
            "\n" +
            "BorrowedRisk_NewElecPolicy_WS=http://10.10.40.42:8080/gx/services/WXTBSendMessageService?WSDL\n" +
            "\n" +
            "###\u5B66\u5E73\u9669\u7279\u522B\u9700\u6C42\uFF1A\u4E2D\u4ECB\u7ED3\u6784\u548C\u7F51\u70B9\u90FD\u4F7F\u7528\u865A\u62DF\u7F16\u7801\uFF0C4\u4E2A\u73AF\u5883\u90FD\u76F8\u540C ------  add by songss 20180829---###\n" +
            "agentComforXpx=8611990000\n" +
            "agentBranchforXpx=861100100101\n" +
            "\n" +
            "# \u501F\u610F\u9669  \u76F8\u5173  ---   end ---- #\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "########## ---------- add by songss 20180812 end ----------  #########\n" +
            "\n" +
            "# add by zhaoxf 20180812 start\n" +
            "requestID=@requestID@\n" +
            "userCode=@userCode@\n" +
            "pwd=@pwd@\n" +
            "smsRequestURL=@smsRequestURL@\n" +
            "# add by zhaoxf 20180812 end\n" +
            "\n" +
            "# add by tianrn 20180812 start\n" +
            "openidURL = @openidURL@\n" +
            "appid = @appid@\n" +
            "targetInUrl = @targetInUrl@\n" +
            "template_id_agent_bind = kCdomwa44DgFs5laYtg690BLxFNx6TA8PwnuRpjjODM\n" +
            "# add by tianrn 20180812 end\n" +
            "\n" +
            "#\u79E6\u519C\n" +
            "QINNONG_SOURCE=@QINNONG_SOURCE@\n" +
            "#add zhengqi companyName mangguo\n" +
            "CompanyName=@CompanyName@\n" +
            "\n" +
            "comId=@comId@\n" +
            "from=@from@\n" +
            "#add by goujh 20180813  start\n" +
            "# \u4E0E\u6838\u5FC3\u7B80\u6613\u4FDD\u5168\u4EA4\u4E92\u5730\u5740\n" +
            "BAODAN_URL=@BAODAN_URL@\n" +
            "#add by goujh 20180813  end\n" +
            "\n" +
            "#add by tianrn 20180813 start\n" +
            "underwritingURL=http://10.0.65.32:7001/axis/abcwx.do\n" +
            "GE_AGENT=@GE_AGENT@\n" +
            "thirdPlatformSurrender=@thirdPlatformSurrender@\n" +
            "\n" +
            "TPencryptionKey=k6NqFUfiHHel5FOcKMhLyw\n" +
            "TPpostSignKey=Is5AMx2Kf/k91IVfGj9hMS9PsJUC4flJTLTzEyOg19Q\n" +
            "encryptionKey= ycYC2bp3nDuKjnRyrLifSQ==\n" +
            "postSignKey =trKfUeQ6cddBsHNXKIHJvG9Qmev03zGDtzm\n" +
            "resultSignKey =diB7o33RP45ZvjN7etkwwJtK40AuSgMKWtm\n" +
            "#add by tianrn 20180813 end\n" +
            "\n" +
            "#add by goujh 20180823  start\n" +
            "smsServiceURL =@smsServiceURL@\n" +
            "codeSmsServiceURL =@codeSmsServiceURL@\n" +
            "# \u7528\u6237\u540D\u548C\u5BC6\u7801\u7528\u4E8E\u9A8C\u8BC1\u53D1\u9001\u8005\n" +
            "username=@username@\n" +
            "userpassword=@userpassword@\n" +
            "SMS_ORG=@SMS_ORG@\n" +
            "isSmsSend=@isSmsSend@\n" +
            "# \u8BBE\u7F6E\u662F\u5426\u8C03\u7528\u7684\u63A5\u53E3\u6A21\u677F true:\u4F7F\u7528 false:\u4E0D\u4F7F\u7528\n" +
            "needUseTemplateFlag =@needUseTemplateFlag@\n" +
            "# \u8981\u4F7F\u7528\u7684\u63A5\u53E3\u6A21\u677F\u7684id[\u4FDD\u4FE1\u901A\u7CFB\u7EDF\u6A21\u5757-\u300B\u63A5\u53E3\u4EFB\u52A1-\u300B\u63A5\u53E3\u6A21\u677F\u7BA1\u7406-\u300B\u6DFB\u52A0\u6A21\u677F]\n" +
            "templatId =@templatId@\n" +
            "# \u4FDD\u4FE1\u901A\u7CFB\u7EDF\u6A21\u5757-\u300B\u7CFB\u7EDF\u7BA1\u7406-\u300B\u673A\u6784\u7BA1\u7406\u9875\u9762\u4E2D\u7684\u673A\u6784\u4EE3\u7801\n" +
            "organizationId =@organizationId@\n" +
            "# \u4FE1\u901A\u7CFB\u7EDF\u6A21\u5757-\u300B\u7CFB\u7EDF\u7BA1\u7406-\u300B\u53C2\u6570\u914D\u7F6E-\u300B\u670D\u52A1\u7C7B\u578B-\u300B\u670D\u52A1\u7C7B\u578B\u4EE3\u7801\uFF0C\u8BF7\u586B\u5199\u4E13\u95E8\u4E3Awebservice\u53D1\u9001\u4F7F\u7528\u7684\u670D\u52A1\u7C7B\u578B\uFF0C\u65B9\u4FBF\u7EDF\u8BA1\u5206\u6790\n" +
            "serviceType =@serviceType@\n" +
            "#####################################################\u7B2C\u4E09\u65B9\u5E73\u53F0\u76F8\u5173######################################\n" +
            "#\u7B7E\u540D\u79D8\u94A5\n" +
            "FLH_sign_key=e711277f81cafc4183294295623c843f\n" +
            "#\u4EE4\u724C\n" +
            "FLH_access_token=abclife\n" +
            "#AES\u52A0\u5BC6\u5BC6\u94A5\n" +
            "FLH_aes_key=eSOOtAti6ou/RwJx0rBIIA==\n" +
            "#\u516C\u53F8\u4EE3\u7801\n" +
            "FLH_company_code=abchinalife\n" +
            "#\u798F\u793C\u60E0\u56DE\u8C03\u63A5\u53E3\u5730\u5740\n" +
            "FLH_CALLBACKURL=http://webapp.fulihui.org/v2/api/activity/giftpackage/abchinalifeInsurance/callback\n" +
            "#\u548C\u8BAF\u56DE\u8C03\u63A5\u53E3\n" +
            "HEXUN_CALLBACKURL=http://m.fangxinbao.com/giftinsuranceCallback.html\n" +
            "#\u548C\u8BAF\u7B7E\u540D\u79D8\u94A5\n" +
            "HEXUN_sign_key=e711277f81cafc4183294295623c843f\n" +
            "#\u548C\u8BAF\u4EE4\u724C\n" +
            "HEXUN_access_token=abclife\n" +
            "#\u548C\u8BAFAES\u52A0\u5BC6\u5BC6\u94A5\n" +
            "HEXUN_aes_key=eSOOtAti6ou/RwJx0rBIIA==\n" +
            "#\u548C\u8BAF\u516C\u53F8\u4EE3\u7801\n" +
            "HEXUN_company_code=abchinalife\n" +
            "#\u7B7E\u540D\u79D8\u94A5\n" +
            "FANMILI_sign_key=e711277f81cafc4183294295623c843f\n" +
            "#\u4EE4\u724C\n" +
            "#FANMILI_access_token=e8e244699aba36afb338d262c944ed6f\n" +
            "FANMILI_access_token=abclife\n" +
            "#\u516C\u53F8\u4EE3\u7801\n" +
            "FANMILI_company_code=abchinalife\n" +
            "#AES\u52A0\u5BC6\u5BC6\u94A5\n" +
            "FANMILI_aes_key=eSOOtAti6ou/RwJx0rBIIA==\n" +
            "#\u798F\u793C\u60E0\u56DE\u8C03\u63A5\u53E3\u5730\u5740\n" +
            "FANMILI_CALLBACKURL=http://www.fml-care.com/orders/ordercbs.php\n" +
            "#####################################################\u7B2C\u4E09\u65B9\u5E73\u53F0\u76F8\u5173######################################\n" +
            "#add by goujh 20180823  end\n" +
            "\n" +
            "#redis\u914D\u7F6E\n" +
            "spring.redis.database=1\n" +
            "spring.redis.host=@spring.redis.host@\n" +
            "spring.redis.port=@spring.redis.port@\n" +
            "spring.redis.password=\n" +
            "spring.redis.pool.max-idle=@spring.redis.pool.max-idle@\n" +
            "spring.redis.pool.min-idle=@spring.redis.pool.min-idle@\n" +
            "spring.redis.pool.max-active=@spring.redis.pool.max-active@\n" +
            "spring.redis.pool.max-wait=@spring.redis.pool.max-wait@\n" +
            "spring.redis.timeout=@spring.redis.timeout@\n" +
            "spring.jedis.pool.max-active=@spring.jedis.pool.max-active@\n" +
            "spring.jedis.pool.max-idle=@spring.jedis.pool.max-idle@\n" +
            "spring.jedis.pool.max-wait=@spring.jedis.pool.max-wait@\n" +
            "\n" +
            "#\u4E2D\u53F0sit\u5730\u5740\n" +
            "middlePlatUrl = @middlePlatUrl@";
    /**   常用汉字  */
    private static final String base = "\u7684\u4e00\u4e86\u662f\u6211\u4e0d\u5728\u4eba\u4eec\u6709\u6765\u4ed6\u8fd9"
            + "\u4e0a\u7740\u4e2a\u5730\u5230\u5927\u91cc\u8bf4\u5c31\u53bb\u5b50\u5f97\u4e5f\u548c"
            + "\u90a3\u8981\u4e0b\u770b\u5929\u65f6\u8fc7\u51fa\u5c0f\u4e48\u8d77\u4f60\u90fd\u628a"
            + "\u597d\u8fd8\u591a\u6ca1\u4e3a\u53c8\u53ef\u5bb6\u5b66\u53ea\u4ee5\u4e3b\u4f1a\u6837"
            + "\u5e74\u60f3\u751f\u540c\u8001\u4e2d\u5341\u4ece\u81ea\u9762\u524d\u5934\u9053\u5b83"
            + "\u540e\u7136\u8d70\u5f88\u50cf\u89c1\u4e24\u7528\u5979\u56fd\u52a8\u8fdb\u6210\u56de"
            + "\u4ec0\u8fb9\u4f5c\u5bf9\u5f00\u800c\u5df1\u4e9b\u73b0\u5c71\u6c11\u5019\u7ecf\u53d1"
            + "\u5de5\u5411\u4e8b\u547d\u7ed9\u957f\u6c34\u51e0\u4e49\u4e09\u58f0\u4e8e\u9ad8\u624b"
            + "\u77e5\u7406\u773c\u5fd7\u70b9\u5fc3\u6218\u4e8c\u95ee\u4f46\u8eab\u65b9\u5b9e\u5403"
            + "\u505a\u53eb\u5f53\u4f4f\u542c\u9769\u6253\u5462\u771f\u5168\u624d\u56db\u5df2\u6240"
            + "\u654c\u4e4b\u6700\u5149\u4ea7\u60c5\u8def\u5206\u603b\u6761\u767d\u8bdd\u4e1c\u5e2d"
            + "\u6b21\u4eb2\u5982\u88ab\u82b1\u53e3\u653e\u513f\u5e38\u6c14\u4e94\u7b2c\u4f7f\u5199"
            + "\u519b\u5427\u6587\u8fd0\u518d\u679c\u600e\u5b9a\u8bb8\u5feb\u660e\u884c\u56e0\u522b"
            + "\u98de\u5916\u6811\u7269\u6d3b\u90e8\u95e8\u65e0\u5f80\u8239\u671b\u65b0\u5e26\u961f"
            + "\u5148\u529b\u5b8c\u5374\u7ad9\u4ee3\u5458\u673a\u66f4\u4e5d\u60a8\u6bcf\u98ce\u7ea7"
            + "\u8ddf\u7b11\u554a\u5b69\u4e07\u5c11\u76f4\u610f\u591c\u6bd4\u9636\u8fde\u8f66\u91cd"
            + "\u4fbf\u6597\u9a6c\u54ea\u5316\u592a\u6307\u53d8\u793e\u4f3c\u58eb\u8005\u5e72\u77f3"
            + "\u6ee1\u65e5\u51b3\u767e\u539f\u62ff\u7fa4\u7a76\u5404\u516d\u672c\u601d\u89e3\u7acb"
            + "\u6cb3\u6751\u516b\u96be\u65e9\u8bba\u5417\u6839\u5171\u8ba9\u76f8\u7814\u4eca\u5176"
            + "\u4e66\u5750\u63a5\u5e94\u5173\u4fe1\u89c9\u6b65\u53cd\u5904\u8bb0\u5c06\u5343\u627e"
            + "\u4e89\u9886\u6216\u5e08\u7ed3\u5757\u8dd1\u8c01\u8349\u8d8a\u5b57\u52a0\u811a\u7d27"
            + "\u7231\u7b49\u4e60\u9635\u6015\u6708\u9752\u534a\u706b\u6cd5\u9898\u5efa\u8d76\u4f4d"
            + "\u5531\u6d77\u4e03\u5973\u4efb\u4ef6\u611f\u51c6\u5f20\u56e2\u5c4b\u79bb\u8272\u8138"
            + "\u7247\u79d1\u5012\u775b\u5229\u4e16\u521a\u4e14\u7531\u9001\u5207\u661f\u5bfc\u665a"
            + "\u8868\u591f\u6574\u8ba4\u54cd\u96ea\u6d41\u672a\u573a\u8be5\u5e76\u5e95\u6df1\u523b"
            + "\u5e73\u4f1f\u5fd9\u63d0\u786e\u8fd1\u4eae\u8f7b\u8bb2\u519c\u53e4\u9ed1\u544a\u754c"
            + "\u62c9\u540d\u5440\u571f\u6e05\u9633\u7167\u529e\u53f2\u6539\u5386\u8f6c\u753b\u9020"
            + "\u5634\u6b64\u6cbb\u5317\u5fc5\u670d\u96e8\u7a7f\u5185\u8bc6\u9a8c\u4f20\u4e1a\u83dc"
            + "\u722c\u7761\u5174\u5f62\u91cf\u54b1\u89c2\u82e6\u4f53\u4f17\u901a\u51b2\u5408\u7834"
            + "\u53cb\u5ea6\u672f\u996d\u516c\u65c1\u623f\u6781\u5357\u67aa\u8bfb\u6c99\u5c81\u7ebf"
            + "\u91ce\u575a\u7a7a\u6536\u7b97\u81f3\u653f\u57ce\u52b3\u843d\u94b1\u7279\u56f4\u5f1f"
            + "\u80dc\u6559\u70ed\u5c55\u5305\u6b4c\u7c7b\u6e10\u5f3a\u6570\u4e61\u547c\u6027\u97f3"
            + "\u7b54\u54e5\u9645\u65e7\u795e\u5ea7\u7ae0\u5e2e\u5566\u53d7\u7cfb\u4ee4\u8df3\u975e"
            + "\u4f55\u725b\u53d6\u5165\u5cb8\u6562\u6389\u5ffd\u79cd\u88c5\u9876\u6025\u6797\u505c"
            + "\u606f\u53e5\u533a\u8863\u822c\u62a5\u53f6\u538b\u6162\u53d4\u80cc\u7ec6";
}
