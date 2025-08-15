package com.devsenior.yecm;

import java.util.*;

public class CheckEmail {
    private List<String> emails = new ArrayList<>(
            Arrays.asList("yecm@gmail.com", "yecm1@gmail.com", "yecm1@gmail.com", "yecm2@gmail.com", "yecm@gmail.com"));

    public CheckEmail() {

    }

    public void checkEmailDuplicate() {
        Set<String> check = new HashSet<>();
        Set<String> result = new HashSet<>();

        for (String email : emails) {
            if (!check.add(email)) {
                result.add(email);

            }
        }

        System.out.println(" se encontraron: " + result.size() + " Correos duplicados: " + result);

    }

}
