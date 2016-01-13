package my.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import my.sample.domain.service.ProductService;

public class ProductSampleRun {

    public static void main(String[] args) {
        ProductSampleRun productSampleRun = new ProductSampleRun();
        productSampleRun.execute();
    }

    public void execute() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = ctx.getBean(ProductService.class);

        productService.success("isbn0000000001");

    }
}