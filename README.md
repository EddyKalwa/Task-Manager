# Task Manager App

Une application Android moderne dédiée à l’organisation des tâches quotidiennes, développée avec Jetpack Compose et une base de données Room.

## Fonctionnalités

- **Consultation des tâches** : Visualisation de l’ensemble des tâches, classées selon leur date d’échéance.
- **Création de tâches** : Interface simple permettant d’ajouter une nouvelle tâche avec un titre, une date de début et une date de fin.
- **Consultation des détails** : Accès à une vue détaillée pour chaque tâche via un système de navigation interne.
- **Suivi de progression** : Possibilité de marquer une tâche comme complétée ou non à l’aide d’une case à cocher.
- **Stockage local** : Sauvegarde des données en local grâce à Room, garantissant leur conservation même après fermeture de l’application.

## Aperçu

- Vue globale des tâches  
- Vue détaillée d’une tâche  
- Interface d’ajout de tâche  

## Technologies utilisées

- **Langage** : Kotlin  
- **Interface utilisateur** : Jetpack Compose (Material 3)  
- **Navigation** : Navigation Compose  
- **Base de données** : Room (avec TypeConverters pour LocalDate)  
- **Architecture** : MVVM (ViewModel, Repository, DAO)  
- **Programmation asynchrone** : Kotlin Coroutines & Flow  

## Organisation du projet

- **ui/** : Contient les éléments d’interface (écrans, composants, navigation).  
- **viewModel/** : Gère la logique métier et l’état de l’interface utilisateur.  
- **data/** : Regroupe les accès aux données et le Repository (Room).  
- **model/** : Définit la structure de données principale (entité Task).  
