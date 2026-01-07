## 🚀 Spring Boot Microservices : RabbitMQ & MySQL
Ce projet démontre l'implémentation d'une architecture microservices utilisant RabbitMQ comme broker de messages pour une communication asynchrone, avec une persistance des données dans MySQL.

## 📌 Aperçu du Projet
Le projet est divisé en deux étapes majeures :

Messagerie JSON : Communication fluide entre un Producteur et un Consommateur via RabbitMQ.

Pipeline de Données : Extension du flux pour inclure la sauvegarde automatique des objets User dans une base de données relationnelle.

## 🛠️ Stack Technique
Framework : Spring Boot 3.x

Langage : Java 17+

Broker : RabbitMQ (AMQP)

Base de données : MySQL

Outils : Spring Data JPA, Jackson (JSON), Maven, Docker

## 🏗️ Architecture Cible
1. Mini-projet : Messagerie JSON
Producer (8123) : Reçoit des requêtes REST et publie des messages JSON.

RabbitMQ : Gère les Exchanges (Topic), les Queues et le Binding.

Consumer (8223) : Écoute la file d'attente et traite les logs.

2. Mini-projet : Persistance MySQL
Flux : Producer ➔ RabbitMQ ➔ Consumer ➔ Spring Data JPA ➔ MySQL.

Objectif : Garantir que chaque message consommé est archivé de manière durable.

## 🚀 Configuration & Lancement
Pré-requis
Docker installé (pour RabbitMQ)

Serveur MySQL actif

JDK 17 ou supérieur

Installation de RabbitMQ (via Docker)
Bash

docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management
Accès interface web : http://localhost:15672 (Login: guest / Pass: guest)

Configuration application.properties (Consumer)
Properties

spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.datasource.url=jdbc:mysql://localhost:3306/db_name
spring.jpa.hibernate.ddl-auto=update
🧪 Scénario de Test
Démarrer les deux microservices.

Envoyer une requête POST (JSON) via Postman sur http://localhost:8123/api/send.

Vérifier l'interface RabbitMQ pour voir le pic de trafic dans la queue.

Observer la console du Consumer pour la réception.

Consulter la table users dans MySQL pour confirmer la persistance.

## 🎯 Objectifs d'Apprentissage
[x] Configuration dynamique des beans (Queue, TopicExchange, Binding).

[x] Utilisation du Jackson2JsonMessageConverter pour la sérialisation.

[x] Mise en œuvre de @RabbitListener pour le traitement asynchrone.

[x] Intégration de la couche Repository pour le stockage final.

--- 





<img width="924" height="492" alt="Capture d&#39;écran 2025-12-22 101538" src="https://github.com/user-attachments/assets/59ab71b0-28ea-4084-9fdf-e533dca97a83" />


<img width="927" height="505" alt="Capture d&#39;écran 2025-12-22 105128" src="https://github.com/user-attachments/assets/20174beb-2eeb-406a-9623-758879e7dc3e" />

<img width="928" height="502" alt="Capture d&#39;écran 2025-12-22 105144" src="https://github.com/user-attachments/assets/f3ed50c7-d0f8-45ad-b5a0-4a66ae5bcc5e" />

<img width="923" height="497" alt="Capture d&#39;écran 2025-12-22 105158" src="https://github.com/user-attachments/assets/268aff03-a3c6-4502-a74c-59ef5eab1e6e" />

<img width="893" height="73" alt="Capture d&#39;écran 2025-12-22 105223" src="https://github.com/user-attachments/assets/2c23be96-7f2a-4e81-bd35-ba249ea58e8d" />




### Mini-projet 2 (messagerie + MySQL)

REST Producer (8081) → RabbitMQ (exchange direct + routing key) → Consumer → MySQL (table user).

<img width="901" height="497" alt="Capture d&#39;écran 2025-12-22 105429" src="https://github.com/user-attachments/assets/4771bb29-6455-49a7-9a4b-1a426ef9e8bb" />


<img width="926" height="500" alt="Capture d&#39;écran 2025-12-22 105519" src="https://github.com/user-attachments/assets/54ef7da7-ff8a-4a37-82c8-a0891f07effb" />

<img width="919" height="497" alt="Capture d&#39;écran 2025-12-22 105534" src="https://github.com/user-attachments/assets/5809df34-e94a-4032-be8c-52b2514c4608" />

<img width="913" height="502" alt="Capture d&#39;écran 2025-12-22 110255" src="https://github.com/user-attachments/assets/3003dd26-a375-4430-bc76-1122d4987bdd" />

<img width="960" height="490" alt="Capture d&#39;écran 2025-12-22 204808" src="https://github.com/user-attachments/assets/e3e14b99-d48e-4c75-ac6c-179eca2d8760" />

<img width="960" height="478" alt="Capture d&#39;écran 2025-12-22 204945" src="https://github.com/user-attachments/assets/818b6948-c66a-4e1f-8482-d4c404bc42df" />


<img width="960" height="496" alt="Capture d&#39;écran 2025-12-22 205039" src="https://github.com/user-attachments/assets/27345c41-17e2-4952-b656-d35ac00a7da7" />

<img width="957" height="502" alt="Capture d&#39;écran 2025-12-22 205053" src="https://github.com/user-attachments/assets/e1e40d39-9c07-4bb6-ac33-1162ecfccd96" />

<img width="960" height="483" alt="Capture d&#39;écran 2025-12-22 205119" src="https://github.com/user-attachments/assets/ca8a9713-fa3b-4b9d-a29d-d308e9ba074e" />

<img width="929" height="500" alt="Capture d&#39;écran 2025-12-22 205158" src="https://github.com/user-attachments/assets/ef91834e-01ed-4033-a21b-abc67c732eb5" />


<img width="960" height="483" alt="Capture d&#39;écran 2025-12-22 205339" src="https://github.com/user-attachments/assets/6816a625-75c6-4f8f-bf11-ab81c426e143" />

<img width="930" height="501" alt="Capture d&#39;écran 2025-12-22 205407" src="https://github.com/user-attachments/assets/85e9161a-6bad-4a6a-929c-d921aa22a81e" />


<img width="934" height="504" alt="Capture d&#39;écran 2025-12-22 205419" src="https://github.com/user-attachments/assets/3e89ea92-01c1-40f3-b739-dd3cfe3bdf05" />




---

