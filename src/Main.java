public class Main {
    public static void main(String[] args){

        //initializes new fighter
        Fighter jack = new Fighter();
        //assign values to properties
        jack.name = "Jack";
        jack.strength = 80;
        jack.axeMastery = 70;
        jack.intelligenceQuota = 12;

        //print out description using properties
        System.out.println("This fighter's name is " + jack.name + ". Strength: "+ jack.strength + ". Axe Mastery: " + jack.axeMastery +
                ". Intelligence Quota: " + jack.intelligenceQuota + ". A brawny fellow.");



        //initializes new fighter
        Fighter jason = new Fighter();
        //assign values to properties
        jason.name = "Jason";
        jason.strength = 90;
        jason.axeMastery = 50;
        jason.intelligenceQuota = 20;


        //initializes new monk
        Monk adrian = new Monk();
        //assign values to properties
        adrian.name = "Adrian";
        adrian.brawniness = 10;
        adrian.purity = true;
        adrian.healingPower = 80;

        //print out description using properties
        System.out.println("This monk's name is " + adrian.name + ". Brawniness: "+ adrian.brawniness + ". Purity: " + adrian.purity +
                ". Healing Power: " + adrian.healingPower + ". Knows what he's doing.");

        //initializes new monk
        Monk caine = new Monk();
        //assign values to properties
        caine.name = "Caine";
        caine.brawniness = 20;
        caine.purity = false;
        caine.healingPower = 60;


        //initializes new thief
        Thief chris = new Thief();
        //assign values to properties
        chris.name = "Chris";
        chris.resistance = 50;
        chris.armorRating = 20;
        chris.movementSpeed = 70;


        //print out description using properties
        System.out.println("This thief's name is " + chris.name + ". Resistance: "+ chris.resistance + ". Armor Rating: " + chris.armorRating +
                ". Movement Speed: " + chris.movementSpeed + ". Sneaky.");

        //initializes new thief
        Thief danny = new Thief();
        //assign values to properties
        danny.name = "Danny";
        danny.resistance = 30;
        danny.armorRating = 30;
        danny.movementSpeed = 80;


        //initializes new wizard
        Wizard meg = new Wizard();
        //assign values to properties
        meg.name = "Meg";
        meg.selfRestraint = 10;
        meg.senseOfMorals = 10;
        meg.destructiveness = 140;

        //print out description using properties
        System.out.println("This wizard's name is " + meg.name + ". Self-Restraint: "+ meg.selfRestraint + ". Sense of Morality: " + meg.senseOfMorals +
                ". Destructiveness: " + meg.destructiveness + ". An expert at blowing stuff up.");


        //initializes new wizard
        Wizard corbett = new Wizard();
        //assign values to properties
        corbett.name = "Corbett";
        corbett.selfRestraint = 60;
        corbett.senseOfMorals = 50;
        corbett.destructiveness = 60;

        //print out description using properties
        System.out.println("This wizard's name is " + corbett.name + ". Self-Restraint: "+ corbett.selfRestraint + ". Sense of Morality: " + corbett.senseOfMorals +
                ". Destructiveness: " + corbett.destructiveness + ". In the wrong job.");


        //initializes new cat
        Cat mukluk = new Cat();
        //assign values to properties
        mukluk.name = "Mukluk";
        mukluk.clawStrength = 7;
        mukluk.jumpLength = 8;
        mukluk.intelligence = 3;

        //print out description using properties
        System.out.println("This cat's name is " + mukluk.name + ". Claw Strength: "+ mukluk.clawStrength + ". Length of Jump: " + mukluk.jumpLength +
                ". Intelligence: " + mukluk.intelligence + ". A housecat that follows the group around.");


        //initializes new cat
        Cat pepper = new Cat();
        //assign values to properties
        pepper.name = "Pepper";
        pepper.clawStrength = 30;
        pepper.jumpLength = 30;
        pepper.intelligence = 10;

        //print out description using properties
        System.out.println("This cat's name is " + pepper.name + ". Claw Strength: "+ pepper.clawStrength + ". Length of Jump: " + pepper.jumpLength +
                ". Intelligence: " + pepper.intelligence + ". 'Biggest housecat I've ever seen' - Jack.");



        //assign new values to properties
        jason.strength = 120;
        jason.axeMastery = 70;
        jason.intelligenceQuota = 25;

        //print out description using properties
        System.out.println("This fighter's name is " + jason.name + ". Strength: "+ jason.strength + ". Axe Mastery: " + jason.axeMastery +
                ". Intelligence Quota: " + jason.intelligenceQuota + ". Really excels in power.");


        //assign new values to properties
        caine.brawniness = 30;
        caine.purity = true;
        caine.healingPower = 70;


        //print out description using properties
        System.out.println("This monk's name is " + caine.name + ". Brawniness: "+ caine.brawniness + ". Purity: " + caine.purity +
                ". Healing Power: " + caine.healingPower + ". Can take several hits.");


        //assign new values to properties
        danny.resistance = 30;
        danny.armorRating = 60;
        danny.movementSpeed = 100;

        //print out description using properties
        System.out.println("This thief's name is " + danny.name + ". Resistance: "+ danny.resistance + ". Armor Rating: " + danny.armorRating +
                ". Movement Speed: " + danny.movementSpeed + ". Likes planning heists and sieges.");


        //assign new values to properties
        corbett.selfRestraint = 80;
        corbett.senseOfMorals = 80;
        corbett.destructiveness = 80;

        //print out description using properties
        System.out.println("This wizard's name is " + corbett.name + ". Self-Restraint: "+ corbett.selfRestraint + ". Sense of Morality: " + corbett.senseOfMorals +
                ". Destructiveness: " + corbett.destructiveness + ". Master of bare-knuckle magic; casts 'fist'.");


        //assign new values to properties
        pepper.clawStrength = 40;
        pepper.jumpLength = 40;
        pepper.intelligence = 15;

        //print out description using properties
        System.out.println("This cat's name is " + pepper.name + ". Claw Strength: "+ pepper.clawStrength + ". Length of Jump: " + pepper.jumpLength +
                ". Intelligence: " + pepper.intelligence + ". 'I don't think this is actually a cat.' - Jack.");


    }
}
