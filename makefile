JC = javac
JCFLAGS = -encoding UTF-8

JVM = java
JVMFLAGS = 

###Désolé monsieur on avait pas le temps de chercher comment faire un makefile qui contient une boucle au niveau du diagramme###
Launcher.class : Launcher.java
	${JC} ${JCFLAGS} Launcher.java

run : Launcher.class
	${JVM} ${JVMFLAGS} Launcher

clean : 
	-rm -f *.class

mrproper : clean Launcher.class

.PHONY : run clean mrproper