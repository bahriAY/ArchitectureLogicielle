# TP Architecture Logicielle / Inf4043 - 2017 - Jeux de lettres

 GROUPE:	Bahri AY  -  Fabrice LAURENT
 
 
 CLASSE:	TCSI1
 
 
Responsabilité de chaque package:

- decor: Affiche les motifs à chaque tour (design)

- dictionary: charge le dictionnaire et verifie si la saisie de l'utilisateur
			  existe dans le dictionnaire.

- game: contient la classe principale, c'est le coeur du jeu.

- joueur: Creation des joueurs et gestion des tours

- saisiedujoueur: Demander une saisie à l'utilisateur et la preparer à etre examiné.

- verificationMot: Verifie si le mot entré n'a pas encore été trouvé 
					et si les lettres sont dans le pot commun

- gectionPot: Gestion du pot commun, ajouter et retirer des lettres dans le pot commun



Trois principes SOLID ou Design Pattern:

S: Une classe doit avoir une et une seule responsabilité, c'est ce que nous pouvons observer grace à nos classes VerifyUnicity ou VerifyLettres, qui ont chacune une fonction.
	La classe VerifyLettres doit seulement verifier si le mot entré par le joueur comporte bien des lettres qui sont dans le pot commun.
	La classe VerifyUnicity doit seulement verifier si le mot entré par le joueur n'a pas déjà été trouvé par lui meme.
	
  - pourquoi avez-vous utilisé ce design pattern / principe ? Qu'est-ce que cela vous a apporté ? Comment l'avez-vous appliqué ? 
  
  Nous avions utilisé MAVEN car nous l'avions déjà utilisé pour le module d'Ingenierie Logicielle en 3A.
  Nous connaissons sa simplicitée en terme de comprehension du projet grace au concept POM.
  En utilisant Maven nous avions eu plus de facilités car comparé à un projet normal, nous avons plus de flexibilité à réutiliser des fonctions simples et repondants à des besoins precis. 
  
Pour compiler et lancer le projet, il faut compiler la classe jeudelettre qui est la classe principale du jeu.


