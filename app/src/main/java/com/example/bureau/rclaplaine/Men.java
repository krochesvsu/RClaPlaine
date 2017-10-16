package com.example.bureau.rclaplaine;

public class Men {
    private String name;
    private String description;
    private String description2;
    private String description3;

    public static final Men[] mens = {
            new Men("Calendrier",
                    "Lacapelle\nLa Plaine\nUzerche\nGourdon\nLa Plaine\nGuéret\nLa Plaine\nArpajon\nLa Plaine\nRiom\nLa Plaine\nLa Plaine\nSaint Cernin\nLa Plaine\nLa Plaine\nVichy\nLa Plaine\nFigeac\nLa Plaine\nMauriac\nLa Plaine\nUssel",
                    "32-6\n5-29\n37-3\n44-10\n22/10\n29/10\n05/11\n19/11\n26/11\n03/12\n10/12\n14/01\n21/01\n28/01\n11/02\n18/02\n04/03\n11/03\n18/03\n25/03\n08/04\n22/04",
                    "La Plaine\nSaint Cernin\nLa Plaine\nLa Plaine\nVichy\nLa Plaine\nFigeac\nLa Plaine\nMauriac\nLa Plaine\nUssel\nLacapelle\nLa Plaine\nUzerche\nGourdon\nLa Plaine\nGuéret\nLa Plaine\nArpajon\nLa Plaine\nRiom\nLaplaine"),
            new Men("Classement",
                    "Equipes\n1 - Vichy\n2 - Arpajon Veinazes\n3 - Saint Cernin\n4 - Figeac\n5 - Lacapelle Marival\n6 - Mauriac\n7 - Uzerche\n8 - Guéret\n9 - Gourdon\n10 - Ussel\n11 - Riom\n12 - Clermont La Plaine",
                    "",
                    "Points\n20\n18\n15\n11\n10\n9\n9\n6\n5\n4\n2\n1"),
            new Men("Palmares",
                    "2000\n2001\n2002\n2003\n2004\n2005\n2006\n2007\n2008\n2009\n2010\n2011\n2012\n2013\n2014\n2015\n2016\n2017",
                    ":\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:",
                    "Honneur\nHonneur\nPromotion d'Honneur\nPromotion d'Honneur\nPromotion d'Honneur\nPremière Série\nPremière Série\nPremière Série\nPremière Série\nPromotion d'Honneur\nPromotion d'Honneur\nPromotion d'Honneur\nHonneur\nHonneur\nHonneur\nHonneur\nHonneur\nFédéral 3"),
    };

    //Each Workout has a name and description
    private Men(String name, String description, String description2, String description3) {
        this.name = name;
        this.description = description;
        this.description2 = description2;
        this.description3 = description3;
    }

    public String getDescription() {
        return description;
    }

    public String getDescription2() {
        return description2;
    }

    public String getDescription3() {
        return description3;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return this.name;
    }
}
