package com.example.bureau.rclaplaine;

public class Women {
    private String name;
    private String description;
    private String description2;
    private String description3;

    public static final Women[] womens = {
            new Women("Calendrier",
                    "Lille\nLa Plaine\nToulon\nCaen\nLa Plaine\nUssel\nLa Plaine\nLa Plaine\nSaint Cernin\nLa Plaine\nLa Plaine\nBordeaux\nLa Plaine\nMillau",
                    "27-12\n15-21\n14-12\n25-3\n22/10\n29/10\n19/11\n26/11\n03/12\n28/01\n11/02\n04/03\n18/03\n25/03",
                    "La Plaine\nSaint Cernin\nLa Plaine\nLa Plaine\nBordeaux\nLa Plaine\nMillau\nLille\nLa Plaine\nToulon\nCaen\nLa Plaine\nUssel\nLa Plaine"),
            new Women("Classement",
                    "Equipes\n1 - Lille\n2 - La Plaine\n3 - Saint Cernin\n4 - Toulon\n5 - Caen\n6 - Bordeaux\n7 - Ussel\n8 - Millau",
                    "",
                    "Points\n22\n16\n15\n12\n10\n2\n2\n0"),
            new Women("Palmares",
                    "2010\n2011\n2012\n2013\n2014\n2015\n2016\n2017",
                    ":\n:\n:\n:\n:\n:\n:\n:",
                    "Regional\nRegional\nFédéral 3\nFédéral 3\nFédéral 3\nFédéral 2\nFédéral 2\nFédéral 1"),
    };

    //Each Workout has a name and description
    private Women(String name, String description, String description2, String description3) {
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

