/*
 * Created on 27-Aug-2004
 * 
 * (c) 2003-2004 ThoughtWorks Ltd
 *
 * See license.txt for license details
 */
package com.thoughtworks.jbehave.extensions.story.domain;

import java.util.Arrays;
import java.util.List;

import com.thoughtworks.jbehave.extensions.story.visitor.Visitable;
import com.thoughtworks.jbehave.extensions.story.visitor.VisitableArrayList;
import com.thoughtworks.jbehave.extensions.story.visitor.Visitor;


/**
 * @author <a href="mailto:dan.north@thoughtworks.com">Dan North</a>
 */
public class SimpleOutcome implements Visitable {
    
    public static final SimpleOutcome NULL = new SimpleOutcome(new Expectation[0]);
    
    private final VisitableArrayList expectations;

    public SimpleOutcome(Expectation[] expectations) {
        this.expectations = new VisitableArrayList(Arrays.asList(expectations));
    }
    
    public SimpleOutcome(Expectation expectation) {
        this(new Expectation[] {expectation});
    }
    
    public SimpleOutcome(Expectation expectation1, Expectation expectation2) {
        this(new Expectation[] {expectation1, expectation2});
    }
    
    public SimpleOutcome(Expectation expectation1, Expectation expectation2, Expectation expectation3) {
        this(new Expectation[] {expectation1, expectation2, expectation3});
    }
    
    public List getExpectations() {
        return expectations;
    }

    public void accept(Visitor visitor) throws Exception {
        visitor.visitOutcome(this);
        expectations.accept(visitor);
    }
}