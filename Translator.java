public class Translator {

public static String translateWord (String englishWord) {
String translation;
switch(englishWord) {
	case "1":
	case "one":
		translation = "ichi";
		break;
	case "2":
	case "two":
		translation = "ni";
		break;
	case "3":
	case "three":
		translation = "san";
		break;
	case "4":
	case "four":
		translation = "shi";
		break;
	case "5":
	case "five":
		translation = "go";
		break;
	case "6":
	case "six":
		translation = "roku";
		break;
	case "7":
	case "seven":
		translation = "shichi";
		break;
	case "8":
	case "eight":
		translation = "hachi";
		break;
	case "9":
	case "nine":
		translation = "ku";
		break;
	case "10":
	case "ten":
		translation = "jyuu";
		break;
	case "hello":
	case "yes":
		translation = "hai";
		break;
	case "no":
		translation = "iie";
		break;
	case "please":
		translation = "kudasai";
		break;
	case "airport":
	case "taxi":
	case "home":
		translation = "uchi";
		break;
	case "university":
		translation = "daigaku";
	case "small":
		translation = "chisai";
		break;
	case "large":
		translation = "ookii";
		break;
	case "japanese":
		translation = "nihongo";
		break;
	case "english":
		translation = "eego";
		break;
	case "american":
		translation = "americajin";
		break;
	case "apartmemt":
		translation = "apaato";
		break;
	case "supermarket":
		translation = "suupaa";
	break;
	default:
		System.out.printf("Invalid input%n(Hint: Input must be all lower-case)%nEnglish word was unable to be translated to Japanese");
		}
return(translation);
}


public static String translatePhrase(String englishPhrase) {
switch(engPhrase) {
String translation;
String[] availablePhrases = new String[] {"how are you", "wait a second", "see you later", "goodbye", "i see", "good morning", "i'm going to eat dinner", "what time is it"};
	case "how are you":
		translation = "genkidesuka";
		break;
	case "wait a second":
		translation = ("chotta mate";
		break;
	case "see you later":
		translation = "jyaa, mata";
		break;
	case "goodbye":
		translation = "sayounara";
		break;
	case "i see":
		translation = "soudesuka";
		break;
	case "good morning":
		translation = "ohaiyougozaimasu";
		break;
	case "i'm going to eat dinner":
		translation = "bangohan o tabemasu";
		break;
	case "how do you say it in english":
		break;	
	case "what time is it":
		translation = "nanji";
		break;
	case "ls":
	for(int index = 0; index < availablePhrases.length; index++) {
		System.out.print(availablePhrases[index] + " ");
		}
	default:
	System.out.printf("Invalid input%n(Hint: "ls" to see list of available phrases)%nEnglish phrase was unable to be translated to Japanese");
	}
return(translation);
}
