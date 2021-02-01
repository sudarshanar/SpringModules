package com.spring.qualifier;

import java.util.List;
import java.util.Map;

public class Fruit {
	private List<String> fruitName;
	private Map<String, String> fruitNameMap;

	public Fruit() {

	}

	public List<String> getFruitName() {
		return fruitName;
	}

	public void setFruitName(List<String> fruitName) {
		this.fruitName = fruitName;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}

	public Fruit(List<String> fruitName, Map<String, String> fruitNameMap) {
		super();
		this.fruitName = fruitName;
		this.fruitNameMap = fruitNameMap;
	}

	public void display() {
		System.out.println("FruitNames List");
		fruitName.stream().forEach(System.out::println);
		System.out.println("FruitNames Map");
		fruitNameMap.entrySet().stream()
				.forEach(entrySet -> System.out.println(entrySet.getKey() + " : " + entrySet.getValue()));
	}

}