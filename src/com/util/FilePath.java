package com.util;

public class FilePath {
	static String resultFilePath = "result/0.txt";
	

//	private static final String baseFilePath = "case_example/0 初级/case";
//	private static final String baseFilePath = "case_example/1 中级/case";
	
	
	private static final String baseFilePath = "case_example/2 高级/case";

	
	// middle 一般跑20s左右
	// 12141
	//static String graphFilePath = "case_example/0 初级/case0.txt";
	
	// 11472 
	//static String graphFilePath = "case_example/0 初级/case1.txt";
	// 12595
	// static String graphFilePath = "case_example/0 初级/case2.txt";
	// 11222 
	// static String graphFilePath = "case_example/0 初级/case3.txt";
	// 11936
	// static String graphFilePath = "case_example/0 初级/case4.txt";
	// 11976
	// static String graphFilePath = "case_example/0 初级/case5.txt";
	// 11765
	// static String graphFilePath = "case_example/0 初级/case6.txt";
	// 12186
	// static String graphFilePath = "case_example/0 初级/case7.txt";
	// 14334
	// static String graphFilePath = "case_example/0 初级/case8.txt";
	
	// random+middle 跑 85s k=consumerNum updateNum = [6,9] maxMovePerRound = 2000
	// 27297
	// static String graphFilePath = "case_example/1 中级/case0.txt";
	// 26314
	// static String graphFilePath = "case_example/1 中级/case1.txt";
	// 26626
	// static String graphFilePath = "case_example/1 中级/case2.txt";
	// 27200
	// static String graphFilePath = "case_example/1 中级/case3.txt";
	// 28359
	// static String graphFilePath = "case_example/1 中级/case4.txt";
	// 27121
	// static String graphFilePath = "case_example/1 中级/case5.txt";
	// 28589 (原来 28484)
	// static String graphFilePath = "case_example/1 中级/case6.txt";
	// 28394
	// static String graphFilePath = "case_example/1 中级/case7.txt";
	// 27539
	// static String graphFilePath = "case_example/1 中级/case8.txt";

	
	// random 跑 85s k=1 updateNum = [3,6]
	// 38452 38767
	// static String graphFilePath = "case_example/2 高级/case0.txt";
	// 36233 35987
	//static String graphFilePath = "case_example/2 高级/case1.txt";
	// 38418 37372
	// static String graphFilePath = "case_example/2 高级/case2.txt";
	// 41737 40282
	// static String graphFilePath = "case_example/2 高级/case3.txt";
	// 37834 37667
	// static String graphFilePath = "case_example/2 高级/case4.txt";
	// 37861 36891
	// static String graphFilePath = "case_example/2 高级/case5.txt";
	// 35188
	// static String graphFilePath = "case_example/2 高级/case6.txt";
	// 40032
	// static String graphFilePath = "case_example/2 高级/case7.txt";
	// 37251
	// static String graphFilePath = "case_example/2 高级/case8.txt";
	
	
	
	// random 跑一次 k=1 updateNum = [3,6]
	// 112745
	// static String graphFilePath = "case_example/2 高级/case0.txt";
	// 118123
	// static String graphFilePath = "case_example/2 高级/case1.txt";
	
	
	// 116324 
    //static String graphFilePath = "case_example/2 高级/case2.txt";
	//  106129
	// 112101 
static String graphFilePath = "case_example/2 高级/case3.txt";
	
	
	// 38373 38074 37829
	//static String graphFilePath = "case_example/2 高级/case4.txt";
	// 42004 37732 38663
	// static String graphFilePath = "case_example/2 高级/case5.txt";
	// 36292 36292 35286
	// static String graphFilePath = "case_example/2 高级/case6.txt";
	// 41830 41106 40920
	// static String graphFilePath = "case_example/2 高级/case7.txt";
	// 37536 37822 37574
	// static String graphFilePath = "case_example/2 高级/case8.txt";

//	static String graphFilePath = baseFilePath+"1.txt";
//	static String graphFilePath = baseFilePath+"2.txt";
//	static String graphFilePath = baseFilePath+"3.txt";
//	static String graphFilePath = baseFilePath+"4.txt";
//	static String graphFilePath = baseFilePath+"5.txt";
//	static String graphFilePath = baseFilePath+"6.txt";
//	static String graphFilePath = baseFilePath+"7.txt";
//	static String graphFilePath = baseFilePath+"8.txt";

//	static String graphFilePath = "case_example/官网案例.txt";
//	static String graphFilePath = "case_example/case0.txt";
//	static String graphFilePath = "case_example/case1.txt";
//	static String graphFilePath = "case_example/case2.txt";
// static String graphFilePath = "case_example/case3.txt";
//	static String graphFilePath = "case_example/case4.txt";
//	static String graphFilePath = "case_example/case50.txt";

	// 155017
	// 166579
	// static String graphFilePath = "case_example/case99.txt";

	// 官网案例     :  783
	// case 0 : 2042
	// case 1 : 2136
	// case 2 : 1692
	// case 3 : 2111
	// case 4 : 1967 
	
	// ? case 50 : 13209 / 13706
	// 最小费用：12884 
	// 服务器结点: 5, 11, 23, 45, 52, 56, 58, 61, 62, 65, 75, 89, 98, 113, 118, 136, 180, 192, 288, 
	//          5, 11, 23, 45, 52, 56, 58, 61, 62, 65, 75, 89, 98, 113, 118, 136, 180, 192, 288, 
	         // 5, 11, 23, 45, 52, 56, 58, 61, 62, 65, 75, 89, 98, 113, 118, 136, 138, 180, 192, 288, 
	// use:16319
	
	// case 99
	// 最优解：总的费用：610563
	
	// 80s
	// 总的费用：571604
	
	// TODO
	// MCMF优化？
	// 1 加上Complex?
	// 2 其他用例测试
	// 3  寻路过程中也可以利用缓存提前结束
	
	// 21920 41574 9万以下
	
//	分割子网（不建议，类似误差累积）
//	实现细节（可以再抠一下）
//	运筹学（不知道啥东东，说不定可以借鉴一下）
//	数学归纳（从初始解类推）
//	动态规划（复用思想）
//	在一些假设下（利用网络本身信息）
	
	// TODO 
	// 1   考虑如何选择节点的度等因素，给选择的节点排一个序?
	// 2 mcmf等算法优化
	// 3   服务器费用调高后的效果
	
	 
	 // 40214
	 // 13 s 520 ms.
	
}
