/*
 * Created on 30-Jun-2004
 * 
 * (c) 2003-2004 ThoughtWorks Ltd
 *
 * See license.txt for license details
 */
package jbehave.runner.listener.trace;

import jbehave.framework.Criterion;
import jbehave.framework.Evaluation;
import jbehave.runner.BehaviourRunner;
import jbehave.runner.listener.Listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author <a href="mailto:dan.north@thoughtworks.com">Dan North</a>
 */
public class TraceListener implements Listener {
    Log log = LogFactory.getLog(TraceListener.class);

    public void runStarted(BehaviourRunner runner) {
        log.trace("runStarted");
    }

    public void runEnded(BehaviourRunner runner) {
        log.trace("runEnded");
    }

    public void behaviourEvaluationStarted(Class behaviour) {
        log.trace("behaviourEvaluationStarted: " + behaviour.getName());
    }

    public void behaviourEvaluationEnded(Class behaviour) {
        log.trace("behaviourEvaluationEnded: " + behaviour.getName());
    }

    public void beforeCriterionEvaluationStarts(Criterion criterion) {
        log.trace("beforeCriterionEvaluationStarts: " + criterion.getName());
    }

    public void afterCriterionEvaluationEnds(Evaluation evaluation) {
        log.trace("afterCriterionEvaluationEnds: " + evaluation.toString());
    }
}