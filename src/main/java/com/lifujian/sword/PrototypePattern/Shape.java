package com.lifujian.sword.PrototypePattern;

public abstract class Shape implements Cloneable {

	private String id;
	protected String type;

	abstract void draw();

	public String getType(){
		return type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//这里重写的一个重要原因是扩大访问修饰的权限，另一个是可以添加一些深度拷贝的操作。
	//而且不要忘记需要实现Cloneable接口，因为不实现该接口，在调用该方法时会报cloneNoSupportException
	//一个常识，方法的重写中，一定是在继承中出现，子类权限修饰符必须不小于父类的权限修饰符。
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}