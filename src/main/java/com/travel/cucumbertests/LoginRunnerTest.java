package com.travel.cucumbertests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue="com.travel.file")
public class LoginRunnerTest 
{

}
