package org.mavenclass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
validate - validate the project is correct and all necessary information is available.

compile - compile the source code of the project.

test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed.

package - take the compiled code and package it in its distributable format, such as a JAR.

verify - run any checks on results of integration tests to ensure quality criteria are met

install - install the package into the local repository, for use as a dependency in other projects locally

deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.
*/
public class StartMaven {
    private static final Logger logger= LoggerFactory.getLogger(StartMaven.class);
    public static void main(String[] args) {
        System.out.println("Helo Maven...initial project set up..");
        logger.info("mvn info");
        logger.debug("mvn debug");
    }
}
