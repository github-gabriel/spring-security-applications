# Spring Security Applications

Das sind meine ersten Spring Security Applications, welche ich nach einem Tutorial von (Javabrains)[https://www.youtube.com/watch?v=sm-8qfMWEV8&list=PLqq-6Pq4lTTYTEooakHchTGglSvkZAjnE&index=2]
gemacht habe. Das ist die "Vorbereitung" auf ein größeres Projekt, was ich vorhabe, also wundert euch nicht über die manche
Beschriftungen in dem @RestController/dem API Layer. 
Hier noch einmal eine kleine Erklärung zu jeder Applikation:
## In Memory Database
Hier werden alle Nutzer "hardcoded" und im RAM zur Laufzeit gespeichert. Das ist eine der einfachsten Arten User und deren
Rolle zu speichern. Trotzdem sollte man diese Option nicht für "richtige" Applikationen nutzen, da die Daten so sehr leicht
geklaut werden können.
## Internal Datasource
In diesem Projekt nutze ich JDBC um mich zu einer internen Datenbank zu verbinden, welche User und deren Rollen beinhaltet.
Um die Schemata beider Tabellen der internen Datenbank zu erstellen nutze ich ```schema.sql``` welches, wie der Name schon sagt,
"über SQL" zwei Tabellen erstellt. Diese Tabellen werden dann mit den Daten aus ```data.sql``` initialisiert.
## JPA Authentication
Hier ist die Datenbank nicht intern sondern extern. In meinem Fall ist es eine PostgreSQL Datenbank, zu der ich mich hier über
JPA verbinde. Userinfos und Rollen kommen jetzt von einer externen Datenbank.
## Spring Security JWT
JWT ist ein Token über welchen zustandslose Applikationen sich Sachen "merken" können. JWT(JSON Web Tokens) sind sehr kompliziert
und nicht einfach zusammenzufassen, aber grundlegen, kann man sagen, dass sie eine Request des Users darstellen, abgesichert
mit einer "Unterschrift" die mit einem besonderen Algorithmus verschlüsselt wird. Eine gute Seite, um sich über JWTs zu informieren
ist https://jwt.io/. Auf jeden Fall lässt diese Applikation einfache GET Requests nicht durch, aber wenn man sich vorher
über eine POST Request autorisiert hat und den JWT aus der Antwort in die GET Request kopiert hat, wird diese GET Request(mit einem
validen JWT) zugelassen und der Inhalt wird wie erwartet zurückgegeben. Um zu überprüfen, dass dahinter keine Session IDs stecken
kann man den JWT auch wieder aus dem Header nehmen -> Die GET Request failed wieder.
