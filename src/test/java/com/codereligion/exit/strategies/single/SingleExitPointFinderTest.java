package com.codereligion.exit.strategies.single;

import com.codereligion.exit.strategies.AbstractFinderTest;
import com.codereligion.exit.strategies.Finder;

public final class SingleExitPointFinderTest extends AbstractFinderTest {

    public Finder unit() {
        return new SingleExitPointFinder();
    }

}
