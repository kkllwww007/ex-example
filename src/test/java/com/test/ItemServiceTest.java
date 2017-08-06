package com.test;

import com.test.dto.ItemDto;
import com.test.dto.QueryItemVo;
import com.test.enums.ItemTypeEnum;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by wxk on 2017-08-06.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(Application.class)
// @ActiveProfiles("test")   //这边test指配置文件指向spring-test.yml
public class ItemServiceTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testQuery() {
        QueryItemVo vo = new QueryItemVo();
        /*vo.setType(ItemTypeEnum.A.toString());
        vo.setItemName("笔记本");
        vo.setPeriodFrom("2017-08-06 00:00:00");
        vo.setPeriodTo("2017-08-06 23:59:59");
        vo.setPriceWithTaxFrom("50.23");
        vo.setPriceWithTaxTo("100.88");*/

        String body = this.restTemplate.postForObject("http://192.168.0.105:8080/api/v1/item/query/5", vo, String.class);
        System.out.println(body);
        assertThat(body).isNotBlank();
    }

    @Test
    public void testAddItem() {
        String url = "/api/v1/item";

        ItemDto item = new ItemDto();
        item.setBusinessId(RandomStringUtils.randomNumeric(32));
        item.setPriceWithTax(100.123);
        item.setQuantity(10);
        item.setAmount(1001.23);
        item.setType(ItemTypeEnum.A.toString());
        item.setPeriod(new Date());

        this.restTemplate.postForObject(url, item, String.class);
    }
}
