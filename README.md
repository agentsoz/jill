# Jill

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/bbaec92c934d409eaf90a465179a854f)](https://www.codacy.com/app/agentsoz/jill?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=agentsoz/jill&amp;utm_campaign=Badge_Grade) [![Codacy Badge](https://api.codacy.com/project/badge/Coverage/bbaec92c934d409eaf90a465179a854f)](https://www.codacy.com/app/agentsoz/jill?utm_source=github.com&utm_medium=referral&utm_content=agentsoz/jill&utm_campaign=Badge_Coverage)
```master```[![Build Status](https://travis-ci.org/agentsoz/jill.svg?branch=master)](https://travis-ci.org/agentsoz/jill)
```dev```[![Build Status](https://travis-ci.org/agentsoz/jill.svg?branch=dev)](https://travis-ci.org/agentsoz/jill)

* [About](#about)
* [Releases](#releases)
* [Benchmarks and Examples](#benchmarks-and-examples)
  * [The Towers of Hanoi](#1-the-towers-of-hanoi)
  * [One Million BDI Agents](#2-one-million-bdi-agents)
  * [Hello Neighbour](#3-hello-neighbour)
  * [Token Passing](#4-token-passing)
* [Developers](#developers)
* [License](#license)
* [Contact](#contact)


## About

Jill is an open source initiative to deliver a fast and lightweight
java-based BDI-like (Beliefs, Desires, Intentions) execution engine for
developing large-scale multi-agent systems. Jill is:

* A BDI execution engine: that supports complex BDI goal-plan behaviour
  hierarchies in the PRS style (A Rao and M Georgeff. BDI Agents: from
  theory to practice. In ICMAS, volume 95, pages 312–319, 1995).

* Lightweight: the design and implementation is heavily optimised to
  deliver a very lightweight distribution (see [Releases](#releases) for details)
  fit for inclusion in web-based and embedded-Java applications.

* Fast: The Jill BDI execution engine is very fast, and was designed from
  ground-up to handle millions of BDI agents (see [Benchmarks and Examples](#benchmarks-and-examples)).

* Java-based: The programming of BDI agents in Jill is done in
  pure Java, so users benefit from the various support tools that are available
  to Java developers, such as full integration with the Eclipse IDE.
  Jill itself is written in Java and is distributed as a JAR bundle which can
  be easily integrated into larger projects that require cognitive reasoning
  agents.

* Open source: Jill is released under the terms of the
  GNU General Lesser Public License <http://www.gnu.org/licenses/lgpl-3.0.html>.


## Releases

The latest stable release as well as all previous releases are available at
https://github.com/agentsoz/jill/releases.


## Usage

Jill is available from [Maven Central](http://search.maven.org/#search%7Cga%7C1%7Cio.github.agentsoz.jill). To include in your project add the following maven dependency to your `pom.xml`:
```
<dependencies>
    ...
    <dependency>
        <groupId>io.github.agentsoz</groupId>
        <artifactId>jill</artifactId>
        <version>0.4.0</version>
    </dependency>
    ...
</dependencies>
```

## Benchmarks and Examples

The following tests were run on a 2018 Macbook Pro (15,2 model) laptop with 4x
2.7GHz i7 processors, SSD, 16GB RAM, and with the [JVM heap size set to
4GB](https://github.com/agentsoz/jill/blob/9be6b654b4c86cdad07ca65a1ef8c0211969ddb9/test/testagent.sh#L10).


### 1. The Towers of Hanoi

A solution for the classic [towers of hanoi puzzle](https://en.wikipedia.org/wiki/Tower_of_Hanoi) is available in the examples directory (see [hanoi player](https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/hanoi/Player.java)). The goal is to move a stack of discs from the Pin0 (the first pin) to Pin3 (the third pin).

The hanoi player can be run using the convinience script [test/hanoi.sh](https://github.com/agentsoz/jill/blob/master/test/hanoi.sh):
```
> ./test/hanoi.sh
...
[main] INFO  io.github.agentsoz.jill - Created 1 agents in (35 ms)
[main] INFO  io.github.agentsoz.jill - Started 1 agents in (4 ms)
[main] INFO  io.github.agentsoz.jill - Finished running 1 agents in (1146 ms)
[main] INFO  io.github.agentsoz.jill - Terminated 1 agents in (1 ms)
...
Solved Towers of Hanoi with 18 discs in 262143 moves
```
The log output gives some idea of performance in terms of the number of moves and time taken to complete the puzzle. The output of the run, i.e., the solution, is written to `./test/hanoi.out`:
```
> head -4 ./test/hanoi.out
Initialised hanoi board with 15 discs:
|15|14|13|12|11|10|9|8|7|6|5|4|3|2|1
|
|

> tail -20 test/hanoi.out
Moving disc 1 from pin 2 to 1
|3
|2|1
|15|14|13|12|11|10|9|8|7|6|5|4
Moving disc 3 from pin 0 to 2
|
|2|1
|15|14|13|12|11|10|9|8|7|6|5|4|3
Moving disc 1 from pin 1 to 0
|1
|2
|15|14|13|12|11|10|9|8|7|6|5|4|3
Moving disc 2 from pin 1 to 2
|1
|
|15|14|13|12|11|10|9|8|7|6|5|4|3|2
Moving disc 1 from pin 0 to 2
|
|
|15|14|13|12|11|10|9|8|7|6|5|4|3|2|1
```


### 2. One Million BDI Agents

This test executes one million relatively complex BDI agents (see [TestAgent.java](https://github.com/agentsoz/jill/blob/master/jill/src/test/java/io/github/agentsoz/jill/testprogram/TestAgent.java)). Each agent has a goal-plan hierarchy as follows:
```
            GoalA
        .-----^-----.
      PlanA       PlanD
    .---^---.
  GoalB   GoalC
    |       |
  PlanB   PlanC
```
Each agent starts by posting a high level goal [GoalA] which has two *relevant* plans [PlanA] and [PlanD]. In this example the context condition of all plans is `true` so that all relevant plans are also *applicable* at the same time. So given that [PlanA] and [PlanD] are both applicable, which should get selected? That depends on the global plan selection policy configured for Jill. By default it selects a plan instance at RANDOM, but this can be changed to always pick the first defined plan (command line option `--plan-selection-policy FIRST`) or last (option `--plan-selection-policy LAST`).

If [PlanD] were selected, it executes (always successfully), after which [GoalA] is satisfied, and the agent becomes idle. On the other hand, if [PlanB] was selected, it then first posts [GoalB]--and waits for it to complete--followed by [GoalC]. This results in [PlanB] executing and completing first, followed by [PlanC]. At that point all steps (i.e., subgoals [GoalB] and [GoalC]) of [PlanA] have completed, which in turn results in its completion and the success of the top level goal [GoalA].

Note that the execution of the agents is interleaved such that Jill cycles through all agents in each execution cycle, and progresses any active intentions (plans) by one plan step. When all agents eventually accomplish their [GoalA] and become idle, the program terminates (this behaviour can be disabled by passing the Jill option `--exit-on-idle FALSE` at runtime).

[GoalA]:https://github.com/agentsoz/jill/blob/master/jill/src/test/java/io/github/agentsoz/jill/testprogram/GoalA.java
[GoalB]:https://github.com/agentsoz/jill/blob/master/jill/src/test/java/io/github/agentsoz/jill/testprogram/GoalB.java
[GoalC]:https://github.com/agentsoz/jill/blob/master/jill/src/test/java/io/github/agentsoz/jill/testprogram/GoalC.java
[PlanA]:https://github.com/agentsoz/jill/blob/master/jill/src/test/java/io/github/agentsoz/jill/testprogram/PlanA.java
[PlanB]:https://github.com/agentsoz/jill/blob/master/jill/src/test/java/io/github/agentsoz/jill/testprogram/PlanB.java
[PlanC]:https://github.com/agentsoz/jill/blob/master/jill/src/test/java/io/github/agentsoz/jill/testprogram/PlanC.java
[PlanD]:https://github.com/agentsoz/jill/blob/master/jill/src/test/java/io/github/agentsoz/jill/testprogram/PlanD.java

To execute the test with one million BDI agents, use the convinience script [test/testagent.sh](https://github.com/agentsoz/jill/blob/master/test/testagent.sh)  as follows:
```
> ./test/testagent.sh
...
[main] INFO  io.github.agentsoz.jill - Created 1000000 agents in (742 ms)
[main] INFO  io.github.agentsoz.jill - Started 1000000 agents in (623 ms)
[main] INFO  io.github.agentsoz.jill - Finished running 1000000 agents in (3962 ms)
[main] INFO  io.github.agentsoz.jill - Terminated 1000000 agents in (30 ms)
```

That took ~4 seconds to run 1 million agents to completion, not bad!

### 3. Hello Neighbour

This example case is that of an agent ([Greeter.java](https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/greeter/Greeter.java)), who has several neighbours and--feeling rather jovial this bright day--wishes to greet one of them. No one in particular mind you, just someone who is a male. Indeed, there must have been something in the air, because all agents in the example feel exactly the same way.

This crafted scenario is perfect for highlight the use of binding variables in context conditions of plans. Basically what we want is to be able to specify the condition (select a male neighbour) in the context condition, and let Jill give us a binding (such as "Oscar N. Morton") who we can say hello to. (In fact Jill will create one plan instance for each match and which one of those will actually be selected for execution will depend on the `--plan-selection-policy` setting). The function [GreetNeighbour::context()](https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/greeter/GreetNeighbour.java#L45) shows how to specify such a context condition. Internally, this executes as a query on the [belief database of the agent](https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/greeter/Greeter.java#L51) and returns one plan instance for each match (in this case one plan instance per male neighbour). Inside the plan, the match must then be bound to a plan variable so that it can be used inside the plan body. This is done in [GreetNeighbour::setPlanVariables(Map&lt;String, Object&gt; vars)](https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/greeter/GreetNeighbour.java#L55) where the matched neighbours name is saved in a plan variable. (Here `vars` is a list of key-value pairs--the belief database table column names being the keys, and the matched record being the values.) The saved name is then used inside the plan body to [say hello to that neighbour](https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/greeter/GreetNeighbour.java#L70).

The script `./test/greeter.sh` runs this example in various configurations changing the number of agents and the number of neighbours per agent:
```
> ./test/greeter.sh

Running 10000 agents with 5 neighbours each (see greeter-10000a-5b.*)
...
[main] INFO  io.github.agentsoz.jill - Created 10000 agents in (98 ms)
[main] INFO  io.github.agentsoz.jill - Started 10000 agents in (129 ms)
[main] INFO  io.github.agentsoz.jill - Finished running 10000 agents in (119 ms)
[main] INFO  io.github.agentsoz.jill - Terminated 10000 agents in (3 ms)
...
Running 50000 agents with 100 neighbours each (see greeter-50000a-100b.*)
...
[main] INFO  io.github.agentsoz.jill - Created 50000 agents in (214 ms)
[main] INFO  io.github.agentsoz.jill - Started 50000 agents in (2143 ms)
[main] INFO  io.github.agentsoz.jill - Finished running 50000 agents in (604 ms)
[main] INFO  io.github.agentsoz.jill - Terminated 50000 agents in (8 ms)
...
Running 10000 agents with 500 neighbours each (see greeter-10000a-500b.*)
...
[main] INFO  io.github.agentsoz.jill - Created 10000 agents in (111 ms)
[main] INFO  io.github.agentsoz.jill - Started 10000 agents in (2280 ms)
[main] INFO  io.github.agentsoz.jill - Finished running 10000 agents in (679 ms)
[main] INFO  io.github.agentsoz.jill - Terminated 10000 agents in (4 ms)
...
```

### 4. Token Passing

In this setup a group of agents ([TokenAgent2.java](io.github.agentsoz.jill.example.tokenpassing.TokenAgent2)) are connected together in a ring configuration such that each agent can talk to two others, one on either side. The benchmark simply passes a token around in the ring, varying the number of agents and rounds for which the token is passed. The output snippet below is for 10,000 agents passing the token for 100 rounds:

```
> ./test/tokenpassing.sh
...
Running token passing version 2 between 10000 agents for 100 rounds (see tokenpassing2-10000a-100r.*)
...
[main] INFO  io.github.agentsoz.jill - Created 10000 agents in (83 ms)
[main] INFO  io.github.agentsoz.jill - Started 10000 agents in (8 ms)
[main] INFO  io.github.agentsoz.jill - Finished running 10000 agents in (1783 ms)
[main] INFO  io.github.agentsoz.jill - Terminated 10000 agents in (2 ms)
...
```

## Developers

Jill uses Apache Maven (http://maven.apache.org) to manage the build process
and the entire software life cycle.

* To get started with Maven see:
  http://maven.apache.org/guides/getting-started/.

* For an introduction to the Maven build lifecycle see:
  https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html

* To checkout the latest sources, do:
  `git clone https://github.com/agentsoz/jill.git`

* To build, test (unit tests), and install (locally), do:
  `mvn clean install`

* To build the source and Javadoc archives, do:
  `mvn source:jar javadoc:jar`

* For quality assurance, we use the PMD static code checker with copy
  paste duplication checking enabled <https://pmd.github.io/>,  the Checkstyle
  java code style checker for compliance with Google code style
  <http://checkstyle.sourceforge.net/>, and the JaCoCo java code coverage
  checker with minimum coverage targets <http://www.jacoco.org>.
  The Maven build will fail if the code is non-compliant with the above.
  To temporarily disable the checks, use the following build command:
  `mvn clean install -Dpmd.skip=true -Dcpd.skip=true -Dcheckstyle.skip=true -Djacoco.skip=true`

* All development is carried out on the `dev` branch. Code contributions should
  be made on new branches off `dev` by submitting a pull request. For more
  information on this Git workflow see
  <http://nvie.com/posts/a-successful-git-branching-model/>.



## License

Jill Cognitive Agents Project
Copyright (C) 2014 - 2019 by its authors. See AUTHORS file.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Lesser Public
License along with this program.  If not, see
<http://www.gnu.org/licenses/lgpl-3.0.html>.

## Contact
Dhirendra Singh &lt;<dhi.singh@gmail.com>&gt;
