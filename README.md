# Jill


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

### The Towers of Hanoi

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

### One million BDI agents

This test executes one million relatively complex BDI agents (see [TestAgent.java](https://github.com/agentsoz/jill/blob/master/jill/src/test/java/io/github/agentsoz/jill/testprogram/TestAgent.java)). Each agent has a goal-plan hierarchy as follows:
```
            GoalA
              |
      PlanA-------PlanD
        |
    .-------.
    |       |
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

