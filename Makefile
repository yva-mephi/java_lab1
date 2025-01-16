JAVAC = javac
JAVA = java
SRC = src
CLASSES = $(SRC)/Main.class $(SRC)/Student.class

all: compile run

compile:
	$(JAVAC) $(SRC)/*.java

run:
	$(JAVA) -cp $(SRC) Main

clean:
	rm -f $(SRC)/*.class
