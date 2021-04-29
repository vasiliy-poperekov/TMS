public class Main {
    public static void main(String[] args) {
        //#1
        String string1 = "Hello everyone, what's up?";
        System.out.println(Main.cutFromAtoB(string1, ',', '?'));
        System.out.println();

        //#2
        String string2 = "Hello everyone, what's up?";
        System.out.println(Main.reverse(string2));
        System.out.println();

        //#3
        String[] string3 = {"Word", "Peace", "bumub", "ana"};
        int stringsNumber1 = 0;
        for(String string : string3){
            if(TextFormater.palChecker(string)){
                System.out.println("Слово номер "+(stringsNumber1+1)+" попало в файл");
            }
            stringsNumber1++;
        }
        System.out.println();

        //#4
        String[] strings = {"heh", "Nd fbeo pam efbecs cefmw brok", "vrk bro"};
        int stringsNumber2 = 0;
        for(String string : strings){
            if(TextFormater.wordsCounter(string)>=3&&TextFormater.wordsCounter(string)<=5||TextFormater.palChecker(string)){
                System.out.println("Строка номер "+(stringsNumber2+1)+" попала в файл");
            }
            stringsNumber2++;
        }
    }

    public static String cutFromAtoB(String string, char startCut, char endCut){
        return string.substring(string.indexOf(startCut)+1, string.lastIndexOf(endCut)+1);
    }

    public static String reverse(String string){
        return string.replace(string.charAt(3), string.charAt(0));
    }
}