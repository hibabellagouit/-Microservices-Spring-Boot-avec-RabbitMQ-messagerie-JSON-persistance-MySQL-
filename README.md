# Microservices Spring Boot avec RabbitMQ (messagerie JSON + persistance MySQL)

## Aperçu
Mettre en place deux mini-projets Spring Boot exploitant RabbitMQ (AMQP) pour échanger des messages entre microservices. Le premier mini-projet valide une communication Producer → RabbitMQ → Consumer (messages JSON). Le second mini-projet étend le flux en persistant les messages (objets User) dans MySQL côté Consumer.

---

## Objectifs d’apprentissage
Déclarer dynamiquement un exchange, une queue et un binding depuis Spring Boot.
Publier un message via REST (Producer) et consommer via @RabbitListener (Consumer).
Observer les échanges et compteurs dans l’interface RabbitMQ.
Sérialiser/désérialiser en JSON avec Jackson2JsonMessageConverter.
Persister un message consommé dans MySQL via Spring Data JPA.

---

## Pré-requis
RabbitMQ en cours d’exécution (Docker recommandé), ports 5672 (AMQP) et 15672 (UI).
JDK 17+ (ou JDK compatible avec le Spring Boot utilisé).
Maven.
Postman (ou curl).
MySQL + phpMyAdmin (optionnel mais requis pour la partie 2).

--- 

## Architecture cible

### Mini-projet 1 (messagerie JSON)

REST Producer (8123) → RabbitMQ (exchange topic + routing key) → Consumer (8223) → logs console.


<img width="924" height="492" alt="Capture d&#39;écran 2025-12-22 101538" src="https://github.com/user-attachments/assets/59ab71b0-28ea-4084-9fdf-e533dca97a83" />

<img width="291" height="472" alt="Capture d&#39;écran 2025-12-22 102726" src="https://github.com/user-attachments/assets/1fe86948-4d92-403a-b8c7-6aad97cc4305" />

<img width="915" height="504" alt="Capture d&#39;écran 2025-12-22 102948" src="https://github.com/user-attachments/assets/e9c03b18-7c3c-4de8-8d61-dd8c66aa70af" />

<img width="302" height="423" alt="Capture d&#39;écran 2025-12-22 104327" src="https://github.com/user-attachments/assets/5adf2f1f-51be-4ef3-b4db-6e684f812119" />


<img width="960" height="490" alt="Capture d&#39;écran 2025-12-22 104704" src="https://github.com/user-attachments/assets/b6fa30eb-e70f-48a3-8d68-e61abd2dc963" />

<img width="960" height="493" alt="Capture d&#39;écran 2025-12-22 104717" src="https://github.com/user-attachments/assets/ecb5e768-4969-453e-8853-ccbb07afba62" />

<img width="960" height="499" alt="Capture d&#39;écran 2025-12-22 104944" src="https://github.com/user-attachments/assets/ab1a217c-4eca-4de2-8ebf-498bfc2839f6" />


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


<img width="934" height="489" alt="Capture d&#39;écran 2025-12-22 205447" src="https://github.com/user-attachments/assets/87f072f5-dd49-4c69-bc50-fa958c5a7a11" />

<img width="931" height="496" alt="Capture d&#39;écran 2025-12-22 205458" src="https://github.com/user-attachments/assets/b15e930b-0c69-4bfb-abaf-81d62c16962e" />

<img width="953" height="484" alt="Capture d&#39;écran 2025-12-22 205559" src="https://github.com/user-attachments/assets/ee8a424e-4cdb-46da-8b5c-814be5c08974" />

<img width="960" height="487" alt="Capture d&#39;écran 2025-12-22 205628" src="https://github.com/user-attachments/assets/052ade12-68c7-4dc4-a7c0-b2f621355b25" />

---

## Auteur

**Nom :** JARDI Siham

**Cours :** Architecture Microservices : Conception, Déploiement et Orchestration

**Date :** Decembre 2025

**Encadré par :** Pr.Mohamed LACHGHAR

