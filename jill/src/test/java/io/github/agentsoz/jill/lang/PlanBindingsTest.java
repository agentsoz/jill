package io.github.agentsoz.jill.lang;

/*-
 * #%L
 * Jill Cognitive Agents Platform
 * %%
 * Copyright (C) 2014 - 2018 by its authors. See AUTHORS file.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import io.github.agentsoz.jill.config.GlobalConstant.PlanSelectionPolicy;
import io.github.agentsoz.jill.core.beliefbase.Belief;

import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;

@SuppressWarnings("PMD")
public class PlanBindingsTest {

  @Test
  public void testAdd0() {

    final PlanBindings pb = new PlanBindings(null);

    assertSame(0, pb.size());
    pb.clear();
    assertSame(0, pb.size());
    pb.add(null, null);
    assertSame(0, pb.size());

    final Plan p1 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };
    LinkedHashSet<Belief> lhs1 = new LinkedHashSet<Belief>();

    pb.add(null, lhs1);
    assertSame(0, pb.size());
    pb.add(p1, null);
    assertSame(1, pb.size());
    pb.add(p1, null);
    pb.add(p1, null);
    pb.add(p1, null);
    pb.add(p1, null);
    assertSame(1, pb.size());

    final Plan p2 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };

    pb.add(p2, null);
    assertSame(2, pb.size());
    pb.add(p2, lhs1);
    assertSame(2, pb.size());

    LinkedHashSet<Belief> lhs2 = new LinkedHashSet<Belief>();
    pb.add(p2, lhs2);
    assertSame(2, pb.size());

    LinkedHashSet<Belief> lhs3 = new LinkedHashSet<Belief>();
    lhs3.add(new Belief(0, 0, null));
    pb.add(p2, lhs3);
    assertSame(2, pb.size());

    LinkedHashSet<Belief> lhs4 = new LinkedHashSet<Belief>();
    lhs4.add(new Belief(1, 1, null));
    lhs4.add(new Belief(2, 2, null));
    lhs4.add(new Belief(3, 3, null));
    pb.add(p2, lhs4);
    assertSame(4, pb.size());

    pb.add(p2, lhs2);
    assertSame(pb.size(), 2);

    final Plan p3 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };

    pb.add(p3, lhs4);
    assertSame(5, pb.size());

    final Plan p4 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };

    pb.add(p4, lhs4);
    assertSame(8, pb.size());

  }

  @Test
  public void testGetPlans0() {

    final PlanBindings pb = new PlanBindings(null);
    assertNotSame(null, pb.getPlans());
    assertTrue(pb.getPlans().isEmpty());

    final Plan p1 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };

    LinkedHashSet<Belief> lhs1 = new LinkedHashSet<Belief>();

    pb.add(p1, null);
    pb.add(p1, lhs1);
    assertSame(1, pb.getPlans().size());
    assertTrue(pb.getPlans().contains(p1));

    final Plan p2 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };

    pb.add(p2, null);
    assertSame(2, pb.getPlans().size());
    assertTrue(pb.getPlans().contains(p1));
    assertTrue(pb.getPlans().contains(p2));

    final Plan p3 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };

    pb.add(p3, null);
    assertSame(3, pb.getPlans().size());
    assertTrue(pb.getPlans().contains(p1));
    assertTrue(pb.getPlans().contains(p2));
    assertTrue(pb.getPlans().contains(p3));

    pb.clear();
    pb.add(p3, null);
    assertSame(1, pb.getPlans().size());
    assertTrue(!pb.getPlans().contains(p1));
    assertTrue(!pb.getPlans().contains(p2));
    assertTrue(pb.getPlans().contains(p3));

  }

  @Test
  public void testGetBindings0() {

    final PlanBindings pb = new PlanBindings(null);
    final Plan p1 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };
    LinkedHashSet<Belief> lhs1 = new LinkedHashSet<Belief>();

    pb.add(p1, null);
    assertSame(null, pb.getBindings(p1));

    pb.add(p1, lhs1);
    assertSame(pb.getBindings(p1), lhs1);

    final Plan p2 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };

    pb.add(p2, null);
    assertNotSame(null, pb.getBindings(p1));
    assertSame(pb.getBindings(p2), null);

    final Plan p3 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };

    assertSame(null, pb.getBindings(p3));
    pb.add(p3, lhs1);
    assertSame(pb.getBindings(p3), lhs1);

    pb.clear();
    assertSame(null, pb.getBindings(p1));
    assertSame(null, pb.getBindings(p2));
    assertSame(null, pb.getBindings(p3));
  }

  @Test
  public void testGet0() {
    final PlanBindings pb = new PlanBindings(new Random(1234));
    final Agent a1 = new Agent("a1");
    final Agent a2 = new Agent("a2");
    final Plan p1 = new Plan(a1, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };
    final Plan p2 = new Plan(null, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };
    final Plan p3 = new Plan(a1, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };
    final Plan p4 = new Plan(a2, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };
    final Plan p5 = new Plan(a1, null, null) {
      @Override
      public void setPlanVariables(Map<String, Object> vars) {
        // Nothing to do here
      }

      @Override
      public boolean context() {
        return false;
      }
    };

    final LinkedHashSet<Belief> lhs1 = new LinkedHashSet<Belief>();
    final LinkedHashSet<Belief> lhs4 = new LinkedHashSet<Belief>();
    lhs4.add(new Belief(1, 1, null));
    lhs4.add(new Belief(2, 2, null));
    lhs4.add(new Belief(3, 3, null));


    pb.add(p1, lhs4);
    pb.add(p2, lhs4);
    pb.add(p3, null);
    pb.add(p4, null);
    pb.add(p5, lhs1);

    Plan o1 = pb.selectPlan(PlanSelectionPolicy.FIRST);
    Plan o2 = pb.selectPlan(PlanSelectionPolicy.FIRST);
    Plan o3 = pb.selectPlan(PlanSelectionPolicy.FIRST);
    assertSame(o1, o2);
    assertSame(o1, o3);

    Plan o4 = pb.selectPlan(PlanSelectionPolicy.FIRST);
    Plan o5 = pb.selectPlan(PlanSelectionPolicy.FIRST);
    assertSame(o1, o4);
    assertSame(o1, o5);
    assertSame(o1, p1);

    o1 = pb.selectPlan(PlanSelectionPolicy.LAST);
    o2 = pb.selectPlan(PlanSelectionPolicy.LAST);
    o3 = pb.selectPlan(PlanSelectionPolicy.LAST);
    o4 = pb.selectPlan(PlanSelectionPolicy.LAST);
    o5 = pb.selectPlan(PlanSelectionPolicy.LAST);
    assertSame(o1, o2);
    assertSame(o1, o3);
    assertSame(o1, o4);
    assertSame(o1, o5);
    assertSame(o1, p5);

    o1 = pb.selectPlan(PlanSelectionPolicy.RANDOM);
    o2 = pb.selectPlan(PlanSelectionPolicy.RANDOM);
    o3 = pb.selectPlan(PlanSelectionPolicy.RANDOM);
    o4 = pb.selectPlan(PlanSelectionPolicy.RANDOM);
    o5 = pb.selectPlan(PlanSelectionPolicy.RANDOM);
    assertFalse(o1.equals(o2) && o1.equals(o3) && o1.equals(o4) && o1.equals(o5));
    assertFalse(o2.equals(o1) && o2.equals(o3) && o2.equals(o4) && o2.equals(o5));
    assertFalse(o3.equals(o1) && o3.equals(o2) && o3.equals(o4) && o3.equals(o5));
    assertFalse(o4.equals(o1) && o4.equals(o2) && o4.equals(o3) && o4.equals(o5));
    assertFalse(o5.equals(o1) && o5.equals(o2) && o5.equals(o3) && o5.equals(o4));

  }

}
