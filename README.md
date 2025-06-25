# PoC com Spring Kafka e Java 21 

## Introdução

Esta prova de conceito busca configurar o Spring e Java com o mínimo de classes possíveis, mas ainda assim oferencendo:

- Suporte a SSL
- Configuração automática do `KafkaAdmin`

## GitHub Actions

Este repo conta com uma Action que executa o plugin [gradle-versions-plugin](https://github.com/ben-manes/gradle-versions-plugin) sempre que um push é realizado na branch `master`.
É muito útil para verificar novas versões das dependências.

## Backlog

- Inserir Spring Boot Actuator para health do Kafka
- Criar producer para que fique como exemplo de uso também
