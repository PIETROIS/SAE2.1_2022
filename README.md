# SAE21_2022

### L'algorithme d'Ariane
Ce projet a pour but d'étudier un algorithme de guidage, visant à conduire un objet mobile jusqu'à son but à travers un parcours d'obstacles. En hommage à la mythologie grecque, nous supposerons qu'il s'agit de Thésée, perdu dans le labyrinthe crétois, à la recherche de la sortie (on aurait pu aussi choisir une souris recherchant un morceau de fromage, ou un robot cherchant son point de ravitaillement).

Vous produirez un programme écrit en Java, sans emprunt extérieur (sauf l'API officielle), et accompagné d'un rapport. Le travail sera fait seul ou en binôme (un binôme est fortement recommandé, afin de vous permettre de vous familiariser avec les techniques de développement collaboratif)

### Principes généraux
Pour simplifier le problème, le labyrinthe sera représenté sous la forme d'une grille carrée. Chaque cellule de la grille peut être bloquée ou libre. La position initiale de Thésée ainsi que celle de la sortie pourront être placées sur n'importe quelles cases libres distinctes.
À chaque étape de la simulation, Thésée a quatre options :
  -se déplacer d'une case vers le nord,
  -se déplacer d'une case vers le sud,
  -se déplacer d'une case vers l'est,
  -se déplacer d'une case vers l'ouest.

Ce mouvement peut avoir trois conséquences :
  -la case de destination est bloquée (et Thésée n'a donc pas changé de case),
  -la case de destination est libre (et Thésée s'y est rendu),
  -la case de destination est la sortie (et la simulation est terminée).

Le programme se déroulera en trois parties : choix de la grille, choix de l'algorithme, puis test de l'algorithme.

  1. Pour choisir la grille, l'utilisateur pourra charger une grille existante (en sélectionnant un fichier au format approprié à l'aide d'un JFileChooser) ou construire une nouvelle grille.

     S'il choisit cette dernière option, l'utilisateur décidera d'abord de la taille de la grille. Il pourra ensuite partir d'une grille vide, ou d'une grille remplie aléatoirement. Il sera alors capable de modifier individuellement l'état de chaque case, puis décidera de la position initiale de Thésée et de la sortie.

     Une fois la grille terminée, l'utilisateur aura la possibilité de la sauvegarder. Vous pouvez ici aussi employer un JFileChooser pour donner à l'utilisateur le choix de l'emplacement et du nom de la sauvegarde.

  2. L'utilisateur pourra ensuite choisir entre deux algorithmes : l'un, totalement aléatoire (chaque direction a autant de chances d'être choisie), et l'autre déterministe.

     Ce dernier devra baser ses décisions uniquement sur les coordonnées actuelles de Thésée et sur sa mémoire des conséquences de ses actions précédentes. Il n'aura aucune connaissance préalable de l'emplacement des cases obstruées ou de la sortie.

  3. Une fois l'algorithme et la grille choisie, l'utilisateur devra sélectionner une visualisation du déroulement de la simulation : manuelle ou automatique.

     Dans le mode manuel, l'avancement de Thésée sera représenté sur la grille, et le choix préconisé par l'algorithme pour la prochaine étape sera affiché. L'utilisateur fera défiler les étapes en appuyant sur une touche (capturée par un KeyListener), jusqu'à la fin de la simulation. Ce mode sert à voir en détail le comportement de l'algorithme.

     Dans le mode automatique, la grille n'est pas affichée, et la simulation est effectuée sans intervention de l'utilisateur. On affichera seulement le nombre d'étapes nécessaires pour compléter la simulation. Dans le cas de l'algorithme aléatoire, on fera tourner la simulation 100 fois avant d'afficher le nombre d'étapes moyen (puisque le résultat sera différent à chaque simulation).

     Vous vous efforcerez d'écrire l'algorithme déterministe le plus efficace possible. Il devra impérativement être capable de trouver la sortie si un chemin existe, et ses performances (en termes de nombre d'étapes nécessaires pour trouver la sortie) devront être visiblement meilleures que celles de l'algorithme aléatoire.

Toutes les interactions devront impérativement être en mode graphique. Les seuls affichages permis à la console sont les messages envoyés à la sortie sur erreur afin de documenter les problèmes rencontrés.