package es.unizar.tmdad.lab0.controller;

import org.springframework.social.twitter.api.SearchResults;
import com.fasterxml.jackson.annotation.JsonView;

public class resp {

	
    private SearchResults resultat;

    public resp() {
    }

    public resp(SearchResults searchResults) {
        this.resultat = searchResults;
    }

    @JsonView
    public SearchResults getresp() {
        return this.resultat;
    }    
}