equipo(juan, maria).
equipo(jose, maria).
equipo(maria, juan).

legusta(maria, libro).
legusta(pedro, coche).
legusta(jose, pescado).
legusta(jose, coche).
legusta(juan,te).

amigode(juan,X):- legusta(X, coche).
amigode(pedro,X):- legusta(X,libro).
amigode(maria,X):- legusta(X,pescado).
amigode(jose,X):- legusta(X,te).

esamigo(jose,X):-amigode(juan,X).

esamigo(maria,X):-amigode(X,pedro).

compañero(juan,X):- equipo(jose,X), amigode(pedro,X).
