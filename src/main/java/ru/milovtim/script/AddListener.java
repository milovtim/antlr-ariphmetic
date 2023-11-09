package ru.milovtim.script;


public class AddListener extends arithmeticBaseListener {
    @Override
    public void enterExpression(arithmeticParser.ExpressionContext ctx) {
        System.out.println(ctx);
    }
}
