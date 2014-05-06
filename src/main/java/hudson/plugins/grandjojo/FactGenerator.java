/**
 * Copyright (c) 2009 Cliffano Subagio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package hudson.plugins.grandjojo;

import java.util.Random;

/**
 * {@link FactGenerator} provides Grand Jojo facts.
 *
 * @author cliffano
 */
public class FactGenerator {

    /**
     * The configured Grand Jojo facts, from <a
     * href="http://www.eupedia.com/guide_de_voyage/belgique/faits_interessants_et_anecdotes.shtml">http://www.eupedia.com/guide_de_voyage/belgique/faits_interessants_et_anecdotes.shtml</a>
     */
    private static final String[] FACTS = {
        "Il y a environ 800 sortes de bi�res brass�es en Belgique.",
        "Les Belges consomment en moyenne 100 litres de bi�re par personne par an.",
        "La premi�re academie de la bi�re a ouvert � Herk-de-Stad, dans la province du Limbourg, en 1999.",
        "Jean Neuhaus a invent� les pralines � Bruxelles en 1912.",
        "La Belgique produit 220.000 tonnes de chocolat par an. Ceci equivaut � 22 kg de chocolat par habitant annuellement, soit 61 grammes par jour en moyenne.",
        "L'a�roport de Bruxelles National est le plus gros point de vente de chocolat au monde.",
        "Les Belges disent avoir invent� les frites, et en effet, presque chaque ville et village semble avoir au moins une friterie.",
        "Il y a 3 sortes principales de gauffres belges : les gauffres de Li�ge (les plus courantes), les gauffres de Bruxelles (plus grosses, plus l�g�res, rectangulaires, et typiquement mang�es avec des fruits ou de la cr�me glac�e), et les galettes (rien � voir avec les galettes fran�aise de Bretagne; ce sont comme des gauffres, mais plus fines, plus molles et mang�es d'habitude au petit-d�jeuner, parfois avec de la confiture).",
        "La Belgique est renomm�e pour ses boulangeries et p�tisseries. Parmis les sp�cialit�s locales, on trouve le cramique (pain sucr� aux jaunes d'oeux et raisins secs), le cougnou (une sp�cialit� wallonne d'hivers), les gozettes et les tartes. Les tartrs les plus typiquement belges sont celles aux cerises, aux prunes, aux pommes, au sucre, et par dessus tout au riz (une sp�cialit� originaire de Verviers, pr�s de Li�ge).",
        "La Belgique a la plus basse proportion de McDonald's par habitant dans les pays d�velopp�s, avec seulement 0,062 restaurants pour 10.000 personnes, soit 7x moins qu'au Etats-Unis, 4x moins qu'au Japon, et deux fois moins qu'en France ou en Allemagne.",
        "La Foire de Libramont est la plus grande foire agriculturelle, foresti�re et agro-alimentaire d'Europe.",
        "La Belgique a l�galis� l'euthanasie en 2002, et le mariage des homosexuels en 2003.",
        "En 2006, la Belgique est devenue le premier pays au monde � interdire les bombes � sous-munitions, et le deuxi�me � interdire les marriages forc�s.",
        "En mars 2003, la Belgique a �t� le premier pays, avec l'Italie, � introduire l'usage de cartes d'identit�s �lectroniques. Elle fut aussi le premier pays europ�en � remettre des identit�s �lectroniques (e-ID) � l'enti�ret� de la population.",
        "La Belgique fut le premier pays au monde � d�livrer des passeports �lectroniques conformes aux recommendations de l'ICAO (International Civil Aviation Organization).",
        "La Belgique est le pays avec les plus haute proportion de femmes ministres au monde (55% en 2000) et un des premiers � elir une femme au Parlement (en 1921).",
        "La Belgique est un des rares pays o� l'education est obligatoire jusqu'� 18 ans (l'�ge minimal le plus haut au monde).",
        "La Belgique fait partie d'une poign�e de pays dans le monde o� le vote politique est obligatoire (avec sanctions).",
        "La possession de jusque 3 grammes de cannabis est l�gale en Belgique.",
        "24 millions de pillules d'ecstasy sont consomm�e en Belgique chaque ann�e.",
        "Les taxes en Belgique sont parmis les plus hautes au monde, avec environ 40% de revenus bruts c�d�s aux impots pour une famille avec un seul salaire. Une �tude de 2005 a montr� que la Belgique avait le plus haut taux moyen d'imp�t sur le revenu des 30 pays de l'OCDE. Le total imp�ts repr�sente 45.6 % du PNB du pays. Les droits de succession peuvent atteindre jusqu'� 80 %. La famille royale � elle seule re�oit 12 millions d'euro des contribuables chaque ann�e.",
        "La Belgique est le pays qui accorde le plus de naturalisations par habitant au monde apr�s le Canada.",
        "La Belgique a �t� �lue 9 fois au Conseil de S�curiit� de l'ONU (en 1947, 1948, 1955, 1956, 1971, 1972, 1991, 1992, et 2007), le 9�me plus haut score au monde. La Belgique a �t� �lue plus de fois que l'Allemagne, l'Espagne, le Mexique, l'Australie ou l'Indonesie.",
        "Le syst�me autoroutier belge est la seule structure humaine visible de la Lune (la nuit, du moins, � cause de l'�clairage tout le long du r�seau).",
        "La Belgique est le 3�me pays au monde avec le plus de vehicules par km2, apr�s les Pays-Bas et le Japon. Elle a cependant le plus haute densit� de routes et de chemins de fer au monde.",
        "Seuls 12% des camions passant sur le territoire belge sont immatricul�s en Belgique.",
        "Un sondage de 2006 a r�v�l� que seuls 11% des navetteurs se rendant � Bruxelles en voiture prendrait le train si celui-ci �tait gratuit.",
        "Le plus grand ascenseur � bateau au monde est l'ascenseur funiculaire de Strepy-Thieu (73,15 m de haut) dans la province du Hainaut.",
        "Le premier gratte-ciel d'Europe fut construit � Anvers en 1928 (le \"Torengebouw\").",
        "La plus longue ligne de tramway au monde est le Tram de la c�te belge (kusttram en n�erlandais), qui ouvrit en 1885 et relie les 68 km entre La Panne et Knokke-Heist, de la fronti�re fran�aise � la fronti�re n�erlandaise.",
        "Le circuit de Spa-Francorchamps est le plus long et le deuxieme plus vieux circuit de Formule 1 encore actuellement utilis� (son premier Grand Prix y fut tenu en 1924, deux ans apr�s l'Autodromo Nazionale di Monza en Italie).",
        "Le record du monde d'acceleration de 0 � 100 km/h (en 3,266 secondes) est d�tenu par la Vertigo, la seule voiture de sport belge.",
        "Les premieres sources thermales modernes d'Europe ouvrirent � Spa au 18�me si�cle.",
        "Le premier casino d'Europe, la Redoute, ouvrit en 1763 � Spa.",
        "Les Galeries St Hubert � Bruxelles ouvrirent en 1847, ce qui en font les plus vieilles galeries commer�antes d'Europe.",
        "Le Palais de Justice de Bruxelles est le plus grand palais de justice au monde avec un superficie construite de 26.000 m� au sol, plus que la Basilique Saint Pierre de Rome (21,000 m�).",
        "L'Association des A�roports Europ�ens a annonc� dans un rapport en 2006 que l'A�roport de Bruxelles National (Zaventem) �tait le plus ponctuel des 27 plus grands a�roports europ�ens.",
        "La Palais Royal de Bruxelles, construit dans un style n�oclassique similaire � celui de Buckingham Palace � Londres, a une fa�ade 50% plus longue que son �quivalent britannique.",
        "80% des joueurs de billards dans le monde utilisent des boules de fabrication belge.",
        "La Belgique produit la plus grande vari�t� de briques au monde.",
        "L'homme le plus grand d'Europe est belge (Alain Delaunois, 2m30)",
        "La fille la plus riche au monde v�t � Bruxelles (Athina Onassis Roussel de Miranda, petite-fille et seule h�riti�re du milliardaire grec Aristotle Onassis)",
        "En 2003, il y avait 884 s�ries de bandes-dessin�es belges enregistr�es, par rapport � 104 en 1985 (soit une augmentation de 750%).",
        "La Belgique a plus de cr�ateurs de bandes dessin�es au km2 que n'importe quel autre pays, m�me le Japon.",
        "En 70 ans d'existence, 200 million d'exemplaires des \"Aventures de Tintin\" ont �t� vendue dans le monde.",
        "La moiti� des m�nages belges a au moins un animal de compagnie. Il y a plus de 2 millions de chiens et de chats domestiques dans le pays, pour 10 million d'habitants.",
        "97% des m�nages belges sont recoivent la TV cabl�e - le plus haut pourcentage au monde. Les 3% restant sont principalement des �trangers, qui pr�ferent le satellite.",
        "Les Belges sont les consommateurs les plus avides de coupons de r�duction, juste devant les Etats-Unis.",
        "Durbuy est consid�r�e la \"plus petite ville du monde\". Bien que ne comptant que quelques 500 habitants de nos jours, elle fut accord�e le titre de \"ville\" au moyen-�ge, qu'elle n'a pas perdu depuis.",
        "La Belgique a la plus haute densit� de collectionneurs d'art au monde.",
        "Il y a plusieurs carnavals en Wallonie, dont ceux de Binche, Alost, Fosse-la-Ville et Malmedy.",
        "Il n'y a pas qu'un seul Manneken Pis en Belgique. En plus de la c�l�bre statue � Bruxelles, Grammont poss�de une statue semblable d'un petit gar�on en train de se soulager devant l'H�tel de Ville, qui elle date du 15�me si�cle, pr�datant ainsi son sosie bruxellois de 160 ans.",
        "1.6 million de personnes en Belgique sont des immigrants, ou (petit-)enfants d'immigrants, soit 15% de la population totale. Ceci inclut notamment 280.000 personnes d'origine italienne et 240.000 d'origine marocaine.",
        "Un rapport de l'UNICEF de 2007 sur le bien-�tre des enfants dans les pays riches a class� la Belgique en premi�re position pour le bien-�tre �ducatif des enfants.",
        "Clovis (466-511), le roi franc qui a conquis la Gaule romaine et est souvent consid�r� comme le premier roi de France, est n� et a grandi � Tournai (une ville fond�e par les Romains en 50 avant notre �re), comme le furent son p�re Childebert et son grand-p�re M�rov�e, de fondateur de la dynastie m�rovingienne.",
        "Charles Martel (686-741) sauva l'Europe de l'islamisation en battant les envahisseurs musulmans � la Bataille de Poitiers en 732. Il est aussi le fondateur de la dynastie carolingienne. Il naquit � Herstal, pr�s de Li�ge.",
        "Charlemagne (742-814), roi des Francs et fondateur du Saint Empire Romain Germanique, naquit et grandit pr�s de Li�ge en Wallonie. Il �tablit la capitale de son empire � Aix-la-Chapelle (Aachen), � 40km de sa ville natale de Li�ge.",
        "En 1066, Huy devint la premi�re ville europ�enne � obtenir une charte, ce qui en fait le plus vieille ville libre du continent.",
        "Des peintres belges auraient invent� la peinture � l'huile au 15�me si�cle (probablement Jan van Eyck).",
        "Plusieurs des 191 personnes consacr�es aux temple du Walhalla (m�morial des grands hommes de la nation allemande) � Ratisbonne, sont natifs de Belgique, notamment 5 peintres flamands et 5 monarques francs natifs de Wallonie (Clovis, Charles Martel, P�pin de Herstal, P�pin le Bref, et Charlemagne).",
        "Charles Quint, Empereur du Saint Empire germanique, roi d'Espagne et de l�Am�rique espagnole, de Naples et de Sicile, et monarque des territoires bourguignons (notamment les Pays-Bas), naquit et fut �lev� � Gand, avec le fran�ais comme langue d'�ducation. Le plus grand souverain de la Renaissance, c�l�bre pour avoir d�clar� \"le soleil ne se couche jamais sur mon empire\", �tait peut-�tre tr�s international, mais belge de naissance et d'�ducation.",
        "Le terme \"gaz\" a �t� propos� par le chimiste flamand Jan Baptist van Helmont (1577-1644) d'apr�s l'�criture phon�tique de la prononciation n�erlandaise du mot grec \"chaos\".",
        "Les deux premiers journaux imprim�s au monde f�rent publi�s en 1605, l'un � Strasbourg (alors en Allemagne), et l'autre (le Nieuwe Tijdingen) � Anvers.",
        "Le missionaire j�suite belge Ferdinand Verbiest (1623-1688) fonda l'Observatoire de P�kin. Il fut le secretaire de l'empereur de Chine Kang-Hi, pour qui il construisit aussi 400 canons.",
        "Les anc�tres paternels de Ludwig van Beethoven sont originaires de Malines, et avant cela des villages adjacents de Boortmeerbeek et de Kampenhout.",
        "Le saxophone a �t� invent� au d�but des ann�es 1840 par Adolphe Sax � Dinant.",
        "L�indice de masse corporelle (IMC), encore utilis� de nos jours pour conna�tre son poid id�al, fut con�u par le statisticien et anthropom�triste belge Adolphe Quetelet (1796-1874).",
        "Karl Marx (1818-1883) �crivit son fameux Manifeste avec Engels lors de son exil � Bruxelles, entre 1845 et 1848.",
        "Victor Hugo (1802-1885) v�cut en exil � Bruxelles en 1851-52, 1861 et encore de 1866 � 1870. Il acheva son chef-d'oeuvre Les Mis�rables lors d'un voyage � Waterloo en 1861.",
        "Bruxelles fut aussi la r�sidence temporaire d'autres c�l�bres fran�ais en exil, tels que Jacques-Louis David (de 1815 � 1825), Alexandre Dumas (1851), Charles Baudelaire (de 1864 � 1867), Napol�on IV (1870), Auguste Rodin (de 1870 � 1886) et Paul Verlaine (1872 to 1873).",
        "Le Baron �douard Empain (1852-1929), financier et industriel belge, fonda un groupe qui construisit notamment les lignes urbaines de tramway �lectriques en Europe, en Russie, en Chine, au Congo belge, et au Caire. En 1906, Empain �tablit la Heliopolis Oasis Company, con�ue comme une \"ville de luxe et de loisir\", qui devint la ville moderne def Heliopolis dans la banlieue du Caire. L'endroit est bien connu pour son temple Hindou, ainsi que le Heliopolis Palace Hotel (servant maintenant de palais pr�sidentiel � Hosni Mubarak) et la Heliopolis House.",
        "C'est le belge Jean Jadot (1862-1932) qui construisit la ligne de chemin de fer de 1200km reliant P�kin � Hankou en 1900. Il dirigea aussi la construction du tramway du Caire, ainsi que des lignes de chemin de fer en Basse Egypte.",
        "La derni�re imp�ratrice du Mexique fut Charlotte de Belgique (1840-1927), fille du roi Leopold I de Belgique, lui-m�me oncle de la reine Victoria du Royaume-Uni.",
        "La premi�re repr�sentation cinematographiaue en Belgique eut lieu le 1 mars 1896 aux Galeries Saint-Hubert � Bruxelles, soit juste quelques mois apr�s le tout premier film jamais commercialis�, � Paris en 1895.",
        "En 1920, la Belgique devint le 6�me pays au monde (sur 21 jusqu'ici) � organiser les Jeux Olympiques (� Anvers).",
        "La Belgique fournit l'uranium de la bombe atomique lanc�e par les Am�ricains sur Hiroshima. Il venait de la colonie du Congo belge.",
        "Le c�l�bre Club Med fut cr�� en 1950 par l'ancien champion belge de water polo G�rard Blitz. La soci�t� est maintenant bas�e � Paris.",
        "En 1966, le chanteur belge (natif de Sicile) Salvatore Adamo (1943-) atteint la deuxi�me meilleure vente de disques au monde apr�s les Beattles. Il a vendu plus de 80 millions de copies de ses albums dans le monde jusqu'� aujourd'hui.",
        "La physicienne et math�maticienne belge Ingrid Daubechies (1954-) developa le mod�le mathematique utilis� par le FBI pour stocker les empruntes digitales.",
        "Le Concours Reine Elisabeth, fond� en 1957 et ayant lieu � Bruxelles, est consid�r� comme l'un des concours de musique classique les plus prestigieux, mais aussi un des plus difficiles au monde.",
        "La Belgique est un des pays les plus dens�ment peupl�s au monde, avec une densit� de population �quivalente � celle du Japon, de l'Inde, de l'Angleterre ou des Pay-Bas voisins.",
        "Bien que la Belgique ne soit que 321 fois plus petite que les Etats-Unis ou 18 fois plus petite que la France, avec une population de 10,5 millions d'habitants, elle serait le 8�me �tat am�ricain le plus peupl�. En d'autres termes, sa population est � peu pr�s �gale � celles du Poitou-Charentes, de l'Aquitaine, du Midi-Pyr�n�es, du Languedoc-Roussillon et de l'Auvergne combin�s, soit tout le Sud-Ouest, de la France de La Rochelle � N�mes.",
        "La Belgique a 3 langues officielles. Le Nord (la Flandre) parle le n�erlandais, le Sud (la Wallonie) parle le fran�ais, et une toute petite r�gion � l'Est parle l'allemand (moins d'1% de la population). Les habitants de Bruxelles, au centre du pays, parlent principalement fran�ais, n�erlandais et anglais. Beaucoup de Belges sont par cons�quent bilingues ou trilingues.",
        "La Belgique est un des pays les plus proches du Royaume-Uni (Bruxelles n'est qu'� 2 heures de Londres en TGV), et il est int�ressant de noter que l'anglais est une langue hybride descendue de langues germaniques (l'anglo-saxon et le vieux scandinave, proches anc�tres du n�erlandais) et latines (ancien fran�ais et latin, anc�tres du fran�ais). De nos jours, la langue germanique la plus proche de l'anglais est toujours le n�erlandais, tandis que beaucoup des mots anglais ont gard�s une orthographe identique ou presque � celle du fran�ais.",
        "Etant donn� que les Belges parlent le fran�ais et le n�erlandais, l'anglais devrait �tre la langue la plus facile � apprendre pour eux. Il est d'ailleurs de plus en plus courant pour les jeunes Flamands et Wallons de communiquer entre eux en anglais plut�t que dans la langue de l'autre. Cela �vite aussi de devoir d�cider quelle langue utiliser, ou que l'une des parties soient avantag�e en parlant sa langue maternelle.",
        "En 1820, la Belgique avait le 2�me plus haut PNB par habitant d'Europe apr�s celui des Pays-Bas (bien que n'�tant qu'un seul et m�me pays a l'�poque). En 1900, elle �tait en t�te de l'Europe, avec un revenu individuel moyen de plus de deux fois sup�rieur � celui de l'Italie ou de la Norv�ge. En 1950, apr�s deux guerres d�vastatrices, La Belgique �tait tomb�e en 5�me position,derri�re la Belgique, la Su�de, le Danemark et les Pays-Bas, qui �taient rest�s neutres ou avaient soufferts moins pendant les deux guerres mondiales. (sources : Nationmaster).",
        "En 2004, la Belgique avait le 5�me plus haut PNB par habitant (PPA) de l'Union Europ�enne, apres le Luxembourg, l'Irelande, le Danemark et l'Autriche. Bruxelles est la ville d'Europe avec le 3�me plus haut PNB par habitant, apr�s Luxembourg et le centre de Londres.",
        "D'apr�s les statistiques de commerce international de l'Organisation mondiale du commerce, la Belgique est le premier exportateur mondial de chocolat (en 2000) et de m�dicaments (en 2003), le 4�me exportateur mondial d'autres produits pharmaceutiques (en 2003), sucreries (en 2001-02, et 3�me en 1999), de boissons non-alcolis�es (en 2003), d'oeufs (en 2003) et de farines de c�r�ales (en 2003), entre autres.",
        "Anvers est le 6�me plus grand port au monde en termes de tonnage (2�me en dehors d'Extreme Orient, apr�s Rotterdam). C'est aussi le 3�me port d'Europe pour la circulation des container, apr�s Rotterdam et Hambourg.",
        "La Belgique est aussi le principal centre diamantaire au monde (� Anvers) et le deuxi�me plus grand centre p�trochimique. 90% des diamands bruts du mondesont n�goci�s et distribu�s � Anvers.",
        "Malgr� sa petite taille, la Belgique est le principal partenaire commercial de l'Inde avec le Royaume-Uni (en partie � cause des secteurs du diamand et de l'acier).",
        "La Belgique est le premier investisseurs �trangers dans plusieurs pays en d�veloppement, comme par exemple la Bulgarie.",
        "Le nom \"Belgique\" d�rive du Latin \"Belgica\" ou \"Belgium\", qui �tait le nom de la r�gion comprenant le nord de la France, la Belgique et le sud des Pays-Bas actuels.",
        "Quand au d�but du 17�me si�cle des colons n�erlandais s'�tablir en Amerique du Nord, dans la region entre la Virgine et la Nouvelle Angleterre, il nom�rent leur colonie Novum Belgium (ou Novo Belgio, Nova Belgica, Novi Belgii ou en n�erlandais Nieuwe Nederland). La raison derri�re cela est que \"Belgium\" �tait le terme Latin d�crivant les Pays-Bas (donc, � l'�poque, presque tout le Benelux + le nord de la France), et que les noms latins �taient courrant � l'�poque (il y eut entre autres Nova Scotia, c'est-�-dire la Nouvelle Ecosse, qui est toujours appel�e ainsi). Parmis les colons des Pays-Bas qui achet�rent l'�le de Manhattan aux Amerindiens, beaucoup venait de l'actuelle Belgique -- la plupart de Wallonie. Pierre Minuit lui-m�me �tait wallon.",
        "La longue neutralit� historique de la Belgique, et sa position strat�gique au coeur de l'Europe occidentale, lui valut d'�tre choisie pour le si�ge de nombreuses institutions internationales, tels que l'Union Europ�enne ou l'OTAN. En fait, le centre g�ographique exact de l'Europe des 15 (c'est-�-dire avant l'�largissement de 2004) �tait situ� � Oignies-en-Thi�rache, � l'extremit� sud de la province de Namur, � quelques kilom�tres de la fronti�re fran�aise.",};

    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();

    /**
     * Retrieves a random fact.
     *
     * @return a random fact
     */
    public String random() {
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }
}
