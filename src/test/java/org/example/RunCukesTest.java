package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        tags = "@delete")
public class RunCukesTest {
}

// UI Framework
// pom.xml - Add dependancy, mavens plugins, cucumber for java plugins
// driver - to related to driver maanger
// page - locators and actions
// step def - link features, call the action methods, assertion
// feature - scenarios
// hooks - before and after tests
// Runcukes - to run the test and report

// API Framework
// pom .xml - rest assured, JUnit, cucumber, hemcrest
// services - 5 curd opeartoes - GET POST PUT DELETE PATCH
// step def - call the action and assertion
// feature - scenario of API
// RunCukes - to run
