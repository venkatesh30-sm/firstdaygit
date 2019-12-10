
public class  Desktop implements Software,HardWare {

	@Override
	public void hadwareResource() {
		System.out.println("hardware");
		}
     @Override
	public void softwareResource() {
		System.out.println("software");
		}
	public void desktopModel() {
		System.out.println("desktop");
			}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopModel();
	d.hadwareResource();
	d.softwareResource();
}
}
