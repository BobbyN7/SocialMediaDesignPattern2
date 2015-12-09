/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Robert
 */
public class RandomClassifier implements Algorithm{

    RandomClassifier() {
    }

    /**
     *
     * @param trainingSet
     * @param testSet
     * @return
     */
    @Override
    public Map<SocialMediaEntry, Boolean> classifyEntries(Set<SocialMediaEntry> trainingSet, Set<SocialMediaEntry> testSet) {
        Map<SocialMediaEntry, Boolean> results = new HashMap<>();
        
        // Right now this is putting a "random"
        testSet.stream().forEach((entry) -> {
            results.put(entry, Math.random() > 0.5);
        });
        
        return results;
    }
    
}
