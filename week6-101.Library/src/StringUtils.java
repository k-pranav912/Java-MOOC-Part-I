/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranav
 */
public class StringUtils {
    
    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }
        word = word.toUpperCase();
        word = word.trim();
        searched = searched.toUpperCase();
        searched = searched.trim();
        
        return word.contains(searched);
    }
    
}
