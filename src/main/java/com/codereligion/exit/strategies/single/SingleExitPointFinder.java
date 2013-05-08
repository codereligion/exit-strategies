package com.codereligion.exit.strategies.single;

import com.codereligion.exit.strategies.Finder;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

public final class SingleExitPointFinder implements Finder {

    public <T> T find(Iterable<T> haystack, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(haystack);
        Preconditions.checkNotNull(predicate);

        T found = null;

        for (T element : haystack) {
            if (predicate.apply(element)) {
                found = element;
                break;
            }
        }

        return found;
    }

}
