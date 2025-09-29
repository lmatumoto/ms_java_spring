# AluraFood - Microsserviços em Java com Spring Boot

Este repositório contém o projeto AluraFood, uma aplicação de exemplo que utiliza arquitetura de microsserviços com Java e Spring Boot. O sistema é composto por múltiplos serviços independentes, como pagamentos, pedidos, gateway e server, que se comunicam via HTTP e Eureka Service Discovery.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Cloud (Eureka, OpenFeign, Gateway)
- JPA/Hibernate
- Flyway (migração de banco de dados)
- MySQL
- Lombok
- ModelMapper
- Resilience4j

## Estrutura dos Serviços

- **pedidos**: Gerenciamento de pedidos e itens do pedido.
- **pagamentos**: Processamento e confirmação de pagamentos.
- **gateway**: API Gateway para roteamento e segurança das requisições.
- **server**: Serviço de registro Eureka para descoberta dos microsserviços.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/lmatumoto/ms_java_spring.git
   ```
2. Configure o banco de dados MySQL e ajuste os arquivos `application.properties` conforme necessário.
3. Execute o serviço Eureka (`server`) antes dos demais microsserviços.
4. Execute os microsserviços de pedidos, pagamentos e gateway:
   ```bash
   cd server
   mvn spring-boot:run

   cd ../pedidos
   mvn spring-boot:run

   cd ../pagamentos/pagamentos
   mvn spring-boot:run

   cd ../../gateway
   mvn spring-boot:run
   ```
5. Acesse os endpoints via Postman ou navegador, utilizando o gateway como ponto de entrada principal.

## Observações

- Certifique-se de que todos os microsserviços estejam registrados no Eureka para comunicação via Feign e roteamento pelo gateway.
- As migrações de banco de dados são gerenciadas pelo Flyway.
- O projeto utiliza boas práticas de tratamento de erros e integração entre microsserviços.

## Licença

Este projeto é apenas para fins educacionais.
