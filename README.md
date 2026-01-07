Architecture Microservices : Communication Asynchrone & Persistance (Spring Boot + RabbitMQ)1. Présentation du ProjetL'objectif est de concevoir un écosystème de microservices exploitant le protocole AMQP via RabbitMQ pour assurer une communication découplée et résiliente. Le projet se décline en deux phases : l'implémentation de la messagerie réactive et la mise en place de la persistance de données métier.2. Compétences & Objectifs TechniquesInfrastructure Messaging : Configuration dynamique des composants RabbitMQ (Exchanges, Queues, Bindings) via Java Config.Flux de Données : Publication de messages via RabbitTemplate et écoute active via l'annotation @RabbitListener.Sérialisation : Transformation automatique des objets POJO en JSON (et inversement) à l'aide de Jackson2JsonMessageConverter.Pipeline de Persistance : Intégration de Spring Data JPA pour l'enregistrement des entités reçues dans une base de données MySQL.Monitoring : Utilisation de l'interface d'administration de RabbitMQ pour superviser le trafic et les files d'attente.3. Environnement de DéveloppementComposantDétailsLangage / FrameworkJava 17+ / Spring Boot 3.xMessage BrokerRabbitMQ (via Docker : rabbitmq:3-management)Ports RabbitMQ5672 (Communication) / 15672 (Interface Web)Base de donnéesMySQL + Spring Data JPATests APIPostman / cURL4. Architecture des Mini-ProjetsModule 1 : Pipeline de Messagerie JSONMise en place d'un tunnel de communication simple entre deux services.Producer (Port 8123) : Expose une API REST qui convertit les requêtes entrantes en messages RabbitMQ (Topic Exchange).Consumer (Port 8223) : Intercepte les messages en temps réel et affiche le contenu JSON dans les logs système.Module 2 : Flux métier avec PersistanceExtension du système pour inclure une logique de stockage.Scénario : Création d'un utilisateur (User).Flux : Requête REST → Production Message → RabbitMQ → Consommation → Mapping JPA → MySQL.5. Flux de Données CibleLe schéma suivant illustre le parcours d'une donnée du client jusqu'à la base de données :Client envoie un JSON à l'API du Producer.Producer route le message vers un Topic Exchange avec une Routing Key spécifique.RabbitMQ délivre le message dans la queue liée.Consumer récupère le message, le désérialise en objet User.Repository sauvegarde l'objet dans MySQL.

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

