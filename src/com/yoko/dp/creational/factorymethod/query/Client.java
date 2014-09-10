package com.yoko.dp.creational.factorymethod.query;


public class Client {
	
    private static QueryRunner runner;

    public static void main(String[] args) throws Exception {
		runner = new SybaseQueryRunner();
        runner.run();
    }

}
