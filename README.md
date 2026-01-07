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






---

