<h1>VCard</h1>
<p>REST API Zwracające informację o wyszukiwanych usługach</p>
<hr>
<h3>Endpoints</h3>
<h5>Endpoint zwraca plik .vcf dla obiektu podanego w formacie JSON</h5>

<em>GET /vcard</em>
<table>
    <thead>
    <tr>
        <td>Nazwa pola</td>
        <td>Opis</td>
        <td>Wymagane</td>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>name</td>
        <td>Nazwa usługi</td>
        <td>TAK</td>
    </tr>
    <tr>
        <td>href</td>
        <td>Link do usługi</td>
        <td>TAK</td>
    </tr>
    <tr>
        <td>email</td>
        <td>Kontakt email usługi</td>
        <td>TAK</td>
    </tr>
    <tr>
        <td>address</td>
        <td>Adres usługi</td>
        <td>TAK</td>
    </tr>
    <tr>
        <td>phone</td>
        <td>Numer kontaktowy usługi</td>
        <td>TAK</td>
    </tr>
    </tbody>
</table>
<h5>Przykładowy plik zwrócony przez endpoint.</h5>
<pre>
  BEGIN:VCARD
  VERSION:4.0
  ORG:Duet s.c. FHU
  TEL:(42) 613 12 51
  ADR:ul. Niemojewskiego 12, 91-849 Łódź
  EMAIL:gf@biuro-duet.pl
  URL:https://panoramafirm.pl/łódzkie,,łódź,bałuty,niemojewskiego,12/duet_s.c._fhu-sbckok_and.html
  END:VCARD
</pre>
<h5>Endpoint listę usług znalezionych dla podanych parametrów</h5>

<em>GET /search</em>
<table>
    <thead>
    <tr>
        <td>Nazwa pola</td>
        <td>Opis</td>
        <td>Wymagane</td>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>serviceType</td>
        <td>Typ szukanej usługi</td>
        <td>TAK</td>
    </tr>
    <tr>
        <td>location</td>
        <td>Lokalizacja usługi</td>
        <td>TAK</td>
    </tr>
    </tbody>
</table>
<h5>Przykładowy plik zwrócony przez endpoint.</h5>
<pre>
[
    {
        "name": "Wiebro Usługi księgowe Wiesława Brokan",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,polesie,wróblewskiego,61_9/wiebro_uslugi_ksiegowe_wieslawa_brokan-sbkbsw_aeo.html",
        "email": "wiebro@op.pl",
        "address": "ul. Wróblewskiego 61/9, 94-035 Łódź",
        "phone": "608 111 908"
    },
    {
        "name": "Duet s.c. FHU",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,bałuty,niemojewskiego,12/duet_s.c._fhu-sbckok_and.html",
        "email": "gf@biuro-duet.pl",
        "address": "ul. Niemojewskiego 12, 91-849 Łódź",
        "phone": "(42) 613 12 51"
    },
    {
        "name": "A.L.T. Księgowość Biuro usługowe Trzcianowska Anna",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,bałuty,okoniowa,12_25/a.l.t._ksiegowosc_biuro_uslugowe_trzcianowska_anna-sbdaag_and.html",
        "email": "annatrzcianowska@interia.pl",
        "address": "ul. Okoniowa 12/25, 91-498 Łódź",
        "phone": "535 577 220"
    }
]
</pre>
<h5>GET /ui/search oraz POST /ui/vcard</h5>
Endpointy mające na celu osbługę GUI. Elementy niedokończone z powodu zbytk krótrkiego czasu na realizację zadania.
<h5>Instrukcja uruchomienia projektu</h5>
<p>Do uruchomienia projektu jest wymagana instalacja OpenJDK 15 oraz Maven</p>
W celu uruchomienia projektu należy wejść do folderu zawierającego plik <pre>pom.xml</pre> a następnie w terminalu wpisać komendę <pre>mvn spring-boot:run</pre>
