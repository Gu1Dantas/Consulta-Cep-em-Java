# 📮 Consulta CEP

Aplicação Java que consulta informações de endereço a partir de um CEP usando a API pública do [ViaCEP](https://viacep.com.br/).

## 🚀 Como funciona

1. O usuário digita um CEP no console
2. A aplicação faz uma requisição GET para a API do ViaCEP
3. O JSON retornado é desserializado em um objeto `Endereco`
4. As informações do endereço são exibidas no console

## 🛠️ Tecnologias utilizadas

- Java 11+
- Spring Boot
- Jackson (ObjectMapper)
- HttpClient nativo do Java
- API ViaCEP

## ▶️ Como rodar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/consultacep.git
```

2. Entre na pasta do projeto:
```bash
cd consultacep
```

3. Rode com Maven:
```bash
./mvnw spring-boot:run
```

4. Digite um CEP quando solicitado no console. Exemplo:
```
Digite um cep:
01310-100
```

## 📦 Exemplo de retorno

```json
{
  "cep": "01310-100",
  "logradouro": "Avenida Paulista",
  "bairro": "Bela Vista",
  "localidade": "São Paulo",
  "uf": "SP"
}
```

## 📡 API utilizada

[ViaCEP](https://viacep.com.br/) — API gratuita e pública para consulta de CEPs brasileiros.
