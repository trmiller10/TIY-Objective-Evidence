public class Main {
    public static void main(String[] args){

        //initializes new fighter
        Fighter jack = new Fighter();
        //assign values to properties
        jack.name = "Jack";
        jack.strength = 80;
        jack.defense = 70;
        jack.intelligence = 12;

        //print out description using properties
        System.out.println("This fighter's name is " + jack.name + ". Strength: "+ jack.strength + ". Defense: " + jack.defense +
                ". Intelligence: " + jack.intelligence + ". A brawny fellow.");



        //initializes new fighter
        Fighter jason = new Fighter();
        //assign values to properties
        jason.name = "Jason";
        jason.strength = 90;
        jason.defense = 50;
        jason.intelligence = 20;


        //initializes new monk
        Monk adrian = new Monk();
        //assign values to properties
        adrian.name = "Adrian";
        adrian.strength = 10;
        adrian.defense = 30;
        adrian.intelligence = 80;

        //print out description using properties
        System.out.println("This monk's name is " + adrian.name + ". Strength: "+ adrian.strength + ". Defense: " + adrian.defense +
                ". Intelligence: " + adrian.intelligence + ". Knows what he's doing.");

        //initializes new monk
        Monk caine = new Monk();
        //assign values to properties
        caine.name = "Caine";
        caine.strength = 20;
        caine.defense = 60;
        caine.intelligence = 60;


        //initializes new thief
        Thief chris = new Thief();
        //assign values to properties
        chris.name = "Chris";
        chris.strength = 50;
        chris.defense = 20;
        chris.intelligence = 70;


        //print out description using properties
        System.out.println("This thief's name is " + chris.name + ". Strength: "+ chris.strength + ". Defense: " + chris.defense +
                ". Intelligence: " + chris.intelligence + ". Sneaky.");

        //initializes new thief
        Thief danny = new Thief();
        //assign values to properties
        danny.name = "Danny";
        danny.strength = 30;
        danny.defense = 30;
        danny.intelligence = 80;


        //initializes new wizard
        Wizard meg = new Wizard();
        //assign values to properties
        meg.name = "Meg";
        meg.strength = 10;
        meg.defense = 10;
        meg.intelligence = 140;

        //print out description using properties
        System.out.println("This wizard's name is " + meg.name + ". Strength: "+ meg.strength + ". Defense: " + meg.defense +
                ". Intelligence: " + meg.intelligence + ". An expert at blowing stuff up.");


        //initializes new wizard
        Wizard corbett = new Wizard();
        //assign values to properties
        corbett.name = "Corbett";
        corbett.strength = 60;
        corbett.defense = 50;
        corbett.intelligence = 60;

        //print out description using properties
        System.out.println("This wizard's name is " + corbett.name + ". Strength: "+ corbett.strength + ". Defense: " + corbett.defense +
                ". Intelligence: " + corbett.intelligence + ". In the wrong job.");


        //initializes new cat
        Cat mukluk = new Cat();
        //assign values to properties
        mukluk.name = "Mukluk";
        mukluk.strength = 7;
        mukluk.defense = 8;
        mukluk.intelligence = 3;

        //print out description using properties
        System.out.println("This cat's name is " + mukluk.name + ". Strength: "+ mukluk.strength + ". Defense: " + mukluk.defense +
                ". Intelligence: " + mukluk.intelligence + ". A housecat that follows the group around.");


        //initializes new cat
        Cat pepper = new Cat();
        //assign values to properties
        pepper.name = "Pepper";
        pepper.strength = 30;
        pepper.defense = 30;
        pepper.intelligence = 10;

        //print out description using properties
        System.out.println("This cat's name is " + pepper.name + ". Strength: "+ pepper.strength + ". Defense: " + pepper.defense +
                ". Intelligence: " + pepper.intelligence + ". 'Biggest housecat I've ever seen' - Jack.");



        //assign new values to properties
        jason.strength = 120;
        jason.defense = 70;
        jason.intelligence = 25;

        //print out description using properties
        System.out.println("This fighter's name is " + jason.name + ". Strength: "+ jason.strength + ". Defense: " + jason.defense +
                ". Intelligence: " + jason.intelligence + ". Really excels in power.");


        //assign new values to properties
        caine.strength = 30;
        caine.defense = 80;
        caine.intelligence = 70;


        //print out description using properties
        System.out.println("This monk's name is " + caine.name + ". Strength: "+ caine.strength + ". Defense: " + caine.defense +
                ". Intelligence: " + caine.intelligence + ". Can take several hits.");


        //assign new values to properties
        danny.strength = 30;
        danny.defense = 60;
        danny.intelligence = 100;

        //print out description using properties
        System.out.println("This thief's name is " + danny.name + ". Strength: "+ danny.strength + ". Defense: " + danny.defense +
                ". Intelligence: " + danny.intelligence + ". Likes planning heists and sieges.");


        //assign new values to properties
        corbett.strength = 80;
        corbett.defense = 80;
        corbett.intelligence = 80;

        //print out description using properties
        System.out.println("This wizard's name is " + corbett.name + ". Strength: "+ corbett.strength + ". Defense: " + corbett.defense +
                ". Intelligence: " + corbett.intelligence + ". Casts 'fist'.");


        //assign new values to properties
        pepper.strength = 40;
        pepper.defense = 40;
        pepper.intelligence = 15;

        //print out description using properties
        System.out.println("This cat's name is " + pepper.name + ". Strength: "+ pepper.strength + ". Defense: " + pepper.defense +
                ". Intelligence: " + pepper.intelligence + ". 'I don't think this is actually a cat.' - Jack.");


    }
}
