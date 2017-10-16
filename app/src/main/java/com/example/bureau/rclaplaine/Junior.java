package com.example.bureau.rclaplaine;

public class Junior {
    private String name;
    private String description;
    private String description2;
    private String description3;

    public static final Junior[] juniors = {
            new Junior("Calendrier",
                    "Riom\nLa Plaine\nBrioude\nBlanzat\nLa Plaine\nRomania\nLa Plaine\nUssel\nLa Plaine\nLa Plaine\nIssoire\nLa Plaine\nLa Plaine\nGerzat\nLa Plaine\nThiers\nLa Plaine\nMontlucons",
                    "6-25\n14-0\n12-15\n10-34\n22/10\n29/10\n05/11\n12/11\n03/12\n10/12\n21/01\n28/01\n18/02\n04/03\n11/03\n18/03\n08/04\n22/04",
                    "La Plaine\nIssoire\nLa Plaine\nLa Plaine\nGerzat\nLa Plaine\nThiers\nLa Plaine\nMontlucons\nRiom\nLa Plaine\nBrioude\nBlanzat\nLa Plaine\nRomania\nLa Plaine\nUssel\nLa Plaine"),
            new Junior("Classement",
                    "Equipes\n1 - La Plaine\n2 - Riom\n3 - Issoire\n4 - Brioude\n5 - Blanzat\n6 - Gerzat\n7 - Romania\n8 - Thiers\n9 - Ussel\n10 - Montlucons",
                    "",
                    "Points\n16\n15\n12\n12\n5\n5\n4\n2\n1\n0"),
            new Junior("Palmares",
                    "2000\n2001\n2002\n2003\n2004\n2005\n2006\n2007\n2008\n2009\n2010\n2011\n2012\n2013\n2014\n2015\n2016\n2017",
                    ":\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:\n:",
                    "Danet\nDanet\nDanet\nDanet\nDanet\nDanet\nPhilliponneau\nPhilliponneau\nBalandrade\nPhilliponneau\nPhilliponneau\nPhilliponneau\nPhilliponneau\nPhilliponneau\nBalandrade\nBalandrade\nBalandrade\nBalandrade"),
    };

    //Each Workout has a name and description
    private Junior(String name, String description, String description2, String description3) {
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

