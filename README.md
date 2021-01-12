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
        "name": "Abak Biuro Rachunkowo-Konsultacyjne",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,bałuty,św._teresy_od_dzieciątka_jezus,91/abak_biuro_rachunkowo_konsultacyjne-sckuji_and.html",
        "email": "abak@finn.pl",
        "address": "ul. św. Teresy od Dzieciątka Jezus 91, 91-341 Łódź",
        "phone": "(42) 617 46 30"
    },
    {
        "name": "Agnieszka Gunerka Biuro rachunkowe i doradcze",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,widzew,przędzalniana,113/agnieszka_gunerka_biuro_rachunkowe_i_doradcze-sbpxtd_and.html",
        "email": "gunerkaaga@orange.pl",
        "address": "ul. Przędzalniana 113, 93-286 Łódź",
        "phone": "513 187 047"
    },
    {
        "name": "Biuro rachunkowe Elżbieta Mikołajczyk",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,bałuty,morgowa,4/biuro_rachunkowe_elzbieta_mikolajczyk-scotyh_and.html",
        "email": "biuro@biuroemikol.eu",
        "address": "ul. Morgowa 4, 91-223 Łódź",
        "phone": "(42) 651 21 18"
    },
    {
        "name": "Wiebro Usługi księgowe Wiesława Brokan",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,polesie,wróblewskiego,61_9/wiebro_uslugi_ksiegowe_wieslawa_brokan-sccptd_and.html",
        "email": "wiebro@op.pl",
        "address": "ul. Wróblewskiego 61/9, 94-035 Łódź",
        "phone": "608 111 908"
    },
    {
        "name": "Abm Consulting Adam Mularczyk",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,widzew,nawrot,9_11_7/abm_consulting_adam_mularczyk-scoduw_and.html",
        "email": "biuro@abmconsulting.com.pl",
        "address": "ul. Nawrot 9/11/7, 90-060 Łódź",
        "phone": "(42) 635 39 16"
    },
    {
        "name": "Biuro Rachunkowe Bożydar Piotrowski",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,widzew,al._piłsudskiego,133d_306/biuro_rachunkowe_bozydar_piotrowski-scmrgo_and.html",
        "email": "biuro@patentowa.com.pl",
        "address": "al. Piłsudskiego 133D/306, 92-318 Łódź",
        "phone": "601 221 104"
    },
    {
        "name": "Enigma Kancelaria Doradcy Podatkowego Biuro Rachunkowe Grażyna Burchardt",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,górna,wiwulskiego,15/enigma_kancelaria_doradcy_podatkowego_biuro_rachunkowe_grazyna_burchardt-sbfdtg_and.html",
        "email": "gburchardt@biuroenigma.pl",
        "address": "ul. Wiwulskiego 15, 93-545 Łódź",
        "phone": "(42) 630 26 12"
    },
    {
        "name": "Biuro rachunkowe Michał Lipski",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,polesie,więckowskiego,25_7/biuro_rachunkowe_michal_lipski-sbhgwp_and.html",
        "email": "biuro@brlipski.pl",
        "address": "ul. Więckowskiego 25/7, 90-727 Łódź",
        "phone": "503 701 906"
    },
    {
        "name": "Kietrys i Lesiewicz sp. z o.o. sp.k.",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,polesie,gdańska,91_93/kietrys_i_lesiewicz_sp._z_o.o._sp.k.-sbrtkf_and.html",
        "email": "biuro@kietrysilesiewicz.pl",
        "address": "ul. Gdańska 91/93, 90-613 Łódź",
        "phone": "(42) 637 39 90"
    },
    {
        "name": "European Concept Consulting Sp. z o.o.",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,bałuty,rojna,103/european_concept_consulting_sp._z_o.o.-sbnpfl_and.html",
        "email": "biuro@biuroecc.pl",
        "address": "ul. Rojna 103, 91-134 Łódź",
        "phone": "(42) 612 20 37"
    },
    {
        "name": "To-Ps s.c. Tontała I. Tontała K.",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,polesie,łąkowa,4_123/to_ps_s.c._tontala_i._tontala_k.-scjubu_and.html",
        "email": "to-ps@wp.pl",
        "address": "ul. Łąkowa 4/123, 90-563 Łódź",
        "phone": "(42) 292 06 58"
    },
    {
        "name": "European Concept Consulting Sp. z o.o.",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,bałuty,rojna,103/european_concept_consulting_sp._z_o.o.-scwslh_and.html",
        "email": "biuro@biuroecc.pl",
        "address": "ul. Rojna 103, 91-134 Łódź",
        "phone": "(42) 612 20 37"
    },
    {
        "name": "Niebo FHU. Bogusława Niepiekło",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,polesie,jęczmienna,1_3_lok._16/niebo_fhu._boguslawa_niepieklo-zcigjb_and.html",
        "email": "niebo.biurorachunkowe@gmail.com",
        "address": "ul. Jęczmienna 1/3 lok. 16, 94-202 Łódź",
        "phone": "600 828 295"
    },
    {
        "name": "Włodarczyk Bogdan. Biuro rachunkowe",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,bałuty,górnicza,30_36/wlodarczyk_bogdan._biuro_rachunkowe-sbnkhf_and.html",
        "email": "biuro104@gmail.com",
        "address": "ul. Górnicza 30/36, 91-765 Łódź",
        "phone": "789 092 568"
    },
    {
        "name": "Mobile Tax Solution Dagna Wajszczyk Biuro Rachunkowe",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,widzew,puszkina,80/mobile_tax_solution_dagna_wajszczyk_biuro_rachunkowe-sccfdr_and.html",
        "email": "biuro@mobiletax.com.pl",
        "address": "ul. Puszkina 80, 92-516 Łódź",
        "phone": "502 369 678"
    },
    {
        "name": "Małgorzata Rzepecka-Matros Biuro Rachunkowe",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,polesie,pienista,51b_30/malgorzata_rzepecka_matros_biuro_rachunkowe-scoffm_and.html",
        "email": "mmatros2@gmail.com",
        "address": "ul. Pienista 51B/30, 94-109 Łódź",
        "phone": "694 818 727"
    },
    {
        "name": "Helper Biuro rachunkowe Maria Kolibska-Bednarz",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,widzew,czajkowskiego,12_70/helper_biuro_rachunkowe_maria_kolibska_bednarz-sbtsss_and.html",
        "email": "helper@widzew.net",
        "address": "ul. Czajkowskiego 12/70, 92-511 Łódź",
        "phone": "(42) 673 14 49"
    },
    {
        "name": "Patix Biuro Rachunkowe Katarzyna Patalas",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,polesie,biegunowa,26/patix_biuro_rachunkowe_katarzyna_patalas-sbuhth_and.html",
        "email": "biuro@patix.pl",
        "address": "ul. Biegunowa 26, 94-215 Łódź",
        "phone": "516 035 585"
    },
    {
        "name": "Ostaszewska-Kalinowska D. Biuro rachunkowe",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,bałuty,bydgoska,25/ostaszewska_kalinowska_d._biuro_rachunkowe-sbkoka_and.html",
        "email": "danuta.ostaszewska.kalinowska@gmail.com",
        "address": "ul. Bydgoska 25, 91-036 Łódź",
        "phone": "(42) 651 12 91"
    },
    {
        "name": "Wiga Biuro Rachunkowe Jadwiga Wojciechowska",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,śródmieście,piotrkowska,276c_2/wiga_biuro_rachunkowe_jadwiga_wojciechowska-sbnllj_and.html",
        "email": "biurowiga@wp.pl",
        "address": "ul. Piotrkowska 276C/2, 90-361 Łódź",
        "phone": "574 310 440"
    },
    {
        "name": "Agast Agata Stanisławska",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,bałuty,klonowa,13/agast_agata_stanislawska-sbufel_and.html",
        "email": "agast.biuro@wp.pl",
        "address": "ul. Klonowa 13, 91-036 Łódź",
        "phone": "608 571 395"
    },
    {
        "name": "Alkabar Sp. z o.o.",
        "href": "https://panoramafirm.pl/łódzkie,,łódź,śródmieście,piotrkowska,121_21/alkabar_sp._z_o.o.-scbsiu_and.html",
        "email": "biuro@alkabar.com.pl",
        "address": "ul. Piotrkowska 121/21, 90-430 Łódź",
        "phone": "(42) 633 96 06"
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
