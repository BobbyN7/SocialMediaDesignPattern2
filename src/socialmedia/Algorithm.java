/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Robert
 */
public interface Algorithm {

    /**
     *
     * @param trainingSet
     * @param testSet
     * @return
     */
    Map<SocialMediaEntry, Boolean> classifyEntries(Set<SocialMediaEntry> trainingSet,
            Set<SocialMediaEntry> testSet);
}
