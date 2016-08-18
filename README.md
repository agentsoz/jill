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
  ground-up to handle millions of BDI agents (see [Benchmarks](#benchmarks)). 

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


## Benchmarks


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

