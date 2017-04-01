package springido;

public class Stage {
	private Stage(){}
	private static class StageSingletonHolder{
		static Stage instance = new Stage(); // 延迟加载实例
	}
	public static Stage getInstance(){
		return StageSingletonHolder.instance; //返回实例
	}
	
	public void ShowStage(){
		System.out.println("Show Stage");
	}
}
