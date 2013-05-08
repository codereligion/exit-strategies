package com.codereligion.exit.strategies;

import com.google.common.base.Predicates;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public abstract class AbstractFinderTest implements UnitProvider<Finder> {

    @Test(expected = NullPointerException.class)
    public void nullHaystack() {
        unit().find(null, Predicates.alwaysTrue());
    }

    @Test(expected = NullPointerException.class)
    public void nullPredicate() {
        unit().find(Collections.emptySet(), null);
    }

    @Test(expected = NullPointerException.class)
    public void nullHaystackAndPredicate() {
        unit().find(null, null);
    }

    @Test
    public void found() {
        final Object match = new Object();
        final Iterable<Object> iterable = Arrays.asList(new Object(), match, new Object());

        final Object found = unit().find(iterable, Predicates.equalTo(match));

        Assert.assertSame(match, found);
    }

    @Test
    public void notFound() {
        final Iterable<Object> iterable = Arrays.asList(new Object(), new Object(), new Object());

        final Object found = unit().find(iterable, Predicates.equalTo(new Object()));

        Assert.assertNull(found);
    }

}
