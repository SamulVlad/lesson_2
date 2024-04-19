package com.samul.javaсorelessons.lesson2;

/*
	4. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока в m больших
	бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
	80/n – в 1 малом бидоне
	80/n+12 – молока в одном большом бидоне
	(80/n+12)*m – молока в m больших бидонах */
public class SelfStudyTask4 {

	public static void main(String[] args) {
		
		int n = 9, m = 5;
		double res;
		
		res = (80.0 / n + 12) * m;
		
		System.out.println("res = " + res);

	}

}
