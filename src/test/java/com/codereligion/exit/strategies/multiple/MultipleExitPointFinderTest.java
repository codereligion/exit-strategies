package com.codereligion.exit.strategies.multiple;

import com.codereligion.exit.strategies.AbstractFinderTest;
import com.codereligion.exit.strategies.Finder;

public final class MultipleExitPointFinderTest extends AbstractFinderTest {

    public Finder unit() {
        return new MultipleExitPointFinder();
    }

}
