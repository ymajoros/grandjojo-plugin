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
        "Il y a environ 800 sortes de bières brassées en Belgique.",
        "Les Belges consomment en moyenne 100 litres de bière par personne par an.",
        "La première academie de la bière a ouvert à Herk-de-Stad, dans la province du Limbourg, en 1999.",
        "Jean Neuhaus a inventé les pralines à Bruxelles en 1912.",
        "La Belgique produit 220.000 tonnes de chocolat par an. Ceci equivaut à 22 kg de chocolat par habitant annuellement, soit 61 grammes par jour en moyenne.",
        "L'aéroport de Bruxelles National est le plus gros point de vente de chocolat au monde.",
        "Les Belges disent avoir inventé les frites, et en effet, presque chaque ville et village semble avoir au moins une friterie.",
        "Il y a 3 sortes principales de gauffres belges : les gauffres de Liège (les plus courantes), les gauffres de Bruxelles (plus grosses, plus légères, rectangulaires, et typiquement mangées avec des fruits ou de la crème glacée), et les galettes (rien à voir avec les galettes française de Bretagne; ce sont comme des gauffres, mais plus fines, plus molles et mangées d'habitude au petit-déjeuner, parfois avec de la confiture).",
        "La Belgique est renommée pour ses boulangeries et pâtisseries. Parmis les spécialités locales, on trouve le cramique (pain sucré aux jaunes d'oeux et raisins secs), le cougnou (une spécialité wallonne d'hivers), les gozettes et les tartes. Les tartrs les plus typiquement belges sont celles aux cerises, aux prunes, aux pommes, au sucre, et par dessus tout au riz (une spécialité originaire de Verviers, près de Liège).",
        "La Belgique a la plus basse proportion de McDonald's par habitant dans les pays développés, avec seulement 0,062 restaurants pour 10.000 personnes, soit 7x moins qu'au Etats-Unis, 4x moins qu'au Japon, et deux fois moins qu'en France ou en Allemagne.",
        "La Foire de Libramont est la plus grande foire agriculturelle, forestière et agro-alimentaire d'Europe.",
        "La Belgique a légalisé l'euthanasie en 2002, et le mariage des homosexuels en 2003.",
        "En 2006, la Belgique est devenue le premier pays au monde à interdire les bombes à sous-munitions, et le deuxième à interdire les marriages forcés.",
        "En mars 2003, la Belgique a été le premier pays, avec l'Italie, à introduire l'usage de cartes d'identités électroniques. Elle fut aussi le premier pays européen à remettre des identités électroniques (e-ID) à l'entièreté de la population.",
        "La Belgique fut le premier pays au monde à délivrer des passeports électroniques conformes aux recommendations de l'ICAO (International Civil Aviation Organization).",
        "La Belgique est le pays avec les plus haute proportion de femmes ministres au monde (55% en 2000) et un des premiers à elir une femme au Parlement (en 1921).",
        "La Belgique est un des rares pays où l'education est obligatoire jusqu'à 18 ans (l'âge minimal le plus haut au monde).",
        "La Belgique fait partie d'une poignée de pays dans le monde où le vote politique est obligatoire (avec sanctions).",
        "La possession de jusque 3 grammes de cannabis est légale en Belgique.",
        "24 millions de pillules d'ecstasy sont consommée en Belgique chaque année.",
        "Les taxes en Belgique sont parmis les plus hautes au monde, avec environ 40% de revenus bruts cédés aux impots pour une famille avec un seul salaire. Une étude de 2005 a montré que la Belgique avait le plus haut taux moyen d'impôt sur le revenu des 30 pays de l'OCDE. Le total impôts représente 45.6 % du PNB du pays. Les droits de succession peuvent atteindre jusqu'à 80 %. La famille royale à elle seule reçoit 12 millions d'euro des contribuables chaque année.",
        "La Belgique est le pays qui accorde le plus de naturalisations par habitant au monde après le Canada.",
        "La Belgique a été élue 9 fois au Conseil de Sécuriité de l'ONU (en 1947, 1948, 1955, 1956, 1971, 1972, 1991, 1992, et 2007), le 9ème plus haut score au monde. La Belgique a été élue plus de fois que l'Allemagne, l'Espagne, le Mexique, l'Australie ou l'Indonesie.",
        "Le système autoroutier belge est la seule structure humaine visible de la Lune (la nuit, du moins, à cause de l'éclairage tout le long du réseau).",
        "La Belgique est le 3ème pays au monde avec le plus de vehicules par km2, après les Pays-Bas et le Japon. Elle a cependant le plus haute densité de routes et de chemins de fer au monde.",
        "Seuls 12% des camions passant sur le territoire belge sont immatriculés en Belgique.",
        "Un sondage de 2006 a révélé que seuls 11% des navetteurs se rendant à Bruxelles en voiture prendrait le train si celui-ci était gratuit.",
        "Le plus grand ascenseur à bateau au monde est l'ascenseur funiculaire de Strepy-Thieu (73,15 m de haut) dans la province du Hainaut.",
        "Le premier gratte-ciel d'Europe fut construit à Anvers en 1928 (le \"Torengebouw\").",
        "La plus longue ligne de tramway au monde est le Tram de la côte belge (kusttram en néerlandais), qui ouvrit en 1885 et relie les 68 km entre La Panne et Knokke-Heist, de la frontière française à la frontière néerlandaise.",
        "Le circuit de Spa-Francorchamps est le plus long et le deuxieme plus vieux circuit de Formule 1 encore actuellement utilisé (son premier Grand Prix y fut tenu en 1924, deux ans après l'Autodromo Nazionale di Monza en Italie).",
        "Le record du monde d'acceleration de 0 à 100 km/h (en 3,266 secondes) est détenu par la Vertigo, la seule voiture de sport belge.",
        "Les premieres sources thermales modernes d'Europe ouvrirent à Spa au 18ème siècle.",
        "Le premier casino d'Europe, la Redoute, ouvrit en 1763 à Spa.",
        "Les Galeries St Hubert à Bruxelles ouvrirent en 1847, ce qui en font les plus vieilles galeries commerçantes d'Europe.",
        "Le Palais de Justice de Bruxelles est le plus grand palais de justice au monde avec un superficie construite de 26.000 m² au sol, plus que la Basilique Saint Pierre de Rome (21,000 m²).",
        "L'Association des Aéroports Européens a annoncé dans un rapport en 2006 que l'Aéroport de Bruxelles National (Zaventem) était le plus ponctuel des 27 plus grands aéroports européens.",
        "La Palais Royal de Bruxelles, construit dans un style néoclassique similaire à celui de Buckingham Palace à Londres, a une façade 50% plus longue que son équivalent britannique.",
        "80% des joueurs de billards dans le monde utilisent des boules de fabrication belge.",
        "La Belgique produit la plus grande variété de briques au monde.",
        "L'homme le plus grand d'Europe est belge (Alain Delaunois, 2m30)",
        "La fille la plus riche au monde vît à Bruxelles (Athina Onassis Roussel de Miranda, petite-fille et seule héritière du milliardaire grec Aristotle Onassis)",
        "En 2003, il y avait 884 séries de bandes-dessinées belges enregistrées, par rapport à 104 en 1985 (soit une augmentation de 750%).",
        "La Belgique a plus de créateurs de bandes dessinées au km2 que n'importe quel autre pays, même le Japon.",
        "En 70 ans d'existence, 200 million d'exemplaires des \"Aventures de Tintin\" ont été vendue dans le monde.",
        "La moitié des ménages belges a au moins un animal de compagnie. Il y a plus de 2 millions de chiens et de chats domestiques dans le pays, pour 10 million d'habitants.",
        "97% des ménages belges sont recoivent la TV cablée - le plus haut pourcentage au monde. Les 3% restant sont principalement des étrangers, qui préferent le satellite.",
        "Les Belges sont les consommateurs les plus avides de coupons de réduction, juste devant les Etats-Unis.",
        "Durbuy est considérée la \"plus petite ville du monde\". Bien que ne comptant que quelques 500 habitants de nos jours, elle fut accordée le titre de \"ville\" au moyen-âge, qu'elle n'a pas perdu depuis.",
        "La Belgique a la plus haute densité de collectionneurs d'art au monde.",
        "Il y a plusieurs carnavals en Wallonie, dont ceux de Binche, Alost, Fosse-la-Ville et Malmedy.",
        "Il n'y a pas qu'un seul Manneken Pis en Belgique. En plus de la célèbre statue à Bruxelles, Grammont possède une statue semblable d'un petit garçon en train de se soulager devant l'Hôtel de Ville, qui elle date du 15ème siècle, prédatant ainsi son sosie bruxellois de 160 ans.",
        "1.6 million de personnes en Belgique sont des immigrants, ou (petit-)enfants d'immigrants, soit 15% de la population totale. Ceci inclut notamment 280.000 personnes d'origine italienne et 240.000 d'origine marocaine.",
        "Un rapport de l'UNICEF de 2007 sur le bien-être des enfants dans les pays riches a classé la Belgique en première position pour le bien-être éducatif des enfants.",
        "Clovis (466-511), le roi franc qui a conquis la Gaule romaine et est souvent considéré comme le premier roi de France, est né et a grandi à Tournai (une ville fondée par les Romains en 50 avant notre ère), comme le furent son père Childebert et son grand-père Mérovée, de fondateur de la dynastie mérovingienne.",
        "Charles Martel (686-741) sauva l'Europe de l'islamisation en battant les envahisseurs musulmans à la Bataille de Poitiers en 732. Il est aussi le fondateur de la dynastie carolingienne. Il naquit à Herstal, près de Liège.",
        "Charlemagne (742-814), roi des Francs et fondateur du Saint Empire Romain Germanique, naquit et grandit près de Liège en Wallonie. Il établit la capitale de son empire à Aix-la-Chapelle (Aachen), à 40km de sa ville natale de Liège.",
        "En 1066, Huy devint la première ville européenne à obtenir une charte, ce qui en fait le plus vieille ville libre du continent.",
        "Des peintres belges auraient inventé la peinture à l'huile au 15ème siècle (probablement Jan van Eyck).",
        "Plusieurs des 191 personnes consacrées aux temple du Walhalla (mémorial des grands hommes de la nation allemande) à Ratisbonne, sont natifs de Belgique, notamment 5 peintres flamands et 5 monarques francs natifs de Wallonie (Clovis, Charles Martel, Pépin de Herstal, Pépin le Bref, et Charlemagne).",
        "Charles Quint, Empereur du Saint Empire germanique, roi d'Espagne et de l’Amérique espagnole, de Naples et de Sicile, et monarque des territoires bourguignons (notamment les Pays-Bas), naquit et fut élevé à Gand, avec le français comme langue d'éducation. Le plus grand souverain de la Renaissance, célèbre pour avoir déclaré \"le soleil ne se couche jamais sur mon empire\", était peut-être très international, mais belge de naissance et d'éducation.",
        "Le terme \"gaz\" a été proposé par le chimiste flamand Jan Baptist van Helmont (1577-1644) d'après l'écriture phonétique de la prononciation néerlandaise du mot grec \"chaos\".",
        "Les deux premiers journaux imprimés au monde fûrent publiés en 1605, l'un à Strasbourg (alors en Allemagne), et l'autre (le Nieuwe Tijdingen) à Anvers.",
        "Le missionaire jésuite belge Ferdinand Verbiest (1623-1688) fonda l'Observatoire de Pékin. Il fut le secretaire de l'empereur de Chine Kang-Hi, pour qui il construisit aussi 400 canons.",
        "Les ancêtres paternels de Ludwig van Beethoven sont originaires de Malines, et avant cela des villages adjacents de Boortmeerbeek et de Kampenhout.",
        "Le saxophone a été inventé au début des années 1840 par Adolphe Sax à Dinant.",
        "L’indice de masse corporelle (IMC), encore utilisé de nos jours pour connaître son poid idéal, fut conçu par le statisticien et anthropométriste belge Adolphe Quetelet (1796-1874).",
        "Karl Marx (1818-1883) écrivit son fameux Manifeste avec Engels lors de son exil à Bruxelles, entre 1845 et 1848.",
        "Victor Hugo (1802-1885) vécut en exil à Bruxelles en 1851-52, 1861 et encore de 1866 à 1870. Il acheva son chef-d'oeuvre Les Misérables lors d'un voyage à Waterloo en 1861.",
        "Bruxelles fut aussi la résidence temporaire d'autres célèbres français en exil, tels que Jacques-Louis David (de 1815 à 1825), Alexandre Dumas (1851), Charles Baudelaire (de 1864 à 1867), Napoléon IV (1870), Auguste Rodin (de 1870 à 1886) et Paul Verlaine (1872 to 1873).",
        "Le Baron Édouard Empain (1852-1929), financier et industriel belge, fonda un groupe qui construisit notamment les lignes urbaines de tramway électriques en Europe, en Russie, en Chine, au Congo belge, et au Caire. En 1906, Empain établit la Heliopolis Oasis Company, conçue comme une \"ville de luxe et de loisir\", qui devint la ville moderne def Heliopolis dans la banlieue du Caire. L'endroit est bien connu pour son temple Hindou, ainsi que le Heliopolis Palace Hotel (servant maintenant de palais présidentiel à Hosni Mubarak) et la Heliopolis House.",
        "C'est le belge Jean Jadot (1862-1932) qui construisit la ligne de chemin de fer de 1200km reliant Pékin à Hankou en 1900. Il dirigea aussi la construction du tramway du Caire, ainsi que des lignes de chemin de fer en Basse Egypte.",
        "La dernière impératrice du Mexique fut Charlotte de Belgique (1840-1927), fille du roi Leopold I de Belgique, lui-même oncle de la reine Victoria du Royaume-Uni.",
        "La première représentation cinematographiaue en Belgique eut lieu le 1 mars 1896 aux Galeries Saint-Hubert à Bruxelles, soit juste quelques mois après le tout premier film jamais commercialisé, à Paris en 1895.",
        "En 1920, la Belgique devint le 6ème pays au monde (sur 21 jusqu'ici) à organiser les Jeux Olympiques (à Anvers).",
        "La Belgique fournit l'uranium de la bombe atomique lancée par les Américains sur Hiroshima. Il venait de la colonie du Congo belge.",
        "Le célèbre Club Med fut créé en 1950 par l'ancien champion belge de water polo Gérard Blitz. La société est maintenant basée à Paris.",
        "En 1966, le chanteur belge (natif de Sicile) Salvatore Adamo (1943-) atteint la deuxième meilleure vente de disques au monde après les Beattles. Il a vendu plus de 80 millions de copies de ses albums dans le monde jusqu'à aujourd'hui.",
        "La physicienne et mathématicienne belge Ingrid Daubechies (1954-) developa le modèle mathematique utilisé par le FBI pour stocker les empruntes digitales.",
        "Le Concours Reine Elisabeth, fondé en 1957 et ayant lieu à Bruxelles, est considéré comme l'un des concours de musique classique les plus prestigieux, mais aussi un des plus difficiles au monde.",
        "La Belgique est un des pays les plus densément peuplés au monde, avec une densité de population équivalente à celle du Japon, de l'Inde, de l'Angleterre ou des Pay-Bas voisins.",
        "Bien que la Belgique ne soit que 321 fois plus petite que les Etats-Unis ou 18 fois plus petite que la France, avec une population de 10,5 millions d'habitants, elle serait le 8ème état américain le plus peuplé. En d'autres termes, sa population est à peu près égale à celles du Poitou-Charentes, de l'Aquitaine, du Midi-Pyrénées, du Languedoc-Roussillon et de l'Auvergne combinés, soit tout le Sud-Ouest, de la France de La Rochelle à Nîmes.",
        "La Belgique a 3 langues officielles. Le Nord (la Flandre) parle le néerlandais, le Sud (la Wallonie) parle le français, et une toute petite région à l'Est parle l'allemand (moins d'1% de la population). Les habitants de Bruxelles, au centre du pays, parlent principalement français, néerlandais et anglais. Beaucoup de Belges sont par conséquent bilingues ou trilingues.",
        "La Belgique est un des pays les plus proches du Royaume-Uni (Bruxelles n'est qu'à 2 heures de Londres en TGV), et il est intéressant de noter que l'anglais est une langue hybride descendue de langues germaniques (l'anglo-saxon et le vieux scandinave, proches ancêtres du néerlandais) et latines (ancien français et latin, ancêtres du français). De nos jours, la langue germanique la plus proche de l'anglais est toujours le néerlandais, tandis que beaucoup des mots anglais ont gardés une orthographe identique ou presque à celle du français.",
        "Etant donné que les Belges parlent le français et le néerlandais, l'anglais devrait être la langue la plus facile à apprendre pour eux. Il est d'ailleurs de plus en plus courant pour les jeunes Flamands et Wallons de communiquer entre eux en anglais plutôt que dans la langue de l'autre. Cela évite aussi de devoir décider quelle langue utiliser, ou que l'une des parties soient avantagée en parlant sa langue maternelle.",
        "En 1820, la Belgique avait le 2ème plus haut PNB par habitant d'Europe après celui des Pays-Bas (bien que n'étant qu'un seul et même pays a l'époque). En 1900, elle était en tête de l'Europe, avec un revenu individuel moyen de plus de deux fois supérieur à celui de l'Italie ou de la Norvège. En 1950, après deux guerres dévastatrices, La Belgique était tombée en 5ème position,derrière la Belgique, la Suède, le Danemark et les Pays-Bas, qui étaient restés neutres ou avaient soufferts moins pendant les deux guerres mondiales. (sources : Nationmaster).",
        "En 2004, la Belgique avait le 5ème plus haut PNB par habitant (PPA) de l'Union Européenne, apres le Luxembourg, l'Irelande, le Danemark et l'Autriche. Bruxelles est la ville d'Europe avec le 3ème plus haut PNB par habitant, après Luxembourg et le centre de Londres.",
        "D'après les statistiques de commerce international de l'Organisation mondiale du commerce, la Belgique est le premier exportateur mondial de chocolat (en 2000) et de médicaments (en 2003), le 4ème exportateur mondial d'autres produits pharmaceutiques (en 2003), sucreries (en 2001-02, et 3ème en 1999), de boissons non-alcolisées (en 2003), d'oeufs (en 2003) et de farines de céréales (en 2003), entre autres.",
        "Anvers est le 6ème plus grand port au monde en termes de tonnage (2ème en dehors d'Extreme Orient, après Rotterdam). C'est aussi le 3ème port d'Europe pour la circulation des container, après Rotterdam et Hambourg.",
        "La Belgique est aussi le principal centre diamantaire au monde (à Anvers) et le deuxième plus grand centre pétrochimique. 90% des diamands bruts du mondesont négociés et distribués à Anvers.",
        "Malgré sa petite taille, la Belgique est le principal partenaire commercial de l'Inde avec le Royaume-Uni (en partie à cause des secteurs du diamand et de l'acier).",
        "La Belgique est le premier investisseurs étrangers dans plusieurs pays en développement, comme par exemple la Bulgarie.",
        "Le nom \"Belgique\" dérive du Latin \"Belgica\" ou \"Belgium\", qui était le nom de la région comprenant le nord de la France, la Belgique et le sud des Pays-Bas actuels.",
        "Quand au début du 17ème siècle des colons néerlandais s'établir en Amerique du Nord, dans la region entre la Virgine et la Nouvelle Angleterre, il nomèrent leur colonie Novum Belgium (ou Novo Belgio, Nova Belgica, Novi Belgii ou en néerlandais Nieuwe Nederland). La raison derrière cela est que \"Belgium\" était le terme Latin décrivant les Pays-Bas (donc, à l'époque, presque tout le Benelux + le nord de la France), et que les noms latins étaient courrant à l'époque (il y eut entre autres Nova Scotia, c'est-à-dire la Nouvelle Ecosse, qui est toujours appelée ainsi). Parmis les colons des Pays-Bas qui achetèrent l'île de Manhattan aux Amerindiens, beaucoup venait de l'actuelle Belgique -- la plupart de Wallonie. Pierre Minuit lui-même était wallon.",
        "La longue neutralité historique de la Belgique, et sa position stratégique au coeur de l'Europe occidentale, lui valut d'être choisie pour le siège de nombreuses institutions internationales, tels que l'Union Européenne ou l'OTAN. En fait, le centre géographique exact de l'Europe des 15 (c'est-à-dire avant l'élargissement de 2004) était situé à Oignies-en-Thiérache, à l'extremité sud de la province de Namur, à quelques kilomètres de la frontière française.",};

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
