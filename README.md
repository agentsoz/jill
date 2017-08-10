# Jill

* [About](#about)
* [Releases](#releases)
* [Benchmarks and Examples](#benchmarks-and-examples)
  * [The Towers of Hanoi](#1-the-towers-of-hanoi)
  * [One Million BDI Agents](#2-one-million-bdi-agents)
  * [Hello Neighbour](#3-hello-neighbour)
  * [Token Passing](#4-token-passing)
* [Developers](#developers)
* [License](#license)


## About

Jill is an open source initiate to deliver a fast and lightweight
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

The latest stable release as well as all previous releases are available at:
https://github.com/agentsoz/jill/releases


## Benchmarks and Examples

### 1. The Towers of Hanoi

A solution for the classic [towers of hanoi puzzle](https://en.wikipedia.org/wiki/Tower_of_Hanoi) is available in the examples directory (see [hanoi player](https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/hanoi/Player.java)). The goal is to move a stack of discs from the Pin0 (the first pin) to Pin3 (the third pin).

The hanoi player can be run using the convinience script [test/hanoi.sh](https://github.com/agentsoz/jill/blob/master/test/hanoi.sh) which solves the problem for 15 discs by default:
```
> ./test/hanoi.sh
...
Solving Towers of Hanoi with 15 discs (see ./test/hanoi.out)
Started at  Fri Aug 19 09:46:58 AEST 2016
java -cp ./test/../jill/target/jill-0.3.1-SNAPSHOT-jar-with-dependencies.jar:./test/../examples/target/jill-examples-0.3.1-SNAPSHOT.jar io.github.agentsoz.jill.Main --config "{ programOutputFile : \"./test/hanoi.out\", logFile : \"./test/hanoi.log\", logLevel : \"INFO\", agents: [ { classname : io.github.agentsoz.jill.example.hanoi.Player, args : [-discs, 15], count: 1 } ] }"
Finished at Fri Aug 19 09:46:59 AEST 2016
```

*Note: The script assumes that the JARs have been built from sources, so if you have instead downloaded the release JARs, then the paths in the command above will need to be adjusted.*

The output of the run, i.e., the solution, is written to `./test/hanoi.out`:
```
> head -4 ./test/hanoi.out 
Initialised hanoi board with 15 discs:
|15|14|13|12|11|10|9|8|7|6|5|4|3|2|1
|
|
> tail -10 test/hanoi.out
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

To get an idea about performance, such as how long it took to solve the puzzle and in how many moves, we can look at the generated log file in `./test/hanoi.log`:
```
> grep -i finished test/hanoi.log 
Finished running 1 agents in 1267 ms
> grep Moving test/hanoi.out | wc -l
32767
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
Started at  Fri Aug 19 11:20:24 AEST 2016
java -Xmx2g -Xms2g -cp ./../jill/target/jill-0.3.1-SNAPSHOT-jar-with-dependencies.jar:./../examples/target/jill-examples-0.3.1-SNAPSHOT.jar:./../jill/target/test-classes io.github.agentsoz.jill.Main --config "{ programOutputFile : \"./testagent-1000000.out\", logFile : \"./testagent-1000000.log\", logLevel : \"INFO\", agents: [ { classname : io.github.agentsoz.jill.testprogram.TestAgent, args : [\"\"], count: 1000000 } ] }"
Finished at Fri Aug 19 11:20:34 AEST 2016
```
That took only 10 seconds, nice! To get a better idea of the performance, you can query the log file `./test/testagent-1000000.log`:
```
> grep 1000000 ./test/testagent-1000000.log 
Created 1000000 agents in 724 ms
Started 1000000 agents in 800 ms
Finished running 1000000 agents in 8041 ms
Terminated 1000000 agents in 24 ms
```

### 3. Hello Neighbour

This example case is that of an agent ([Greeter.java] (https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/greeter/Greeter.java)), who has several neighbours and--feeling rather jovial this bright day--wishes to greet one of them. No one in particular mind you, just someone who is a male. Indeed, there must have been something in the air, because all agents in the example feel exactly the same way.

This crafted scenario is perfect for highlight the use of binding variables in context conditions of plans. Basically what we want is to be able to specify the condition (select a male neighbour) in the context condition, and let Jill give us a binding (such as "Oscar N. Morton") who we can say hello to. (In fact Jill will create one plan instance for each match and which one of those will actually be selected for execution will depend on the `--plan-selection-policy` setting). The function [GreetNeighbour::context()](https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/greeter/GreetNeighbour.java#L45) shows how to specify such a context condition. Internally, this executes as a query on the [belief database of the agent] (https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/greeter/Greeter.java#L51) and returns one plan instance for each match (in this case one plan instance per male neighbour). Inside the plan, the match must then be bound to a plan variable so that it can be used inside the plan body. This is done in [GreetNeighbour::setPlanVariables(HashMap<String, Object> vars)] (https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/greeter/GreetNeighbour.java#L55) where the matched neighbours name is saved in a plan variable. (Here `vars` is a list of key-value pairs--the belief database table column names being the keys, and the matched record being the values.) The saved name is then used inside the plan body to [say hello to that neighbour] (https://github.com/agentsoz/jill/blob/master/examples/src/main/java/io/github/agentsoz/jill/example/greeter/GreetNeighbour.java#L70).

The script `./test/greeter.sh` runs this example in various configurations changing the number of agents and the number of neighbours per agent:
```
> ./test/greeter.sh 
Running 10000 agents with 5 neighbours each (see greeter-10000a-5b.*)
Started at  Fri Aug 19 12:26:14 AEST 2016
java -cp ./test/../jill/target/jill-0.3.1-SNAPSHOT-jar-with-dependencies.jar:./test/../examples/target/jill-examples-0.3.1-SNAPSHOT.jar io.github.agentsoz.jill.Main --plan-selection-policy FIRST --config "{ programOutputFile : \"./test/greeter-10000a-5b.out\", logFile : \"./test/greeter-10000a-5b.log\", logLevel : \"INFO\", agents: [ { classname : io.github.agentsoz.jill.example.greeter.Greeter, args : [-neighbourhoodSize, 5], count: 10000 } ] }"
Finished at Fri Aug 19 12:26:15 AEST 2016

Running 50000 agents with 100 neighbours each (see greeter-50000a-100b.*)
Started at  Fri Aug 19 12:26:15 AEST 2016
java -cp ./test/../jill/target/jill-0.3.1-SNAPSHOT-jar-with-dependencies.jar:./test/../examples/target/jill-examples-0.3.1-SNAPSHOT.jar io.github.agentsoz.jill.Main --plan-selection-policy FIRST --config "{ programOutputFile : \"./test/greeter-50000a-100b.out\", logFile : \"./test/greeter-50000a-100b.log\", logLevel : \"INFO\", agents: [ { classname : io.github.agentsoz.jill.example.greeter.Greeter, args : [-neighbourhoodSize, 100], count: 50000 } ] }"
Finished at Fri Aug 19 12:26:20 AEST 2016

Running 10000 agents with 500 neighbours each (see greeter-10000a-500b.*)
Started at  Fri Aug 19 12:26:20 AEST 2016
java -cp ./test/../jill/target/jill-0.3.1-SNAPSHOT-jar-with-dependencies.jar:./test/../examples/target/jill-examples-0.3.1-SNAPSHOT.jar io.github.agentsoz.jill.Main --plan-selection-policy FIRST --config "{ programOutputFile : \"./test/greeter-10000a-500b.out\", logFile : \"./test/greeter-10000a-500b.log\", logLevel : \"INFO\", agents: [ { classname : io.github.agentsoz.jill.example.greeter.Greeter, args : [-neighbourhoodSize, 500], count: 10000 } ] }"
Finished at Fri Aug 19 12:26:23 AEST 2016
```
To see how long the test with 10,000 agents, each with 5 neighbours, took:
```
> grep 10000 test/greeter-10000a-5b.log
Created 10000 agents in 62 ms
Started 10000 agents in 237 ms
Finished running 10000 agents in 394 ms
Terminated 10000 agents in 5 ms
```

### 4. Token Passing

In this setup a group of agents are connected together in a ring configuration such that each agent can talk to two others, one on either side. The benchmark simply passes a token around in the ring, varying the number of agents and rounds for which the token is passed. Below we explore the result for 10,000 agents passing the token for 100 rounds: 

```
> ./test/tokenpassing.sh 
...
Running token passing version 1 between 10000 agents for 100 rounds (see tokenpassing1-10000a-100r.*)
Started at  Fri Aug 19 13:00:54 AEST 2016
java -cp ./test/../jill/target/jill-0.3.1-SNAPSHOT-jar-with-dependencies.jar:./test/../examples/target/jill-examples-0.3.1-SNAPSHOT.jar io.github.agentsoz.jill.Main --config "{ programOutputFile : \"./test/tokenpassing-results/tokenpassing1-10000a-100r.out\", logFile : \"./test/tokenpassing-results/tokenpassing1-10000a-100r.log\", logLevel : \"INFO\", agents: [ { classname : io.github.agentsoz.jill.example.tokenpassing.TokenAgent1, args : [-rounds, 100], count: 10000 } ] }"
Finished at Fri Aug 19 13:01:01 AEST 2016
...
> grep 10000 test/tokenpassing-results/tokenpassing1-10000a-100r.log
Created 10000 agents in 72 ms
Started 10000 agents in 11 ms
Finished running 10000 agents in 6446 ms
Terminated 10000 agents in 4 ms

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
Copyright (C) 2014 - 2016 by its authors. See AUTHORS file.

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

Contact: Dhirendra Singh <dhi.singh@gmail.com>

