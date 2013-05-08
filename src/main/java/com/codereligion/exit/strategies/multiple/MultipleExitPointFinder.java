package com.codereligion.exit.strategies.multiple;

import com.codereligion.exit.strategies.Finder;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

public final class MultipleExitPointFinder implements Finder {

    public <T> T find(Iterable<T> haystack, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(haystack);
        Preconditions.checkNotNull(predicate);

        for (T element : haystack) {
            if (predicate.apply(element)) {
                return element;
            }
        }

        return null;
    }

}
