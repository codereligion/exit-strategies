package com.codereligion.exit.strategies;

import com.google.common.base.Predicate;

public interface Finder {

    /**
     * Finds the first element in the given haystack that matches the supplied predicate.
     *
     * @param haystack the iterable used to search in
     * @param predicate the predicate used to find the match
     * @param <T> the generic element type
     * @return the the found element or null if nothing was found
     * @throws NullPointerException if haystack or predicate is null
     */
    <T> T find(Iterable<T> haystack, Predicate<? super T> predicate);

}
