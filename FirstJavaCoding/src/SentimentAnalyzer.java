import java.util.Arrays;
 
class SentimentAnalyzer {    
    
    // Tip: labeled continue can be used + convert review to lower-case
    public static int[] detectProsAndCons(String review, String[][] featureSet, 
String[] posOpinionWords,
            String[] negOpinionWords) {
        int[] featureOpinions = new int[featureSet.length];
        review = review.toLowerCase();
        nextFeature: for (int i = 0; i < featureSet.length; i++) {
            String[] features = featureSet[i];
            for (String feature : features) {
                if (review.contains(feature)) {
                    int opinion = getOpinionOnFeature(review, 
feature, posOpinionWords, negOpinionWords);
                    if (opinion != 0) {
                        // Opinion found. Record opinion and move onto next feature
                        featureOpinions[i] = opinion;
                        continue nextFeature;
                    }
                }                
            }
        }
        return featureOpinions;
    }
    
    
    // First invoke checkForWasPhrasePattern and 
    // if it cannot find an opinion only then invoke checkForOpinionFirstPattern
    private static int getOpinionOnFeature(String review, String feature, String[] 
posOpinionWords, String[] negOpinionWords) {
        int opinion = checkForWasPhrasePattern(review, feature, 
posOpinionWords, negOpinionWords);
        
        if (opinion == 0) {
            opinion = checkForOpinionFirstPattern(review, feature, posOpinionWords, negOpinionWords);
        }
        return opinion;
    }        
    
    private static int checkForOpinionFirstPattern(String review, String feature, String[] posOpinionWords,
			String[] negOpinionWords) {
		// TODO Auto-generated method stub
		return 0;
	}


	/*private static int checkForWasPhrasePattern(String review, String feature, 
String[] posOpinionWords, String[] negOpinionWords) {
        int opinion = 0;
        String pattern = feature + " was ";
        // searching for positive words
        for(String str : posOpinionWords){
            String newPat = pattern.concat(str);
            if(review.contains(newPat)){
                opinion++;
                break;
            }
        }
        
        //no positive words found, so search negative
        if(opinion == 0){
            for(String str : negOpinionWords){
                if(review.contains(pattern.concat(str))){
                    opinion--;
                    break;
                }
            }
        }
        return opinion;     
    }*/
    
                    
    // Tip: Look at String API doc. Methods like indexOf, length, substring(beginIndex), startsWith can come into play
    // Return 1 if positive opinion found, -1 for negative opinion, 0 for no opinion
    // You can first look for positive opinion. If not found, only then you can look for negative opinion
    private static int checkForWasPhrasePattern(String review, String feature, 
String[] posOpinionWords, String[] negOpinionWords) {
        int opinion = 0;
        String pattern = feature + " was ";
        int index = review.indexOf(pattern);
        // while loop is used instead of if-statement to account for appearance
        // of pattern in more than one location. See last statement of while loop
        while (index >= 0) {
            String patternSuffix = review.substring(index + pattern.length());
            // String patternPrefix = sentence.substring(0, index);
            for (String opinionWord : posOpinionWords) {
                if (patternSuffix.startsWith(opinionWord)) {
                    return 1;
                }
            }
            for (String opinionWord : negOpinionWords) {
                if (patternSuffix.startsWith(opinionWord)) {
                    return -1;
                }
            }
            
            //String remainingReview = review.substring(review.indexOf(pattern) + pattern.length()-1);
            //index = remainingReview.indexOf(pattern);
            
            index = patternSuffix.indexOf(pattern);
            review = patternSuffix;
        }
        return opinion; // no opinion found        
    }    

	public static void main(String[] args) {
		String review = "Haven't been here in years! Fantastic service and the food was delicious! Definetly will be a frequent flyer! Francisco was very attentive";
		
		//String review = "Sorry OG, but you just lost some loyal customers. Horrible service, no smile or greeting just attitude. The breadsticks were stale and burnt, appetizer was cold and the food came out before the salad.";
		
		String[][] featureSet = { 
		        { "ambiance", "ambience", "atmosphere", "decor" },
				{ "dessert", "ice cream", "desert" }, 
				{ "food" }, 
				{ "soup" },
				{ "service", "management", "waiter", "waitress", "bartender", "staff", "server" } };
		String[] posOpinionWords = { "good", "fantastic", "friendly", "great", "excellent", "amazing", "awesome",
				"delicious" };
		String[] negOpinionWords = { "slow", "bad", "horrible", "awful", "unprofessional", "poor" };

		int[] featureOpinions = detectProsAndCons(review, featureSet, posOpinionWords, negOpinionWords);
		System.out.println("Opinions on Features: " + Arrays.toString(featureOpinions));
	}
}