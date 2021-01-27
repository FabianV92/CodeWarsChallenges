package com.company;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
//Kyu(3)
//Create a simple calculator that given a string of operators (), +, -, *, /
// and numbers separated by spaces returns the value of that expression
public class Calculator {
    public static Double evaluate(String expression) {

        ScriptEngineManager s = new ScriptEngineManager();
        ScriptEngine engine = s.getEngineByName("JavaScript");
        try {
        Double result = new Double((engine.eval(expression).toString()));
            return result;
        }
        catch (javax.script.ScriptException e) {
            e.printStackTrace();
            return 0.0;
        }
    }
    public static void main(String[] args) {
        System.out.println(evaluate("2 / 2 + 3 * 4 - 6")); // => 7.0
    }

}

