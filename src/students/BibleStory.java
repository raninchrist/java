package students;

public class BibleStory{
    public String Title, character1, character2, character3, character4, object1, object2, object3, place1, place2;

    public BibleStory(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){
        Title=a;
        character1= b;
        character2= c;
        character3= d;
        character4= e;
        object1= f;
        object2=g;
        object3=h;
        place1=i;
        place2=j;
    }

    public String Story(){
        String story;
        if(Title.equals("Adam and Eve")){
            story= "In the beginning, " + character4 + " created " + character1 + " and from " + character1 + ", " + character4 + " created " +  character2 + ". After creating them, " + character4 + " placed " + character1 + " and " + character2 + " in " + place1 + " and told them that they can eat from any tree in " + place1 + " except from the tree of knowledge. One day, " + character3 + " tempts " + character2 + " to eat from the forbidden tree and he/she gives in, taking a bit of " + object1 + " from the tree. Then, he/she gave " + object1 + " to " + character1 + ", who also took a bite from " + object1 + ". After eating " + object1 + ", they realized they we naked and hid from eachother and " + character4 + ", covering themselves with " + object2 + ". When " + character4 +  " came to " + place1 + " to check on " + character1 + " and " + character2 + ", he/she could not find them. " + character4 + " then called to them, asking them why they were hiding from him/her. They responded by telling " + character4 +" that they were hiding because they realized they were naked and were embarrassed. " + character4 + " then asked who told them that they were naked and if they ate from the tree he/she told them not to eat from, and " + character1 + " told " + character4 + " that " + character2 + " told him/her to eat from the forbidden tree and " + character2 + " told " + character4 + " that " + character3 + " told him/her to eat from the forbidden tree. " + character4 + " then curses " + character3 + " to crawl on their belly and said that one day, the offspring of " + character2 + " will crush their head and they will strike their heel. " + character4 + " then banished " + character1 + " and " + character2 + " from " + place1 + ". The End.";
            return story;
        }
        else if(Title.equals("Cain and Able")){
            story= "After Adam and Eve were banished from the Garden of Eden, Eve gave birth to two children, one was named " 
            + character1 + " and the other was named " + character2 + ". One day, the two siblings made offerings to " + character4 + ". " + character1 + " offered " + object3 + " and " + character2 + " offered " + object2 + ". " + character4 + " favored " + character2 + "'s offering and out of jealousy, " + character1 + " struck " + character2 + " in the head with " + object1 + ", killing him/her in the process. " + character4 + " asked " + character1 + " where " + character2 + " was and when he/she replied, " + character4 + " knew what " + character1 + " has done. " + character4 + " then curses " + character1 + " with the Mark of " + character1 + " and cursed " + character1 + " to wander the earth, and any land he/she tried to work would be baren. The End.";
            return story;
        }
        else if(Title.equals("David and Goliath")){
            story= "One day, during the war between the " + place2 + "s and the " + place1 + ", " + character3 + ", a " + place2 + " giant who was over 9 feet tall, wore a full set of armor, and carried a spear, javelin, and " + object3 + ", walked out on the battlefield and mocked the " + place1 +" and challenged them to fight. Due to his enormous stature, the " + place1 + " were too afraid to fight. " + character3 + " continued to mock and challenge the " + place1 + " every day for 40 days. One day, " + character1 + " was sent to the battlefield to check on his brothers and while he/she was there, " + character1 + " heard " + character3 + "'s mocking and seeing how " + character3 + " scared the " + place1 + ", " + character1 + " volunteered to fight " + character3 + ". " + character2 + " offered " + character1 + " his/her sword and armor, but " + character1 + " refused, taking 5 " + object1 + "s from a nearby river, putting 4 of them in an pouch and putting the fifth in a " + object2 + ". As " + character3 + " approached " + character1 + " on the battlefield, he/she hurled insults at " + character1 + ", and " + character1 + " replied with, \"You come against me with " + object3 + ", a spear, and a javelin, but I come against you in the name of " + character4 + ", the God of the " + place1 + ", whom you have defied ...\" After " + character1 + " finished his/her speech, " + character3 + " charged at " + character1 + ". " + character1 + " then used his/her " + object2 + " to throw a " + object1 + " at " + character3 + "'s head. Miraculously, the " + object1 + " found a gap the the giant's armor and struck the giant in the head. " + character3 + " fell to the ground and " + character1 + " used " + character3 + "'s " + object3 + " to cut off the giant's head. Seeing their champion slayed, the " + place2 + "s fled and the " + place1 + " chased after them. The End.";
            return story;
        }
        else{
            story= "Story not in database";
            return story;
        }
    }
}