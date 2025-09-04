# Sistema de Gerenciamento de Importações


**Aluno:** Caroline de Oliveira
**RM:** 559123


## Descrição


Este projeto é um **Sistema de Gerenciamento de Importações** desenvolvido em **Spring Boot** utilizando o padrão **MVC**, **Spring Data JPA** para persistência de dados, **Thymeleaf** para a interface web e **H2 Database** como banco em memória.


O sistema permite:


- Adicionar novas importações.
- Listar todas as importações.
- Atualizar o status de uma importação.
- Excluir importações existentes.

## Print dos testes
<img width="1366" height="590" alt="image" src="https://github.com/user-attachments/assets/9104fd1f-cc8d-46d5-9bf9-eaca3c7fea71" />
<img width="927" height="497" alt="image" src="https://github.com/user-attachments/assets/4b330dc1-d261-495e-b841-ebf89a4e322b" />






## Como Rodar o Projeto

1. Na raiz do projeto rode:

```bash
mvn clean install
mvn spring-boot:run
```

3. Abra no navegador:  
- Sistema: [http://localhost:8080/importacoes](http://localhost:8080/importacoes)  
- Console H2: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- 
## Configurações do banco 
- URL JDBC: `jdbc:h2:mem:importacoesdb`  
- Usuário: `sa`  
- Senha: *(deixe em branco)*
