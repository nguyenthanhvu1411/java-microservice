package com.nguyenthanhvu.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}
// API Gateway là một mẫu kiến trúc trong đó một dịch vụ trung gian (API Gateway) đứng giữa các client và các dịch vụ backend. API Gateway chịu trách nhiệm nhận tất cả các yêu cầu từ client, xử lý chúng và chuyển tiếp đến các dịch vụ backend tương ứng. Nó cũng có thể thực hiện các chức năng như xác thực, phân quyền, cân bằng tải, và quản lý lưu lượng.
}
